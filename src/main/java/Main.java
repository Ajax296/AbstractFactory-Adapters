import Factory.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione interfaz:");
        System.out.println("1. Consola");
        System.out.println("2. GUI");
        System.out.println("3. Web");

        int tipoInterfaz = sc.nextInt();

        System.out.println("Seleccione tipo de dato:");
        System.out.println("1. String");
        System.out.println("2. Int");

        int tipoDato = sc.nextInt();

        boolean useInt = (tipoDato == 2);

        InterfaceFactory factory;

        switch (tipoInterfaz) {
            case 1:
                factory = new ConsoleFactory(useInt);
                break;
            case 2:
                factory = new GUIFactory(useInt);
                break;
            case 3:
                factory = new WebFactory();
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        UserInterface ui = new UserInterface(factory);

        String xd = ui.getInput().read();
        ui.getOutput().show(xd);
    }
}
