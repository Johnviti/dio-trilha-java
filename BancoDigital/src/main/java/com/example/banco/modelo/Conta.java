package com.example.banco.modelo;
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

    @Override
    public void saldo() {
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void saque(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
    }

    @Override
    public void deposito(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    @Override
    public void transferencia(double valor, IConta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de transferência deve ser positivo.");
        }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        contaDestino.deposito(valor);
        System.out.println("Transferência realizada com sucesso.");
    }

    public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}