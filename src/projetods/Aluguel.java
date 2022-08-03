package projetods;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluguel implements DAO {
    
    private int codTema;
    private int codCliente;
    private int diaFesta;
    private int mesFesta;
    private int anoFesta;
    private String h_inicial;
    private String h_final;
    private Endereco endFesta;
    
    
    public Aluguel (int codTema, int codCliente, int diaFesta, int mesFesta, int anoFesta, String h_inicial, String h_final, Endereco endFesta) {
    	this.codTema = codTema;
	this.codCliente = codCliente;
	
	this.diaFesta = diaFesta;
	this.mesFesta = mesFesta;
	this.anoFesta = anoFesta;
	this.h_inicial = h_inicial;
	this.h_final = h_final;
	
    	this.endFesta = endFesta;
    }

    public Aluguel(int codCliente, int codTema) {
	this.codTema = codTema;
	this.codCliente = codCliente;
	this.endFesta = new Endereco();
    }
    
    public Aluguel() {
	this.endFesta = new Endereco();	
    }
    
    public void mostraAluguel(){ 

	System.out.println("***** MOSTRANDO ALUGUEL *****");
//	System.out.println("Data da Festa: " + this.getDataFesta());
	System.out.println("Hora inicial: " + this.getH_inicial());
	System.out.println("Hora final: " + this.getH_final());
	System.out.println("Logradouro: " + endFesta.imprimirEndereco());
		  
    }

    public int getDiaFesta() {
	return diaFesta;
    }

    public int getMesFesta() {
	return mesFesta;
    }

    public int getAnoFesta() {
	return anoFesta;
    }

    public void setDiaFesta(int diaFesta) {
	this.diaFesta = diaFesta;
    }

    public void setMesFesta(int mesFesta) {
	this.mesFesta = mesFesta;
    }

    public void setAnoFesta(int anoFesta) {
	this.anoFesta = anoFesta;
    }



    public String getH_inicial() {
	    return h_inicial;
    }

    public void setH_inicial(String h_inicial) {
	    this.h_inicial = h_inicial;
    }

    public String getH_final() {
	    return h_final;
    }

    public void setH_final(String h_final) {
	    this.h_final = h_final;
    }

    public Endereco getEndFesta() {
	    return endFesta;
    }

    public void setEndFesta(Endereco endFesta) {
	    this.endFesta = endFesta;
    }

    public int getCodTema() {
	return codTema;
    }

    public int getCodCliente() {
	return codCliente;
    }

    public void setCodTema(int codTema) {
	this.codTema = codTema;
    }

    public void setCodCliente(int codCliente) {
	this.codCliente = codCliente;
    }
    
    public void listarDados(ArrayList<Clientes> clientes, ArrayList<Tema> temas){
	String nomeCliente = "", nomeTema = "";
	for (int i = 0; i < clientes.size(); i++) {
	    if (this.codCliente == clientes.get(i).getCodCliente()) nomeCliente = clientes.get(i).getNomeCliente();
	}
	for (int i = 0; i < temas.size(); i++) {
	    if (this.codTema == temas.get(i).getCodTema()) nomeTema = temas.get(i).getNome();
	}
	System.out.println("");
	System.out.println("Data: " + this.getDiaFesta() + "/" + this.getMesFesta() + "/" + this.getAnoFesta());
	System.out.println("Cliente: " + nomeCliente + " Tema: " + nomeTema);
	System.out.println("Horário: " + this.getH_inicial() + " | " + this.getH_final());
	this.endFesta.listarDadosCompletos();
    }
    
    @Override
    public void inserirDados(Scanner kb) {
	System.out.println("");
	System.out.print("Hora de início: ");
	this.setH_inicial(kb.nextLine());
	System.out.print("Hora de encerramento: ");
	this.setH_final(kb.nextLine());
	this.endFesta.inserirDados(kb);
    }

    @Override
    public void listarDadosCompletos() {
	System.out.println("");
	System.out.println("Data: " + this.getDiaFesta() + "/" + this.getMesFesta() + "/" + this.getAnoFesta());
	System.out.println("Cod_Cliente: " + this.getCodCliente() + " Cod_Tema: " + this.getCodTema());
	System.out.println("Horário: " + this.getH_inicial() + " | " + this.getH_final());
	this.endFesta.listarDadosCompletos();
    }
        
}
