package com.example.banco.modelo;

public interface IConta {
    
    void saldo();
    void saque(double valor);
    void deposito(double valor);
    void transferencia(double valor, IConta contaDestino);
    void extrato();
    
}

