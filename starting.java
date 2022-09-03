import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Calculadora Online. \n");
        System.out.print("Qual o numero vai escolher para multiplicar? \n");

        x = input.nextInt();
        int multi;

        for(int i = 1; i<=10; i++){
            multi = x * i;
            System.out.println(x +" X "+ i+ " = "+multi);

        }


    }
}