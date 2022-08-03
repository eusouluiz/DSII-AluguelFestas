package projetods;

public abstract class Clientes implements DAO {
    private static int idCount = 0;
    private String nomeCliente;
    private int codCliente;
    private String telCliente;
    private Endereco endCliente;
    
    public Clientes(String nomeCliente, String telCliente, Endereco endCliente) {
	this.nomeCliente = nomeCliente;
        idCount++;
        codCliente = idCount;
        this.telCliente = telCliente;
        this.endCliente = endCliente;
    }
    
    public Clientes() {
	this.endCliente = new Endereco();
	idCount++;
	codCliente = idCount;
    }

    public static int getIdCount() {
	return idCount;
    }
    
    public static void incrementIdCount() {
	Clientes.idCount++;
    }

    public static void setIdCount(int idCount) {
	Clientes.idCount = idCount;
    }

    public void setEndCliente(Endereco endCliente) {
	this.endCliente = endCliente;
    }

    public Endereco getEndCliente() {
	return endCliente;
    }
    
    public String getNomeCliente() {
	    return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
	    this.nomeCliente = nomeCliente;
    }
    public int getCodCliente() {
	    return codCliente;
    }
    public void setCodCliente(int codCliente) {
	    this.codCliente = codCliente;
    }
    public String getTelCliente() {
	    return telCliente;
    }
    public void setTelCliente(String telCliente) {
	    this.telCliente = telCliente;
    }

}
