package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade){
        pessoas.add(new Pessoa(nome, idade));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        return pessoasOrdenadasPorAltura;
    }

    public void imprimirPessoas(){
        pessoas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        ordenacao.adicionarPessoa("Maria", 30);
        ordenacao.adicionarPessoa("João", 25);
        ordenacao.adicionarPessoa("Ana", 35);
        ordenacao.adicionarPessoa("Pedro", 20);
        ordenacao.imprimirPessoas();
        System.out.println("Ordenado por idade:");
        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println("Ordenado por altura:");
        System.out.println(ordenacao.ordenarPorAltura());
    }
}
