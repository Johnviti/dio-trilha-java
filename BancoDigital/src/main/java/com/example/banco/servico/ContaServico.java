package com.example.banco.servico;

import com.example.banco.modelo.Banco;
import com.example.banco.modelo.Cliente;
import com.example.banco.modelo.Conta;
import com.example.banco.modelo.ContaCorrente;

public class ContaServico {
    private Banco banco;

    public ContaServico(Banco banco) {
        this.banco = banco;
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente);
        banco.adicionarConta(conta);
        return conta;
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        contaOrigem.transferir(valor, contaDestino);
    }

    public void imprimirSaldo(Conta conta) {
        System.out.println(String.format("Saldo atual: %.2f", conta.getSaldo()));
    }

    public void imprimirExtrato(Conta conta) {
        conta.imprimirExtrato();
    }
}
