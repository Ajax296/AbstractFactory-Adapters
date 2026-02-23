package Components;

import java.util.Scanner;

public class ConsoleInput implements Input {
    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        String valor = scanner.nextLine();
        return valor;
    }
}
