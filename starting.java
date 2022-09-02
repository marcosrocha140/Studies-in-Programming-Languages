import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        float media;

        System.out.print("Digite um numero: ");
        x = input.nextInt();

        System.out.print("Digite a outro numero:");
        y = input.nextInt();

        media = (x + y) / 2;

        if(media < 7){
            System.out.println("Reprovado! Media = "+ media);

        }else{
            System.out.println("Aprovado! Media = 8" + media);

        }

    }
}