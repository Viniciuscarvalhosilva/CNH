package Cnh;

import java.util.Scanner;  																				
public class Cnh 
{

	public static void main(String[] args) 																
	{
		int a,b,c;  																					//DECLARACAO DE VARIAVEIS TIPO INTEIRO
		Scanner read = new Scanner(System.in); 															
		System.out.print("VOCE FOI APROVADO NO EXAME PSICOTECNICO?\n\nDIGITE 1 ou 2:\n(1)SIM\n(2)NAO");	//EXIBE MSG NA TELA DO USUARIO
		a = read.nextInt(); 																			// GRAVA VALOR DIGITADO NA VARIAVEL 'a'
		System.out.println("------------------------------------------");
		
		System.out.print("\nVOCE FOI APROVADO NO EXAME DE LEGISLACAO?\n\nDIGITE 1 ou 2:\n(1)SIM\n(2)NAO");//EXIBE MSG NA TELA DO USUARIO
		b = read.nextInt(); 																			// GRAVA VALOR DIGITADO NA VARIAVEL 'b'
		System.out.println("------------------------------------------");
		
		System.out.print("\nVOCE FOI APROVADO NO EXAME DE DIRECAO?\n\nDIGITE 1 ou 2:\n(1)SIM\n(2)NAO");	//EXIBE MSG NA TELA DO USUARIO
		c = read.nextInt(); 																			//GRAVA VALOR DIGITADO NA VARIAVEL 'c'
		System.out.println("");																			//PULA UMA LINHA
		
		if(a==1 && b==1 && c==1) 																		// ESTRUTURA DE CONDICAO 'E'
		{
			System.out.println("******************************");
			System.out.println("Voce TEM direito a Habilitacao");										//SE AS TRES CONDICAO FOREM VERDADEIRAS ,EXIBE A MSG PARA O USUARIO 
			System.out.println("******************************");
		}
		else
		{
			System.out.println("**********************************");
			System.out.println("Voce NAO tem direito a Habilitacao");									//SE UMA OU MAIS CONDICAO FOREM FALSA, EXIBE NA TELA MSG PARA O USUARIO
			System.out.println("**********************************");
		}
	}

}
