package Principal;

import Classes.time;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        time cronometro = new time();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Presiona 's' para iniciar el cronómetro.");
        System.out.println("Presiona 'd' para detener el cronómetro.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")) {
                cronometro.iniciar();
            } else if (input.equalsIgnoreCase("d")) {
                cronometro.detener();
                break;
            }
        }

        scanner.close();
    }
}