
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();
        cp.adicionarProduto(1, "Produto 1", 10.0, 5);
        cp.adicionarProduto(2, "Produto 3", 20.0, 10);
        cp.adicionarProduto(3, "Produto 2", 30.0, 15);
        cp.adicionarProduto(4, "Produto 4", 40.0, 20);
        cp.adicionarProduto(1, "Produto 1", 30.0, 5);
        System.out.println(cp.produtos);
        System.out.println(cp.exibirProdutosPorNome());
    }
}
