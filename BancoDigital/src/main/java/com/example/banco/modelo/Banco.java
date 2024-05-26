package com.example.banco.modelo;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        setNome(nome);
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do banco não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}
