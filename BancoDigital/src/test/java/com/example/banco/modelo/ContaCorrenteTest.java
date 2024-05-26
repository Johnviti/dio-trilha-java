package com.example.banco.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.banco.servico.ContaServico;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

    @Test
    public void testSaque() {
        Cliente cliente = new Cliente("João");
        
        Banco banco = new Banco("Banco Teste");
        
        ContaServico contaServico = new ContaServico(banco);
        IConta conta = contaServico.criarContaCorrente(cliente);
        
        contaServico.depositar(conta, 100.0);
        contaServico.sacar(conta, 50.0);
        
        assertEquals(50.0, conta.getSaldo());
    }

    @Test
    public void testDeposito() {
        
        Cliente cliente = new Cliente("Zeca");
        Banco banco = new Banco("Banco Teste");
        
        ContaServico contaServico = new ContaServico(banco);
        IConta conta = contaServico.criarContaCorrente(cliente);
        
        contaServico.depositar(conta, 100.0);
        
        assertEquals(100.0, conta.getSaldo());
    }
}
