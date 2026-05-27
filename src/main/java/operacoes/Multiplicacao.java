package operacoes;

import Entrada.EntradaNumeros;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println(entradaNumeros.x * entradaNumeros.y);
    }
}