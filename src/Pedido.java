import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> sla = new ArrayList();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    public void adicionarSla(ItemPedido sla) {
    	this.sla.add(sla);
    }
    
    

	public List<ItemPedido> getSla() {
		return sla;
	}

	public void setSla(List<ItemPedido> sla) {
		this.sla = sla;
	}
	
	
	public void cancelarPedido(int numPedido) {
	    boolean pedidoEncontrado = false;

	
	    Iterator<ItemPedido> iterator = sla.iterator();

	    while (iterator.hasNext()) {
	        ItemPedido item = iterator.next(); 

	        if (item.getNumPedido() == numPedido) {

	            int novaQuantidade = item.getProduto().getQuantidadeProduto() + item.getQuantidade();
	            item.getProduto().setQuantidadeProduto(novaQuantidade);


	            iterator.remove();
	            System.out.println("Pedido número: " + numPedido + " removido com sucesso!");
	            pedidoEncontrado = true;
	        }
	    }

	    if (!pedidoEncontrado) {
	        System.out.println("Nenhum pedido encontrado com o número: " + numPedido);
	    }
	}

	

	public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNome());
      
    }
}
