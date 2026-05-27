package Entrada;
import java.util.Scanner;

public class EntradaNumeros {
    public int x;

    public int y;

    public void pedirNumeros(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        x = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        y = scanner.nextInt();

    }
}
