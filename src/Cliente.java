import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> pedido;
    
    private static List<Cliente> cliente = new ArrayList<>();
    
    public Cliente(String nome,String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = new ArrayList<>();
    }

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static boolean acharCpf(String cpf) {
        for (Cliente cli : cliente) {
            if (cli.getCpf().equals(cpf)) {
                return false;
            }
        }
        return true;
    }

    public void adicionarPedido(Pedido pe) {
        pedido.add(pe);
    }

    public void mostraCliente(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }
    
    
    public Cliente retornaCliente(String cpf) {
    	
    	for(int i = 0 ; i < cliente.size() ; i++) {
    		
    		if(cliente.get(i).getCpf().equals(cpf)) {
    			return cliente.get(i);
    		}
    		
    	}
    	return null;
    }
    
    
    public void adicionarCliente(Cliente cli) {

    	cliente.add(cli);
    }
}
