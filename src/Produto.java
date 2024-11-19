import java.util.ArrayList;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private int id;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Produto() {
    }

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto,int id) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.id=id;
        }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public void adcionarProdutos(Produto pro) {
    	produtos.add(pro);
    	
    }
    

    public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	
	public int getId() {
		return id;
	}
	
	
	public boolean error(int index,int quantidade) {
		for(int i = 0 ; i < produtos.size();i++) {
			if(produtos.get(i).getId() == index) {
				if(produtos.get(i).getQuantidadeProduto() >= quantidade) {
					System.out.println("Pedido feito com sucesso");
					int novaQuantidade = produtos.get(i).getQuantidadeProduto() - quantidade;
					produtos.get(i).setQuantidadeProduto(novaQuantidade) ;
					return true;
				}else {
					System.out.println("ERROR : Pedido acima da quantidade atual no estoque");
					
					return false;
				}
			};
		}
		return false;
	}

	
	
	   
    public Produto retornaProduto(int id) {
    	
    	for(int i = 0 ; i < produtos.size() ; i++) {
    		
    		if(produtos.get(i).getId() == id) {
    			return produtos.get(i);
    		}
    		
    	}
    	return null;
    }


	public void mostrarProduto() {
    	System.out.println("id: "+ getId());
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Preço Produto: " + getPrecoProduto());
        System.out.println("Quantidade: " + getQuantidadeProduto());
    }
	
}
