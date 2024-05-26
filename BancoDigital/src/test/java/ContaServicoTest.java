package com.example.banco.servico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.banco.modelo.Banco;
import com.example.banco.modelo.Cliente;
import com.example.banco.modelo.Conta;
import com.example.banco.modelo.ContaCorrente;

public class ContaServicoTest {

    @Test
    public void testCriarContaCorrente() {
        Banco banco = new Banco("Banco Teste");
        ContaServico contaServico = new ContaServico(banco);
        Cliente cliente = new Cliente("Maria");
        Conta conta = contaServico.criarContaCorrente(cliente);

        assertNotNull(conta);
        assertEquals(cliente, conta.getCliente());
        assertEquals(1, banco.getContas().size());
    }

    @Test
    public void testDepositar() {
        Banco banco = new Banco("Banco Teste");
        ContaServico contaServico = new ContaServico(banco);
        Cliente cliente = new Cliente("Maria");
        Conta conta = contaServico.criarContaCorrente(cliente);
        contaServico.depositar(conta, 200.0);

        assertEquals(200.0, conta.getSaldo());
    }

    @Test
    public void testTransferir() {
        Banco banco = new Banco("Banco Teste");
        ContaServico contaServico = new ContaServico(banco);
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("João");
        Conta conta1 = contaServico.criarContaCorrente(cliente1);
        Conta conta2 = contaServico.criarContaCorrente(cliente2);
        contaServico.depositar(conta1, 300.0);
        
        contaServico.transferir(conta1, conta2, 100.0);

        assertEquals(200.0, conta1.getSaldo());
        assertEquals(100.0, conta2.getSaldo());
    }
}
