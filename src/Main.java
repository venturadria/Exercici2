import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);

        int[] numerointroduit = new int[6];

        for (int i = 0; i < numerointroduit.length; i++) {
            System.out.println("Introdueix el valor número " + (i + 1) + ".");
            numerointroduit[i] = llegir.nextInt();
        }

        for (int i = numerointroduit.length - 1; i >= 0; i--) {
            System.out.println(numerointroduit[i]);
        }

        for (int i = 0; i < numerointroduit.length; i++) {
            System.out.println(numerointroduit[i]);
        }

    }
}
