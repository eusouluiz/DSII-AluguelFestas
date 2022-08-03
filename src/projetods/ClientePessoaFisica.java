package projetods;

import java.util.Scanner;

public class ClientePessoaFisica extends Clientes {

    //private String nomeCliente; -> VEM DE CLIENTE
    //private int codCliente;     -> VEM DE CLIENTE
    //private String telCliente;  -> VEM DE CLIENTE
    private String cpf;
    
    public ClientePessoaFisica(String nomeCliente, String telCliente, String cpf, Endereco endCliente){
	super(nomeCliente, telCliente, endCliente);
        this.cpf = cpf;
    }

    public ClientePessoaFisica(){
	super();
    }

    public String getCpf() {
	    return cpf;
    }

    public void setCpf(String cpf) {
	    this.cpf = cpf;
    }

    @Override
    public void inserirDados(Scanner kb) {
	System.out.println("");
	System.out.println(" -x- Cadastro de Cliente Pessoa Física -x- ");
	System.out.print("Nome: ");
	this.setNomeCliente(kb.nextLine());
	System.out.print("Telefone: ");
	this.setTelCliente(kb.nextLine());
	System.out.print("CPF: ");
	this.setCpf(kb.nextLine());
	this.getEndCliente().inserirDados(kb);
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("");
	System.out.println("Cliente " + this.getCodCliente());
	System.out.println("Nome: " + this.getNomeCliente());
	System.out.println("CPF: " + this.getCpf());
	System.out.println("Telefone: " + this.getTelCliente());
	this.getEndCliente().listarDadosCompletos();
    }
    
    @Override
    public String toString() {
	return (this.getCodCliente()+ " - " + this.getNomeCliente()+ " | " + this.getCpf() + "\n");
    }
}
