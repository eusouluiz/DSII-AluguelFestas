package projetods;

import java.util.ArrayList;
import java.util.Scanner;

public class Tema implements DAO {
    private static int idCount = 0;
    private String nome;
    private int codTema;
    private double valorAluguel;
    private int qtdeItensTotal;
    private ArrayList<ItemTema> itemTemaList;
    
    public Tema(String nome, double valorAluguel, ArrayList<ItemTema> itensList){
    	this.nome = nome;
    	this.valorAluguel = valorAluguel;
	idCount++;
	this.codTema = idCount;
	this.itemTemaList = itensList;
	this.qtdeItensTotal = 0;
	for (int i = 0; i < itensList.size(); i++){
	    this.qtdeItensTotal += this.itemTemaList.get(i).getQtdItens();    
	}
    }

    public Tema() {
	idCount++;
	this.codTema = idCount;
	this.itemTemaList = new ArrayList<>();
    }
    
    public ArrayList<ItemTema> getItemTemaList() {
	return itemTemaList;
    }

    public void setItemTemaList(ArrayList<ItemTema> itemTemaList) {
	this.itemTemaList = itemTemaList;
    }

    public static int getIdCount() {
	return idCount;
    }

    public static void setIdCount(int idCount) {
	Tema.idCount = idCount;
    }
    
    public static void incrementIdCount(int idCount) {
	Tema.idCount++;
    }
    
    public String getNome() {
	    return nome;
    }
    public void setNome(String nome) {
	    this.nome = nome;
    }
    public int getCodTema() {
	    return codTema;
    }
    public void setCodTema(int codTema) {
	    this.codTema = codTema;
    }
    public double getValorAluguel() {
	    return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
	    this.valorAluguel = valorAluguel;
    }
    public int getQtdeItensTotal() {
	    return qtdeItensTotal;
    }
    public void setQtdeItensTotal(int qtdeItensTotal) {
	    this.qtdeItensTotal = qtdeItensTotal;
    }

    @Override
    public void inserirDados(Scanner kb) {
	boolean valid;
	System.out.println("");
	System.out.println(" -x- Cadastro de Tema -x- ");
	System.out.print("Nome: ");
	this.setNome(kb.nextLine());
	do {
	    try {
		System.out.print("Valor de Aluguel: ");
		this.setValorAluguel(Double.parseDouble(kb.nextLine()));
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
	System.out.println("Tema " + this.getCodTema());
	System.out.println("Nome: " + this.getNome());
	System.out.println("Quantidade de Itens: " + this.getQtdeItensTotal());
	System.out.println("Valor de Aluguel: " + this.getValorAluguel());
    }
    
    @Override
    public String toString() {
	return (this.getCodTema() + " - " + this.getNome() + "\n");
    }
}
