package projetods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProjetoDS {

    public static void main(String[] args) {
	boolean run = true, run1 = true, run2 = true, run3 = true, alValid;
	char choice, temaChoice, clienteChoice, excluirChoice;
	int nTemaChoice, nClienteChoice, nItemChoice, temaIndex, itemIndex, clienteIndex, aluguelIndex;
	Scanner kb = new Scanner(System.in);
	LimpaConsole limpar = new LimpaConsole();
	
	String nomeEmpresa = "Festa Divertida LTDA";
	String sloganEmpresa = "Celebre com alegria e viva a fantasia.";
	String cnpjEmpresa = "99.564.123/0002-56";
	String telefoneEmpresa = "(11) 4002-8922";
	
	Clientes c;
	Tema t;
	ItemTema it;
	Aluguel al;
	
	ArrayList<Clientes> clienteList = new ArrayList<>();
	ArrayList<Tema> temaList = new ArrayList<>();
	ArrayList<Aluguel> aluguelList = new ArrayList<>();
	
	ArrayList<ItemTema> itemTemaListAux;
	
	//Cadastro de itens iniciais
	itemTemaListAux = new ArrayList<>();
	itemTemaListAux.addAll(Arrays.asList(
	    new ItemTema(1, "Branca de Neve", "Display em MDF da Branca de Neve em tamanho natural (1,6m de altura)", 2), 
	    new ItemTema(1, "Bruxa BN", "Display em MDF da Bruxa em tamanho natural (1,6m de altura)", 1),
	    new ItemTema(1, "Príncipe BN", "Display em MDF do Príncipe em tamanho natural (1,7m de altura)", 1),
	    new ItemTema(1, "Anões BN", "Display em MDF dos 7 anões (0,6m de altura)", 7),
            new ItemTema(1, "Maçãs Vermelhas", "Maçãs vermelhas em tamanho natural", 10),
            new ItemTema(1, "Maçãs Vermelhas", "Maçãs vermelhas em tamanho gigante (30x30cm)", 6)
            
                  
	));
	temaList.add(new Tema("Branca de Neve", 1200.00, itemTemaListAux));
        
	itemTemaListAux = new ArrayList<>();
	itemTemaListAux.addAll(Arrays.asList(
	    new ItemTema(2, "Malévola adulta", "Display em MDF da Malévola (adulta) em tamanho natural (1,7m de altura)", 2), 
	    new ItemTema(2, "Malévola criança", "Display em MDF da Malévola (criança) em tamanho natural", 1),
	    new ItemTema(2, "Rei ML", "Display em MDF do Rei em tamanho natural (1,7m de altura)", 1),
	    new ItemTema(2, "Fadas ML", "Escultura Fadas em tamanho mini (30cm de altura)", 3),
            new ItemTema(2, "Elfos ML", "Bonecos Elfos em tamanho micro (15cm de altura)", 3),
            new ItemTema(2, "Borboletas ML", "Bonecas Borbeletas em tamanho micro (15cm de altura)", 4),
            new ItemTema(2, "Árvores ML", "Árvores da Floresta em tamanho natural (1,60 x 1m)", 6)
	));
	temaList.add(new Tema("Malévola", 2000.00, itemTemaListAux));
        
	itemTemaListAux = new ArrayList<>();
	itemTemaListAux.addAll(Arrays.asList(
	    new ItemTema(3, "Brasília Amarela MA", "Brasília amarela de madeira com cavaletes para fotos (2,5m x 1,6m)", 1), 
	    new ItemTema(3, "Mamonas MA", "Mamonas coloridas (30cm)", 10),
	    new ItemTema(3,  "Cactus MA", "Cactus do deserto (1,6m de altura)", 4),
	    new ItemTema(3, "Anões BN", "Display em MDF das fantasias das Mamonas (1,6m de altura)", 5)
	));
	temaList.add(new Tema("Mamonas Assassinas", 2300.00, itemTemaListAux));
        
        clienteList.add(new ClientePessoaFisica("Mara Machado", "(41) 99888-7887", "123.234.345-99", new Endereco("Rua Julho", 234, "Casa", "Bairro X", "Curitiba", "PR")));        
        clienteList.add(new ClientePessoaFisica("Carolina Souza", "(41) 99666-7387", "008.287.342-00", new Endereco("Rua Setembro", 8787, "Casa", "Bairro W", "Curitiba", "PR")));
	clienteList.add(new ClientePessoaFisica("Ana Martins", "(41) 99877-7898", "234.345.567-76", new Endereco("Rua Novembro", 5674, "Casa", "Bairro Y", "Curitiba", "PR")));
        clienteList.add(new ClienteEmpresaPublica( "Governo Federal - INEP",  "(41) 99656-7398", "13/01/2020", "D.O.U de 6 de junho 2020", new Endereco("SIG Quadra lote", 333, "Prédio", "Bairro W", "Brasília", "DF")));
        clienteList.add(new ClienteEmpresaPrivada("Coca-kale LTDA", "(41) 98657-7398", "23.345.389/0001-09", new Endereco("Rua das Margaridas", 1267, "Prédio", "Bairro W", "Curitiba", "PR")));
        clienteList.add(new ClienteEmpresaPrivada("Xansung LTDA", "(41) 97657-7395", "33.567.900/0001-09", new Endereco("Rua dos Oitis", 3298, "Casa", "Bairro T", "Curitiba", "PR")));
        clienteList.add(new ClienteEmpresaPublica( "Governo Federal - INEP",  "(41) 99656-7399", "17/01/2020", "D.O.U de 6 de abril 2020", new Endereco("SIG Quadra lote", 333, "Prédio", "Bairro W", "Brasília", "DF")));
        
        
        aluguelList.add(new Aluguel(1, 3, 16, 11, 2021, "20:00", "00:00", new Endereco("Rua Sete Setembro", 2345, "Salão", "Bairro Z", "Curitiba", "PR")) );
        aluguelList.add(new Aluguel(2, 4, 17, 11, 2021, "13:00", "17:00", new Endereco("Rua São Pedro", 455, "Salão", "Bairro M", "Curitiba", "PR")) );
        aluguelList.add(new Aluguel(3, 6, 18, 01, 2021, "18:00", "22:00", new Endereco("Rua Coronel Paulo Martins", 345, "Salão", "Bairro S", "Curitiba", "PR")) );
        
	do {
	    menu();
	    try {
		choice = (kb.nextLine().toCharArray())[0];
	    } catch (ArrayIndexOutOfBoundsException e) {
		choice = '-';
	    }
		
	    switch (choice){
		case '1':
		    run1 = true;
		    do {
			menuEscolhaTipoCliente();
			try {
			    choice = (kb.nextLine().toCharArray())[0];
			} catch (ArrayIndexOutOfBoundsException e) {
			    choice = '-';
			}
			
			switch (choice){
			    case '1':
				c = new ClientePessoaFisica();
				c.inserirDados(kb);
				clienteList.add(c);
				break;

			    case '2':
				c = new ClienteEmpresaPrivada();
				c.inserirDados(kb);
				clienteList.add(c);
				break;
				
			    case '3':
				c = new ClienteEmpresaPublica();
				c.inserirDados(kb);
				clienteList.add(c);
				break;
				
			    case 'X':
				run1 = false;
				break;
				
			    default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		    } while (run1);
		    break;
		    
		case '2':
		    if (clienteList.isEmpty()){
			System.out.println(" ! Não há clientes cadastrados ! ");
		    } else {
			System.out.println(" -x- Lista de Clientes Cadastrados -x-");
			for (int i = 0; i < clienteList.size(); i++) clienteList.get(i).listarDadosCompletos();
		    }
		    break;
		    
		case '3':
		    t = new Tema();
		    t.inserirDados(kb);
		    temaList.add(t);
		    break;
		    
		case '4':
		    if (temaList.isEmpty()){
			System.out.println(" ! Não há temas cadastrados ! ");
		    } else {
			System.out.println(" -x- Lista de Temas Cadastrados -x-");
			for (int i = 0; i < temaList.size(); i++) temaList.get(i).listarDadosCompletos();
		    }
		    break;
		    
		case '5':
		    if (temaList.isEmpty()){
			System.out.println(" ! Não há temas cadastrados ! ");
		    } else {
			run1 = true;
			do {
			    System.out.println("");
			    System.out.println(" -x- Seleção de Tema -x-");
			    System.out.println("");
			    temaNoSeparatorsPrint(temaList);
			    System.out.println("X - Retornar.");
			    System.out.println("");
			    System.out.print("Escolha uma opção: ");
			    
			    if (kb.hasNextInt()) {
				nTemaChoice = Integer.parseInt(kb.nextLine());
				try {
				    temaIndex = Integer.parseInt(temaGetValidId(temaList, nTemaChoice));
				    System.out.println(" -x- Cadastro de item para tema " + temaList.get(temaIndex).getNome() + " -x- ");			
				    it = new ItemTema(nTemaChoice);
				    it.inserirDados(kb);
				    
				    itemTemaListAux = temaList.get(temaIndex).getItemTemaList();
				    itemTemaListAux.add(it);
				    
				    temaList.get(temaIndex).setItemTemaList(itemTemaListAux);
				    temaList.get(temaIndex).setQtdeItensTotal(temaList.get(temaIndex).getQtdeItensTotal()+it.getQtdItens());
				} catch (NumberFormatException e){
				    System.out.println("");
				    System.out.println("Código de tema inválido, tente novamente.");
				    System.out.println("");  
				}
				
			    } else {
				try {
				    temaChoice = (kb.nextLine().toCharArray())[0];
				} catch (ArrayIndexOutOfBoundsException e) {
				    temaChoice = '-';
				}
	
				if (temaChoice == 'X'){
				    System.out.println("Retornando...\n");
				} else {
				    System.out.println("Opção inválida, retornando ao menu...\n");
				}
				run1 = false;
			    }
			} while (run1);
		    }
		    break;
		    
		case '6':
		    if (temaList.isEmpty()) {
			System.out.println(" ! Não há temas cadastrados ! ");
		    } else {
			run2 = true;
			do {
			    System.out.println("");
			    System.out.println(" -x- Listar itens de tema -x-");
			    System.out.println(" De qual tema gostaria de listar os itens?");
			    temaNoSeparatorsPrint(temaList);
			    System.out.println("X - Retornar.");
			    System.out.println("");
			    System.out.print("Escolha uma opção: ");

			    if (kb.hasNextInt()) {
				nTemaChoice = Integer.parseInt(kb.nextLine());
				try {
				    temaIndex = Integer.parseInt(temaGetValidId(temaList, nTemaChoice));

				    if ( !temaList.get(temaIndex).getItemTemaList().isEmpty() ) {
					System.out.println("");
					System.out.println(" Lista de itens para o tema " + temaList.get(temaIndex).getNome() + ": ");
					System.out.println("");
					itemTemaNoSeparatorsPrint(temaList.get(temaIndex).getItemTemaList());
				    } else {
					System.out.println(" -x- Não há itens cadastrados para o tema escolhido. -x- ");
				    }
				    
				    

				} catch (NumberFormatException e){
				    System.out.println("");
				    System.out.println("Código de tema inválido, tente novamente.");
				    System.out.println("");  
				}

			    } else {
				
				try {
				    temaChoice = (kb.nextLine().toCharArray())[0];
				} catch (ArrayIndexOutOfBoundsException e) {
				    temaChoice = '-';
				}
				
				if (temaChoice == 'X'){
				    System.out.println("Retornando...\n");
				} else {
				    System.out.println("Opção inválida, retornando ao menu...\n");
				}
				run2 = false;
				//run1 = false;
			    }

			} while (run2);
		    }
		    break;
		    
		case '7':
		    if (clienteList.isEmpty()){
			System.out.println(" ! Não há clientes cadastrados ! ");
		    } else if (temaList.isEmpty()) {
			System.out.println(" ! Não há temas cadastrados ! ");
		    } else {
			run1 = true;
			do {
			    System.out.println("");
			    System.out.println(" -x- Seleção de Cliente -x-");
			    System.out.println("");
			    clienteNoSeparatorsPrint(clienteList);
			    System.out.println("X - Retornar.");
			    System.out.println("");
			    System.out.print("Escolha uma opção: ");
			    
			    if (kb.hasNextInt()) {
				nClienteChoice = Integer.parseInt(kb.nextLine());
				for (int i = 0; i < clienteList.size(); i++) {
				    if (nClienteChoice == clienteList.get(i).getCodCliente()){
					run2 = true;
					do{
					    System.out.println("");
					    System.out.println(" -x- Seleção de Tema -x-");
					    System.out.println("");
					    temaNoSeparatorsPrint(temaList);
					    System.out.println("X - Retornar.");
					    System.out.println("");
					    System.out.print("Escolha uma opção: ");

					    if (kb.hasNextInt()) {
						nTemaChoice = Integer.parseInt(kb.nextLine());
						for (int j = 0; j < temaList.size(); j++) {
						    if (nTemaChoice == temaList.get(j).getCodTema()){
							System.out.println("");
							System.out.println(" -x- Cadastro de aluguel para " + clienteList.get(i).getNomeCliente()+ " -x- ");
							System.out.println(" -x- Tema: " + temaList.get(j).getNome() + " -x- ");
							al = new Aluguel(nClienteChoice, nTemaChoice);
							do {
							    alValid = true;
							    System.out.println("");
							    System.out.println("Insira a data da festa.");
							    System.out.print("Dia(DD): ");
							    al.setDiaFesta(Integer.parseInt(kb.nextLine()));
							    System.out.print("Mês(MM): ");
							    al.setMesFesta(Integer.parseInt(kb.nextLine()));
							    System.out.print("Ano(AAAA): ");
							    al.setAnoFesta(Integer.parseInt(kb.nextLine()));
							    for (int k = 0; k < aluguelList.size(); k++){
								if (al.getDiaFesta() == aluguelList.get(k).getDiaFesta() &&
								    al.getMesFesta() == aluguelList.get(k).getMesFesta() &&
								    al.getAnoFesta() == aluguelList.get(k).getAnoFesta() &&
								    al.getCodTema() == aluguelList.get(k).getCodTema()){
								    System.out.println("");
								    System.out.println(" -x- Tema indisponível para a data solicitada! -x- ");
								    alValid = false;
								    System.out.println("");
								    System.out.print("Gostaria de selecionar uma nova data? (y/n): ");
								    try {
									choice = (kb.nextLine().toCharArray())[0];
								    } catch (ArrayIndexOutOfBoundsException e) {
									choice = '-';
								    }
								}
							    }
							} while (choice == 'y' && alValid == false);
							
							if (alValid){
							    al.inserirDados(kb);
							    aluguelList.add(al);
							    System.out.println("");
							    System.out.println("Aluguel cadastrado com sucesso!");
							    System.out.println("");
							    run2 = false;
							    run1 = false;
							    break;
							}
							
						    } else if (j == temaList.size()-1) {
							System.out.println("");
							System.out.println("Código de tema inválido, tente novamente.");
							System.out.println("");
						    }
						}
					    } else {
						temaChoice = (kb.nextLine().toCharArray())[0];
						if (temaChoice == 'X'){
						    System.out.println("Retornando...\n");
						} else {
						    System.out.println("Opção inválida, retornando ao menu...\n");
						}
						run2 = false;
						run1 = false;
					    }
					} while (run2);
				    } else if (i == clienteList.size()-1) {
					System.out.println("");
					System.out.println("Código de cliente inválido, tente novamente.");
					System.out.println("");
				    }
				}
			    } else {
				clienteChoice = (kb.nextLine().toCharArray())[0];
				if (clienteChoice == 'X'){
				    System.out.println("Retornando...\n");
				} else {
				    System.out.println("Opção inválida, retornando ao menu...\n");
				}
				run1 = false;
			    }
			 
			} while (run1);
		    }
		    break;
		    
		case '8':
		    if (aluguelList.isEmpty()){
			System.out.println(" ! Não há alugueis cadastrados ! ");
		    } else {
			System.out.println(" -x- Lista de alugueis cadastrados -x-");
			for (int i = 0; i < aluguelList.size(); i++) aluguelList.get(i).listarDados(clienteList, temaList);
		    }
		    break;
		
		case '9':
		    run1 = true;
		    do {
			menuEscolhaExclusao();
			
			try {
			    excluirChoice = (kb.nextLine().toCharArray())[0];
			} catch (ArrayIndexOutOfBoundsException e) {
			    excluirChoice = '-';
			}	
			
			switch (excluirChoice){
			    case '1':
				if (clienteList.isEmpty()) {
				    System.out.println(" ! Não há clientes cadastrados ! ");
				} else {
				    run2 = true;
				    do {
					System.out.println("");
					System.out.println(" -x- Exclusão de Clientes -x-\n");
					System.out.println("O cadastro de qual cliente deve ser excluído?");
					System.out.println("As reservas de aluguel relacionadas ao cliente escolhido também serão apagadas.");
					clienteNoSeparatorsPrint(clienteList);
					System.out.println("X - Retornar.");
					System.out.println("");
					System.out.print("Escolha uma opção: ");

					if (kb.hasNextInt()) {
					    nClienteChoice = Integer.parseInt(kb.nextLine());
					    try {
						clienteIndex = Integer.parseInt(clienteGetValidId(clienteList, nClienteChoice));
						ArrayList <Aluguel> aluguelListAux = new ArrayList<>();
												
						for (int i = 0; i < aluguelList.size(); i++){
						    if (aluguelList.get(i).getCodCliente() == nClienteChoice) aluguelListAux.add(aluguelList.get(i));
						}
						if (!aluguelList.isEmpty()){
						    aluguelList.removeAll(aluguelListAux);
						}
						
						clienteList.remove(clienteIndex);
						
					    } catch (NumberFormatException e){
						System.out.println("");
						System.out.println("Código de cliente inválido, tente novamente.");
						System.out.println("");  
					    }

					} else {
					    
					    try {
						temaChoice = (kb.nextLine().toCharArray())[0];
					    } catch (ArrayIndexOutOfBoundsException e) {
						temaChoice = '-';
					    }
					    
					    if (temaChoice == 'X'){
						System.out.println("Retornando...\n");
					    } else {
						System.out.println("Opção inválida, retornando ao menu...\n");
					    }
					    run2 = false;
					}
						
				    } while (run2);
				}
				break;

			    case '2':
				if (temaList.isEmpty()) {
				    System.out.println(" ! Não há temas cadastrados ! ");
				} else {
				    run2 = true;
				    do {
					System.out.println("");
					System.out.println(" -x- Exclusão de Temas -x-\n");
					System.out.println("O cadastro de qual tema deve ser excluído?");
					System.out.println("As reservas de aluguel e os itens de tema relacionadas à opção escolhida também serão apagados.");
					System.out.println("");
					temaNoSeparatorsPrint(temaList);
					System.out.println("X - Retornar.");
					System.out.println("");
					System.out.print("Escolha uma opção: ");

					if (kb.hasNextInt()) {
					    nTemaChoice = Integer.parseInt(kb.nextLine());
					    try {
						temaIndex = Integer.parseInt(temaGetValidId(temaList, nTemaChoice));
						ArrayList <Aluguel> aluguelListAux = new ArrayList<>();
												
						for (int i = 0; i < aluguelList.size(); i++){
						    if (aluguelList.get(i).getCodTema() == nTemaChoice) aluguelListAux.add(aluguelList.get(i));
						}
						if (!aluguelList.isEmpty()){
						    aluguelList.removeAll(aluguelListAux);
						}
						
						temaList.remove(temaIndex);
						
					    } catch (NumberFormatException e){
						System.out.println("");
						System.out.println("Código de tema inválido, tente novamente.");
						System.out.println("");  
					    }

					} else {
					    temaChoice = (kb.nextLine().toCharArray())[0];
					    if (temaChoice == 'X'){
						System.out.println("Retornando...\n");
					    } else {
						System.out.println("Opção inválida, retornando ao menu...\n");
					    }
					    run2 = false;
					}
						
				    } while (run2);
				}
				break;
				
			    case '3':
				if (temaList.isEmpty()) {
				    System.out.println(" ! Não há temas cadastrados ! ");
				} else {
				    run2 = true;
				    do {
					System.out.println("");
					System.out.println(" -x- Exclusão de Itens -x-");
					System.out.println(" De qual tema gostaria de excluir itens?");
					temaNoSeparatorsPrint(temaList);
					System.out.println("X - Retornar.");
					System.out.println("");
					System.out.print("Escolha uma opção: ");

					if (kb.hasNextInt()) {
					    nTemaChoice = Integer.parseInt(kb.nextLine());
					    try {
						temaIndex = Integer.parseInt(temaGetValidId(temaList, nTemaChoice));
						
						if ( !temaList.get(temaIndex).getItemTemaList().isEmpty() ) {
						    run3 = true;   
						} else {
						    System.out.println(" -x- Não há itens cadastrados para o tema escolhido. -x- ");
						    run3 = false;
						}
						while(run3) {
						    System.out.println("");
						    System.out.println(" Qual item deve ser excluído?");
						    itemTemaNoSeparatorsPrint(temaList.get(temaIndex).getItemTemaList());
						    System.out.println("X - Retornar.");
						    System.out.println("");
						    System.out.print("Escolha uma opção: ");

						    if (kb.hasNextInt()) {
							nItemChoice = Integer.parseInt(kb.nextLine());
							try {
							    itemTemaListAux = temaList.get(temaIndex).getItemTemaList();
							    itemIndex = Integer.parseInt(itemGetValidId(itemTemaListAux, nItemChoice));
							    
							    temaList.get(temaIndex).setQtdeItensTotal(temaList.get(temaIndex).getQtdeItensTotal()-itemTemaListAux.get(itemIndex).getQtdItens());
							    itemTemaListAux.remove(itemIndex);
							    temaList.get(temaIndex).setItemTemaList(itemTemaListAux);
							    
							    System.out.println(" -x- Item removído com sucesso! -x- ");			

							} catch (NumberFormatException e){
							    System.out.println("");
							    System.out.println("Código de item inválido, tente novamente.");
							    System.out.println("");  
							}

						    } else {
							try {
							    temaChoice = (kb.nextLine().toCharArray())[0];
							} catch (ArrayIndexOutOfBoundsException e) {
							    temaChoice = '-';
							}
							
							if (temaChoice == 'X'){
							    System.out.println("Retornando...\n");
							} else {
							    System.out.println("Opção inválida, retornando ao menu...\n");
							}
							run3 = false;
						    }

						}						
						
					    } catch (NumberFormatException e){
						System.out.println("");
						System.out.println("Código de tema inválido, tente novamente.");
						System.out.println("");  
					    }

					} else {
					    try {
						temaChoice = (kb.nextLine().toCharArray())[0];
					    } catch (ArrayIndexOutOfBoundsException e) {
						temaChoice = '-';
					    }
					    
					    if (temaChoice == 'X'){
						System.out.println("Retornando...\n");
					    } else {
						System.out.println("Opção inválida, retornando ao menu...\n");
					    }
					    run2 = false;
					    run1 = false;
					}
						
				    } while (run2);
				}
				break;
				
			    case '4':
				if (aluguelList.isEmpty()) {
				    System.out.println(" ! Não há alugueis cadastrados ! ");
				} else {
				    run2 = true;
				    do {
					System.out.println("");
					System.out.println(" -x- Exclusão de Alugueis -x-");
					System.out.println("Qual reserva de aluguel gostaria de apagar?\n");
					
					for (int i = 0; i < aluguelList.size(); i++){
					    System.out.print("ID: " + (i+1));
					    aluguelList.get(i).listarDados(clienteList, temaList);
					}
					
					System.out.println("");
					System.out.println("X - Retornar.");
					System.out.println("");
					System.out.print("Escolha uma opção: ");

					if (kb.hasNextInt()) {
					    aluguelIndex = Integer.parseInt(kb.nextLine());
					    if (aluguelIndex <= aluguelList.size()){
						aluguelList.remove(aluguelIndex-1);
						System.out.println(" -x- Reserva excluída com sucesso! -x- ");	
					    } else {
						System.out.println("");
						System.out.println("Código de reserva inválido, tente novamente.");
						System.out.println("");
					    }

					} else {
					    try {
						temaChoice = (kb.nextLine().toCharArray())[0];
					    } catch (ArrayIndexOutOfBoundsException e) {
						temaChoice = '-';
					    }
					    
					    if (temaChoice == 'X'){
						System.out.println("Retornando...\n");
					    } else {
						System.out.println("Opção inválida, retornando ao menu...\n");
					    }
					    run2 = false;
					    run1 = false;
					}
					
				    } while (run2);
				}	
				break;
				
			    case 'X':
				run1 = false;
				break;
				
			    default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		    } while (run1);
		    break;
		    
		case '0':
		    if (aluguelList.isEmpty()) {
			System.out.println(" ! Não há alugueis cadastrados ! ");
		    } else {
			run2 = true;
			do {
			    System.out.println("");
			    System.out.println(" -x- Relatório de Reserva -x-");
			    System.out.println("Qual reserva de aluguel gostaria de visualizar?\n");

			    for (int i = 0; i < aluguelList.size(); i++){
				System.out.print("ID: " + (i+1));
				aluguelList.get(i).listarDados(clienteList, temaList);
			    }
			    
			    System.out.println("");
			    System.out.println("X - Retornar.");
			    System.out.println("");
			    System.out.print("Escolha uma opção: ");

			    if (kb.hasNextInt()) {
				aluguelIndex = Integer.parseInt(kb.nextLine());
				if (aluguelIndex <= aluguelList.size()){
				    
				    printRelatorio(aluguelList.get(aluguelIndex-1), clienteList, temaList, nomeEmpresa, sloganEmpresa, cnpjEmpresa, telefoneEmpresa);
				    
				} else {
				    System.out.println("");
				    System.out.println("Código de reserva inválido, tente novamente.");
				    System.out.println("");
				}

			    } else {
				try {
				    temaChoice = (kb.nextLine().toCharArray())[0];
				} catch (ArrayIndexOutOfBoundsException e) {
				    temaChoice = '-';
				}

				if (temaChoice == 'X'){
				    System.out.println("Retornando...\n");
				} else {
				    System.out.println("Opção inválida, retornando ao menu...\n");
				}
				run2 = false;
				run1 = false;
			    }

			} while (run2);
		    }	
		    break;
		    
		case 'X':
		    return;
		    
		default:
		    System.out.println("Opção inválida, tente novamente.");
		    break;
	    }
	    
//	    limpar.clearConsole();
	} while (run);
    }
    
    public static void menu(){
	System.out.println("");
	System.out.println("     -x-     Menu     -x-     ");
	System.out.println("");
	System.out.println("1. Adicionar cliente.");
	System.out.println("2. Listar clientes.");
	System.out.println("3. Adicionar tema.");
	System.out.println("4. Listar temas.");
	System.out.println("5. Adicionar itens ao tema.");
	System.out.println("6. Listar itens do tema.");
	System.out.println("7. Cadastrar aluguel.");
	System.out.println("8. Listar alugueis.");
	System.out.println("9. Excluir itens.");
	System.out.println("0. Visualizar relatório de aluguel.");
	System.out.println("X. Encerrar.");
	System.out.println("");
	System.out.print("Escolha uma opção: ");
    }
    
    public static void menuEscolhaTipoCliente(){
	System.out.println("");
	System.out.println("     -x-     Qual o tipo de cliente a ser cadastrado?     -x-     ");
	System.out.println("");
	System.out.println("1. Cliente Pessoa Física.");
	System.out.println("2. Cliente Empresa Privada.");
	System.out.println("3. Cliente Empresa Pública.");
	System.out.println("X. Retornar.");
	System.out.println("");
	System.out.print("Escolha uma opção: ");
    }
    
    public static void menuEscolhaExclusao(){
	System.out.println("");
	System.out.println("     -x-     O que deseja excluir?     -x-     ");
	System.out.println("");
	System.out.println("1. Cliente.");
	System.out.println("2. Tema.");
	System.out.println("3. Item de tema.");
	System.out.println("4. Aluguel.");
	System.out.println("X. Retornar.");
	System.out.println("");
	System.out.print("Escolha uma opção: ");
    }
    
    public static void itemTemaNoSeparatorsPrint(ArrayList<ItemTema> itemTema){
	System.out.println(itemTema.toString().replace("[", " ").replace("]", "").replace(",", ""));
    }
    
    public static void temaNoSeparatorsPrint(ArrayList<Tema> tema){
	System.out.println(tema.toString().replace("[", " ").replace("]", "").replace(",", ""));
    }
    
    public static void clienteNoSeparatorsPrint(ArrayList<Clientes> cliente){
	System.out.println(cliente.toString().replace("[", " ").replace("]", "").replace(",", ""));
    }
    
    public static String itemGetValidId(ArrayList<ItemTema> itTema, int codIt){
	for (int i = 0; i < itTema.size(); i++){
	    if (itTema.get(i).getCodItemTema() == codIt) return Integer.toString(i);
	}
	return "FALSE";
    }
    
    public static String clienteGetValidId(ArrayList<Clientes> client, int codClient){
	for (int i = 0; i < client.size(); i++){
	    if (client.get(i).getCodCliente() == codClient) return Integer.toString(i);
	}
	return "FALSE";
    }
    
    public static String temaGetValidId(ArrayList<Tema> tema, int codTema){
	for (int i = 0; i < tema.size(); i++){
	    if (tema.get(i).getCodTema() == codTema) return Integer.toString(i);
	}
	return "FALSE";
    }
    
    public static void printRelatorio(Aluguel aluguel, ArrayList<Clientes> clientes, ArrayList<Tema> temas, String nomeEmpresa, String sloganEmpresa, String cnpjEmpresa, String telefoneEmpresa){
	System.out.println("\n");
	System.out.println(" x ----------------------------------------------------------------------------------------------------- x ");
	System.out.println("");
	System.out.println("Dados da Festa: ");
	System.out.println("Data: " + aluguel.getDiaFesta() + "/" + aluguel.getMesFesta() + "/" + aluguel.getAnoFesta());
	System.out.println("Horário: " + aluguel.getH_inicial() + " | " + aluguel.getH_final());
	aluguel.getEndFesta().listarDadosCompletos();
	System.out.println("   .....................................................................................................   ");
	for (int i = 0; i < clientes.size(); i++){
	    if (clientes.get(i).getCodCliente() == aluguel.getCodCliente()) clientes.get(i).listarDadosCompletos();
	}
	System.out.println("   .....................................................................................................   ");
	for (int i = 0; i < temas.size(); i++){
	    if (temas.get(i).getCodTema() == aluguel.getCodTema()) {
		temas.get(i).listarDadosCompletos();
		System.out.println("   .....................................................................................................   ");
		System.out.println("");
		System.out.println("Itens alugados: ");
		itemTemaNoSeparatorsPrint(temas.get(i).getItemTemaList());
	    }
	}
	System.out.println("   .....................................................................................................   ");
	System.out.println("");
	System.out.println("      " + nomeEmpresa + ": " + sloganEmpresa);
	System.out.println("      CNPJ:" + cnpjEmpresa);
	System.out.println("      Contato:" + telefoneEmpresa);
	System.out.println("");
	System.out.println(" x ----------------------------------------------------------------------------------------------------- x ");
	System.out.println("\n");
    }
}
