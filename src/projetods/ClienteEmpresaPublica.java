package projetods;

import java.util.Scanner;

public class ClienteEmpresaPublica extends Clientes {

    //private String nomeCliente; -> VEM DE CLIENTE
    //private int codCliente;     -> VEM DE CLIENTE
    //private String telCliente;  -> VEM DE CLIENTE
    private String dataLicitacao;
    private String pubDOU;
    
    public ClienteEmpresaPublica(String nomeCliente, String telCliente, String dataLicitacao, String pubDOU, Endereco endCliente){
        super(nomeCliente, telCliente, endCliente);
        this.dataLicitacao = dataLicitacao;
        this.pubDOU = pubDOU;
    }
    
    public ClienteEmpresaPublica(){
        super();
    }

    public void setPubDOU(String pubDOU) {
	this.pubDOU = pubDOU;
    }

    public String getPubDOU() {
	return pubDOU;
    }
    
    public String getDataLicitacao() {
	    return dataLicitacao;
    }

    public void setDataLicitacao(String dataLicitacao) {
	    this.dataLicitacao = dataLicitacao;
    }

    @Override
    public void inserirDados(Scanner kb) {
	System.out.println("");
	System.out.println(" -x- Cadastro de Cliente Empresa Privada -x- ");
	System.out.print("Nome: ");
	this.setNomeCliente(kb.nextLine());
	System.out.print("Telefone: ");
	this.setTelCliente(kb.nextLine());
	System.out.print("Data da Licitação: ");
	this.setDataLicitacao(kb.nextLine());
	System.out.print("Publicação no Diário Oficial da União (Data): ");
	this.setPubDOU(kb.nextLine());
	this.getEndCliente().inserirDados(kb);
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("");
	System.out.println("Cliente " + this.getCodCliente());
	System.out.println("Nome: " + this.getNomeCliente());
	System.out.println("Data da Licitação: " + this.getDataLicitacao());
	System.out.println("Publicação no Diário Oficial da União: " + this.getPubDOU());
	System.out.println("Telefone: " + this.getTelCliente());
	this.getEndCliente().listarDadosCompletos();
    }
    
    @Override
    public String toString() {
	return (this.getCodCliente()+ " - " + this.getNomeCliente()+ " | " + this.getDataLicitacao() + ", " + this.getPubDOU() + "\n");
    }
}
