package aplication;

import java.util.*;

public class program {
	

		
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
				
				String nome;
				int idade, hora;
				int data; 
				int[] horariosP = {9,10,14,15};
				int[] horariosC = {11,12,16,17};
				String[] datas = {"14/10","15/10","16/10","17/10"};	
				String[] medicosP = {"Dr. Gonzales", "Dra. Simone", "Dra. Tâmara"};
				String[] medicosC = {"Dra. Regina", "Dr. Plínio", "Dr. Valter"};
				int medico;

				
				System.out.println("Olá! Primeiramente, nos diga seu nome: ");
				nome = ler.next();
				
				
				System.out.println("Agora, nos diga sua idade: ");
				idade = ler.nextInt();
				
				
				
				//		PEDIATRA
				
				
				if (idade <= 18 && idade >= 0)
				{		
					System.out.println("\nMedicos Disponíveis!\n");
					for (int i=0; i<medicosP.length; i++) // SELECAO DE MEDICOS P.
					{
						System.out.println("" + medicosP[i] + " -  Selecione: (" + i + ") para agendar");
					}
					
					medico = ler.nextInt();
					
					System.out.println("\n Selecione uma data: \n");
					for (int d=0; d<datas.length; d++) //SELECAO DE DATA P.
					{
						System.out.println(datas[d] + "/10 - Selecione: (" + d + ") para agendar");
					}
					
					data = ler.nextInt();
					
					
					// MENORES DE 18 ANOS
					System.out.println("\nHorários disponíveis: \n");
					for (int i=0; i< horariosP.length ; i++) //SELECAO DE HORARIO P.
					{
						System.out.println("" + horariosP[i] + ":00 - Selecione: (" + i + ") para agendar");
						
						
					}
					hora = ler.nextInt();
					
					System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + ", às " + horariosP[hora] + ":00 com " + medicosP[medico]);
				}
				
				
				//      CLINICO GERAL 
				
				else if (idade > 18 && idade <=120)
				{
					System.out.println("\nMedicos disponíveis: \n");
					for (int i=0; i < medicosC.length; i++) //SELECAO DE MEDICOS C.
					{
						System.out.println("" + medicosC[i] + " - Selecione: (" + i + ") para agendar.");
					}
					
					medico = ler.nextInt();
					
					System.out.println("\nSelecione uma data: \n");
					
					for (int d=0; d<datas.length; d++) //SELECAO DE DATA C.
					{
						System.out.println(datas[d] + " - Selecione: (" + d + ") para agendar");
					}
					
					data = ler.nextInt();
					
					//MAIORES DE 18 ANOS
					
					System.out.println("\n Horarios disponíveis: \n");
					
					for (int i=0; i< horariosC.length; i++) //SELECAO DE DATA C.
					{
						System.out.println(horariosC[i] + ":00 - Selecione: (" + i + ") para agendar.");				
					}
					
					hora = ler.nextInt();
					
					 
					System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + ", às " + horariosC[hora] + ":00 com " + medicosC[medico]);
						
				}
				
				else 
				{
					System.out.println("Idade inválida. ");
				}
			}
}
