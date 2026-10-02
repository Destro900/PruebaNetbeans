package pruebagit;
import java.util.Scanner;
public class PruebaGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Dame una nota");
        nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4 ->
                System.out.println("Insuficiente, has supendido");
            case 5 ->
                System.out.println("Suficiente, has aprobado de milagro");
            case 6 ->
                System.out.println("Bien, has aprobado");
            case 7, 8 ->
                System.out.println("Notable, has aprobado con buena nota");
            case 9, 10 ->
                System.out.println("Sobresaliente, sigue así");
            default ->
                System.out.println("Error: nota no valida");
        }
    }
}