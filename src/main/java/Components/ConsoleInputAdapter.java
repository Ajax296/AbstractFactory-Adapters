package Components;

public class ConsoleInputAdapter implements Input {

    private ConsoleInputInt consoleInputInt;

    public ConsoleInputAdapter(ConsoleInputInt consoleInputInt) {
        this.consoleInputInt = consoleInputInt;
    }

    @Override
    public String read() {
        int numero = consoleInputInt.readInt();
        return String.valueOf(numero);
    }
}