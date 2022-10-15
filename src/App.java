import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Random aleatorio = new Random();
        // criar numero aleatorio inteiro entre 0 e 20
        int num = aleatorio.nextInt(0,20);
        Scanner leia = new Scanner(System.in);
        int digitado;
        do{
            System.out.println("\t\t\t *** Vamos adivinhar um numero");
            System.out.println("Pene em um numeor inteiro entre 0 a 20");
            System.out.println("Agora digite o numero");
            digitado = leia.nextInt();

        }while(num != digitado);

        System.out.println("Parabens voce acertou");
        System.out.println();
        

    }
}
