package Components;

public class ConsoleOutputAdapter implements Output {

    private ConsoleOutputInt consoleOutputInt;

    public ConsoleOutputAdapter(ConsoleOutputInt consoleOutputInt) {
        this.consoleOutputInt = consoleOutputInt;
    }

    @Override
    public void show(String mensaje) {
        try {
            int numero = Integer.parseInt(mensaje);
            consoleOutputInt.showInt(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El mensaje no es un número válido.");
        }
    }
}