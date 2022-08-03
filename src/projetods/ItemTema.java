package projetods;

import java.util.Scanner;

public class ItemTema implements DAO {
    private static int idCount = 0;
    private int codTema;
    private int codItemTema;
    private String nomeItemTema;
    private String descricaoItem;
    private int qtdItens;

    public ItemTema(int codTema, String nomeItemTema, String descricaoItem, int qtdItens) {
	this.codTema = codTema;
	idCount++;
	this.codItemTema = idCount;
	this.nomeItemTema = nomeItemTema;
	this.descricaoItem = descricaoItem;
	this.qtdItens = qtdItens;
    }

    public ItemTema(int codTema) {
	this.codTema = codTema;
	idCount++;
	this.codItemTema = idCount;
    }
    
    public ItemTema() {
	idCount++;
	this.codTema = idCount;
    }
    
    public static int getIdCount() {
	return idCount;
    }

    public static void setIdCount(int idCount) {
	ItemTema.idCount = idCount;
    }
    
    public static void incrementIdCount(int idCount) {
	ItemTema.idCount++;
    }
    
    public void setCodTema(int codTema) {
	this.codTema = codTema;
    }

    public int getCodTema() {
	return codTema;
    }
    public int getCodItemTema() {
	    return codItemTema;
    }
    public void setCodItemTema(int codItemTema) {
	    this.codItemTema = codItemTema;
    }
    public String getNomeItemTema() {
	    return nomeItemTema;
    }
    public void setNomeItemTema(String nomeItemTema) {
	    this.nomeItemTema = nomeItemTema;
    }
    public String getDescricaoItem() {
	    return descricaoItem;
    }
    public void setDescricaoItem(String descricaoItem) {
	    this.descricaoItem = descricaoItem;
    }
    public int getQtdItens() {
	    return qtdItens;
    }
    public void setQtdItens(int qtdItens) {
	    this.qtdItens = qtdItens;
    }

    @Override
    public void inserirDados(Scanner kb) {
	boolean valid;
	System.out.println("");
	System.out.println(" -x- Cadastro de Item -x- ");
	System.out.print("Nome: ");
	this.setNomeItemTema(kb.nextLine());
	System.out.print("Descrição: ");
	this.setDescricaoItem(kb.nextLine());
	do {
	    try {
		System.out.print("Quantidade: ");
		this.setQtdItens(Integer.parseInt(kb.nextLine()));
		valid = true;
	    } catch (NumberFormatException e){
		System.out.println("Formato de número inválido. Tente novamente.");
		valid = false;
	    }
	} while (!valid);
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("");
	System.out.println("Código de Item: " + this.getCodItemTema());
	System.out.println("Código de Tema: " + this.getCodTema());
	System.out.println("Nome: " + this.getNomeItemTema());
	System.out.println("Descrição: " + this.getDescricaoItem());
	System.out.println("Quantidade de Itens: " + this.getQtdItens());
    }
    
    @Override
    public String toString() {
	return ("\nItem: " + this.getCodItemTema() + "\n " + this.getNomeItemTema()+ ": " + this.getDescricaoItem()+ ".\n Quantidade: " + this.getQtdItens() + "\n");
    }
}
