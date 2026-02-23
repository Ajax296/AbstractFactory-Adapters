package Factory;

import Components.*;

public class ConsoleFactory implements InterfaceFactory {
    public Input createInput() {
        return new ConsoleInput();
    }

    public Output createOutput() {
        return new ConsoleOutput();
    }
}
