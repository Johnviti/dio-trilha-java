package com.example.banco.modelo;

public class Cliente {
    private String nome;

	public Cliente(String nome) {
        setNome(nome);
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }
}
