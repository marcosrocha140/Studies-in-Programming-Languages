
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.HashSet;
import java.util.Random;
class HelloWorld {
    public static void main(String[] args) {
        HashSet<Integer> n = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x = 0, jogador1;
        int acumulador = 0;

        System.out.println("1 - Comprar Cartar. \n2 - Passar.");
        x = sc.nextInt();
        while(x != 0){
            System.out.println("1 - Comprar Cartar. \n2 - Passar.");
             x = sc.nextInt();
            jogador1 = random.nextInt(10);
            n.add(jogador1);
            System.out.println("Carta de Nº: "+jogador1);
            acumulador = acumulador + jogador1;

        }
        
        System.out.println("Pontos: "+acumulador);
        

    }
}