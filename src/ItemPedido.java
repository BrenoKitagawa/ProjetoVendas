import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
    private Pedido pedido;
    private Produto produto;
    private double precoPagar;
    private int quantidade;
    private int numPedido;
    
    
    
    public ItemPedido() {
		// TODO Auto-generated constructor stub
	}

    public ItemPedido(Pedido pedido, Produto produto, double precoPagar, int quantidade,int numPedido) {
		super();
		this.pedido = pedido;
		this.produto = produto;
		this.precoPagar = precoPagar;
		this.quantidade = quantidade;
		this.numPedido=numPedido;
	}

	public boolean ItensPedido(Pedido pedido, Produto produto,int quantidade, double precoPagar ) {
        if(produto.getQuantidadeProduto() > quantidade){
            this.setQuantidade(quantidade);
            this.setPrecoPagar(precoPagar);
            this.produto = produto;
            this.pedido = pedido;
            produto.setQuantidadeProduto(produto.getQuantidadeProduto() - this.getQuantidade());
            return true;
        }else {
            return false;
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoPagar() {
        return precoPagar;
    }

    public void setPrecoPagar(double precoPagar) {
        this.precoPagar = precoPagar;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}


	public void mostrarItemPedido(){
		System.out.println("------------------------");
        this.pedido.mostrarPedido();
        System.out.println("Pedido: " + numPedido);
        System.out.println("Produto:" + this.produto.getNomeProduto());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Preço:" + this.getPrecoPagar());
    }
}
