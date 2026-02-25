package Factory;

import Components.*;

public class ConsoleFactory implements InterfaceFactory {

    private boolean useInt;

    public ConsoleFactory(boolean useInt) {
        this.useInt = useInt;
    }

    @Override
    public Input createInput() {
        if (useInt) {
            return new ConsoleInputAdapter(new ConsoleInputInt());
        }
        return new ConsoleInput();
    }

    @Override
    public Output createOutput() {
        if (useInt) {
            return new ConsoleOutputAdapter(new ConsoleOutputInt());
        }
        return new ConsoleOutput();
    }
}
