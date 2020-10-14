package pacoteAgendamento;

import java.util.Scanner;

/*O sistema solicitará o nome e a idade do paciente, com base nisso, indicará se é Pediatra ou Clínico Geral
O sistema exibirá os horários do médico selecionado, o usuário deve selecionar algum dos horários disponíveis
Deve-se imprimir o nome do usuário, o nome do médico especialista e o horário e data agendados.
*/


public class agendamentoMedicos {
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
		
		String nome;
		int idade, hora, data; 
		int[] horariosP = {9,10,14,15};
		int[] horariosC = {11,12,16,17};
		int[] datas = {14,15,16,17};	
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
			System.out.println("Medicos disponíveis: ");
			
			for (int i=0; i<medicosP.length; i++) // SELECAO DE MEDICOS P.
			{
				System.out.println(medicosP[i] + " -  Selecione: " + i + " para agendar");
			}
			
			medico = ler.nextInt();
			
			
			System.out.println("Datas disponíveis: ");
			
			for (int d=0; d<datas.length; d++) //SELECAO DE DATA P.
			{
				System.out.println(datas[d] + "/10 - Selecione: (" + d + ") para agendar");
			}
			
			data = ler.nextInt();
				
			
			System.out.println("Horários disponíveis: ");
			
			for (int i=0; i< horariosP.length ; i++) //SELECAO DE HORARIO P.
			{
				System.out.println(horariosP[i] + ":00 - Selecione: " + i + " para agendar");
				
				
			}
			hora = ler.nextInt();
			
			System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + "/10, às " + horariosP[hora] + ":00 com " + medicosP[medico]);
		}
		
		
		//      CLINICO GERAL 
		
		
		else if (idade > 18 && idade <=120)
		{
			
			System.out.println("Medicos disponíveis: ");
			
			for (int i=0; i < medicosC.length; i++) //SELECAO DE MEDICOS C.
			{
				System.out.println(medicosC[i] + " - Selecione: " + i + " para agendar.");
			}
			
			medico = ler.nextInt();
			
			
			System.out.println("Datas disponíveis: ");
						
			for (int d=0; d<datas.length; d++) //SELECAO DE DATA C.
			{
				System.out.println(datas[d] + "/10 - Selecione: (" + d + ") para agendar");
			}
			
			data = ler.nextInt();
			
			
			System.out.println("Horários disponíveis: ");				
			
			for (int i=0; i< horariosC.length; i++) //SELECAO DE HORARIO C.
			{
				System.out.println(horariosC[i] + ":00 - Selecione: " + i + " para agendar.");				
			}
			
			hora = ler.nextInt();
						 
			System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + "/10, às " + horariosC[hora] + ":00 com " + medicosC[medico]);
		}
		
		else 
		{
			System.out.println("Idade inválida. ");
		}
	}
}