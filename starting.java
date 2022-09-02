import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Digite um numero.");
        x = input.nextInt();
        System.out.print("Digite outro numero.");
        y = input.nextInt();


        while(x != y){
            System.out.print("Digite um numero.");
            x = input.nextInt();
            System.out.print("Digite outro numero.");
            y = input.nextInt();
    
        }

        System.out.print("voce saiu do loop: "+ x+y);
   

    }
}