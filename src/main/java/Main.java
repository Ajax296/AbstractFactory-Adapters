import Factory.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una interfaz:");
        System.out.println("1. Interfaz de consola");
        System.out.println("2. Interfaz gráfica");
        System.out.println("3. Interfaz web");

        int opcion = sc.nextInt();

        InterfaceFactory factory;

        switch (opcion) {
            case 1:
                factory = new ConsoleFactory();
                break;
            case 2:
                factory = new GUIFactory();
                break;
            case 3:
                factory = new WebFactory();
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        UserInterface ui = new UserInterface(factory);
    }
}
