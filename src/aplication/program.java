package aplication;

import java.util.*;

public class program {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade, hora; 
		int[] horariosP = {9,10,14,15};
		int[] horariosC = {11,12,16,17};
		String[] medicosP = {"Dr. Gonzales", "Dra. Simone", "Dra. T�mara"};
		String[] medicosC = {"Dra. Regina", "Dr. Pl�nio", "Dr. Valter"};
		int medico;

		
		System.out.println("Ol�! Primeiramente, nos diga seu nome: ");
		nome = ler.next();
		
		
		System.out.println("Agora, nos diga sua idade: ");
		idade = ler.nextInt();
		
		
		
		// PEDIATRA
		
		
		if (idade <= 18 && idade >= 0)
		{		
			
			for (int i=0; i<medicosP.length; i++)
			{
				System.out.println("Medicos dispon�veis: " + medicosP[i] + " -  Selecione: " + i + " para agendar");
			}
			
			medico = ler.nextInt();
			
			// MENORES DE 18 ANOS
			
			for (int i=0; i< horariosP.length ; i++)
			{
				System.out.println("Hor�rios dispon�veis: " + horariosP[i] + ":00 - Selecione: " + i + " para agendar");
				
				
			}
			hora = ler.nextInt();
			
						System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horariosP[hora] + ":00 com "+ medicosP[medico]); 

		}
		
		
		//      CLINICO GERAL 
		
		else if (idade > 18 && idade <=120)
		{
			
			for (int i=0; i < medicosC.length; i++)
			{
				System.out.println("Medicos dispon�veis: " + medicosC[i] + " - Selecione: " + i + " para agendar.");
			}
			
			medico = ler.nextInt();
			
			//MAIORES DE 18 ANOS
			
			for (int i=0; i< horariosC.length; i++)
			{
				System.out.println("Horarios dispon�veis: " + horariosC[i] + ":00 - Selecione: " + i + " para agendar.");				
			}
			
			hora = ler.nextInt();
			
			 
			System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horariosC[hora] + ":00 com "+ medicosC[medico]+".");
				
		}
		
		else 
		{
			System.out.println("Idade inv�lida. ");
		}
	}
}
