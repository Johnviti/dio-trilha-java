package com.example.banco.servico;

import com.example.banco.modelo.Banco;
import com.example.banco.modelo.Cliente;
import com.example.banco.modelo.Conta;
import com.example.banco.modelo.ContaCorrente;
import com.example.banco.modelo.IConta;

public class ContaServico {
    private Banco banco;

    public ContaServico(Banco banco) {
        this.banco = banco;
    }

    public IConta criarContaCorrente(Cliente cliente) {
        IConta conta = new ContaCorrente(cliente);
        banco.getContas().add((Conta) conta);
        return conta;
    }

    // public Iconta criarContaPoupanca(Cliente cliente) {
    //     IConta conta = new ContaPoupanca(cliente);
    //     banco.getContas().add((Conta) conta);
    //     return conta;
    // }

    public void depositar(IConta conta, double valor) {
        conta.deposito(valor);
    }

    public void sacar(IConta conta, double valor) {
        conta.saque(valor);
    }

    public void transferir(IConta contaOrigem, IConta contaDestino, double valor) {
        contaOrigem.transferencia(valor, contaDestino);
    }

    public void imprimirExtrato(IConta conta) {
        conta.extrato();
    }
}
