package Components;

import java.util.Scanner;

public class ConsoleInputInt {

    private Scanner scanner = new Scanner(System.in);

    public int readInt() {
        System.out.print("Ingrese un número entero: ");
        return scanner.nextInt();
    }
}