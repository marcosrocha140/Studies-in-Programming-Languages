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
		
		System.out.println("-----------------------------------");
		System.out.println("Pessoa Cadastrada.");

		System.out.println("Nome = "+ pessoa.getNome());
		System.out.println("Idade = "+pessoa.getIdade());
		System.out.println("Altura = "+pessoa.getAltura());
		System.out.println("CPF = "+pessoa.getCpf());


	}

}
