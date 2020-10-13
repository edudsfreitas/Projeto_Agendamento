package pacoteAgendamento;

import java.util.Scanner;

/*O sistema solicitará o nome e a idade do paciente, com base nisso, indicará se é Pediatra ou Clinico Geral
O sistema exibirá os horários do médico selecionado, o usuário deve selecionar algum dos horários disponíveis
Deve-se imprimir o nome do usuário, o nome do médico especialista e o horário agendado.
*/


public class agendamentoMedicos {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade, hora; 
		int[] horarios = {9,10,11,12};
		
		System.out.println("Olá! Primeiramente, nos diga seu nome: ");
		nome = ler.next();
		
		System.out.println("Agora, nos diga sua idade: ");
		idade = ler.nextInt();
		
		if (idade <= 18 && idade >= 0)
		{		
			System.out.println("Médico disponível: Dr. Gonzales. \nEspecialidade: Pediatria. ");
			
			for (int i=0; i<=1; i++)
			{
				System.out.println("Horários disponíveis: " + horarios[i] + ":00 - Selecione: " + i + " para agendar");
			}
			
			hora = ler.nextInt();
			
			switch (hora) 
			{
				case 0: 
						System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horarios[0] + ":00 com o Dr. Gonzales.");
						break;
						
				case 1: 
						System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horarios[1] + ":00 com o Dr. Gonzales.");
						break;
						
				default: 
						System.out.println("Dados inválidos!");
			}
		}
		
		else if (idade > 18 && idade <=120)
		{
			System.out.println("Médico disponível: Dra. Regina. \nEspecialidade: Clínico Geral. ");
			
			for (int i=2; i<=3; i++)
			{
				System.out.println("Horários disponíveis: " + horarios[i] + ":00 - Selecione: " + i + " para agendar");				
			}
			
			hora = ler.nextInt();
			
			switch (hora) 
			{
				case 2: 
						System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horarios[2] + ":00 com a Dra Regina.");
						break;
				case 3: 
						System.out.println("Obrigado " + nome + ", sua consulta foi agendada para as " + horarios[3] + ":00 com a Dra Regina.");
						break;
				default: 
						System.out.println("Dados inválidos!");					
			}
		}
		
		else 
		{
			System.out.println("Idade inválida ");
		}
	}
}
