package projetods;

import java.util.Scanner;

public class Endereco implements DAO {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    
    public Endereco (String logradouro, int numero, String complemento, String bairro, String cidade, String uf){
	this.logradouro = logradouro;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cidade = cidade;
	this.uf = uf;
    }

    public Endereco() {
    }
    
    public String imprimirEndereco() {

    return this.getLogradouro() + ", " 
    + this.getNumero()
    + "\nComplemento: " + this.getComplemento();
    }

    public String getLogradouro() {
	    return logradouro;
    }
    public void setLogradouro(String logradouro) {
	    this.logradouro = logradouro;
    }
    public int getNumero() {
	    return numero;
    }
    public void setNumero(int numero) {
	    this.numero = numero;
    }
    public String getComplemento() {
	    return complemento;
    }
    public void setComplemento(String complemento) {
	    this.complemento = complemento;
    }
    public String getBairro() {
	    return bairro;
    }
    public void setBairro(String bairro) {
	    this.bairro = bairro;
    }
    public String getCidade() {
	    return cidade;
    }
    public void setCidade(String cidade) {
	    this.cidade = cidade;
    }
    public String getUf() {
	    return uf;
    }
    public void setUf(String uf) {
	    this.uf = uf;
    }

    @Override
    public void inserirDados(Scanner kb) {
	boolean valid;
	System.out.println(" - Endereço - ");
	System.out.print("Logradouro: ");
	this.setLogradouro(kb.nextLine());
	do {
	    try {
		System.out.print("Número: ");
		this.setNumero(Integer.parseInt(kb.nextLine()));
		valid = true;
	    } catch (NumberFormatException e){
		System.out.println("Formato de número inválido. Tente novamente.");
		valid = false;
	    }
	} while (!valid);
	System.out.print("Complemento: ");
	this.setComplemento(kb.nextLine());
	System.out.print("Bairro: ");
	this.setBairro(kb.nextLine());
	System.out.print("Cidade: ");
	this.setCidade(kb.nextLine());
	System.out.print("UF: ");
	this.setUf(kb.nextLine());
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("Endereço: " + this.getLogradouro() + ", " + this.getNumero() + " - " + this.getBairro());
	if ( !this.getComplemento().isBlank() ) System.out.println("          " + this.getComplemento());
	System.out.println("          " + this.getCidade() + " / " + this.getUf());
    }
}
