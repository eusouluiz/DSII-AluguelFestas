package projetods;

import java.util.Scanner;

public class ClienteEmpresaPrivada extends Clientes {

    //private String nomeCliente; -> VEM DE CLIENTE
    //private int codCliente;     -> VEM DE CLIENTE
    //private String telCliente;  -> VEM DE CLIENTE
    private String cnpj;

    public ClienteEmpresaPrivada(String nomeCliente, String telCliente, String cnpj, Endereco endCliente) {
        super(nomeCliente,telCliente, endCliente);
        this.cnpj = cnpj;
    }
    
    public ClienteEmpresaPrivada() {
	super();
    }

    public String getCnpj() {
	    return cnpj;
    }

    public void setCnpj(String cnpj) {
	    this.cnpj = cnpj;
    }

    @Override
    public void inserirDados(Scanner kb) {
	System.out.println("");
	System.out.println(" -x- Cadastro de Cliente Empresa Privada -x- ");
	System.out.print("Nome: ");
	this.setNomeCliente(kb.nextLine());
	System.out.print("Telefone: ");
	this.setTelCliente(kb.nextLine());
	System.out.print("CNPJ: ");
	this.setCnpj(kb.nextLine());
	this.getEndCliente().inserirDados(kb);
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("");
	System.out.println("Cliente " + this.getCodCliente());
	System.out.println("Nome: " + this.getNomeCliente());
	System.out.println("CNPJ: " + this.getCnpj());
	System.out.println("Telefone: " + this.getTelCliente());
	this.getEndCliente().listarDadosCompletos();
    }

    @Override
    public String toString() {
	return (this.getCodCliente()+ " - " + this.getNomeCliente()+ " | " + this.getCnpj() + "\n");
    }
}
