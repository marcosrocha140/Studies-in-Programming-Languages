package revision;

import java.util.Scanner;

public class Pessoas_Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu Nome:");
		pessoa.setNome(sc.nextLine());
	
		
		System.out.println("Digite sua Idade:");
		pessoa.setIdade(sc.nextInt());
		
		
		System.out.println("Digite sua Altura:");
		pessoa.setAltura(sc.nextFloat());
		
		System.out.println("Digite seu CPF:");
		pessoa.setCpf(sc.nextInt());		
		
		
		System.out.println("Qual seu genero:\n 1 - Masculino.\n 2 - Feminino.");
		pessoa.setGenero(sc.nextInt());
		
		switch(pessoa.getGenero()) {
			case 1:
				pessoa.setStr("Masculino");
			
			break;
			case 2:
				pessoa.setStr("Feminino");
			break;
			
			default:
				System.out.println("Valor Invalido. escolha 1 ou 2.\n");
		}
		
		if(pessoa.getStr() == "Feminino") {
			System.out.println("Bem Vinda: "+pessoa.getNome());
		}else {
			System.out.println("Bem Vindo: "+pessoa.getNome());
		}
		
		
		
		/*System.out.println("-----------------------------------");
		System.out.println("Pessoa Cadastrada.");

		System.out.println("Nome = "+ pessoa.getNome());
		System.out.println("Idade = "+pessoa.getIdade());
		System.out.println("Altura = "+pessoa.getAltura());
		System.out.println("CPF = "+pessoa.getCpf());
		System.out.println("Genero = "+pessoa.getStr());*/


	}

}
