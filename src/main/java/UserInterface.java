import Factory.InterfaceFactory;
import Components.*;

public class UserInterface {
    private Input input;
    private Output output;

    public UserInterface(InterfaceFactory factory) {
        this.input = factory.createInput();
        this.output = factory.createOutput();
    }

    public Input getInput() {
        return input;
    }

    public Output getOutput() {
        return output;
    }
}
