
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multi;
        int x;
        int a;
        float divisao;

        System.out.print("Calculadora Online. \n");
        System.out.print("Qual o numero vai escolher? \n");
         x = input.nextInt();

        System.out.print("1 = Soma.\n2 = Multiplicar.\n3 = Subtrair.\n4 = Dividir.\n" );
            a = input.nextInt();
     
            switch(a){
                case 1:

                for(int i = 1; i<=10; i++){
                    multi = x + i;
                    System.out.println(x +" + "+ i+ " = "+multi);
        
                }break;
                case 2:
                for(int i = 1; i<=10; i++){
                    multi = x * i;
                    System.out.println(x +" X "+ i+ " = "+multi);
                    
                }break;
                case 3:
                for(int i = 1; i<=10; i++){
                    divisao = x - i;
                    System.out.println(x +" - "+ i+ " = "+divisao);
        
                }break;
                case 4:
                for(int i = 1; i<=10; i++){
                    divisao = x / i;
                    System.out.println(x +" / "+ i+ " = "+divisao);
        
                }break;
                
                default:
                System.out.print("Valor invalido! Informe um numero valido.s");

            }


    }
}