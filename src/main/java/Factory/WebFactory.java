package Factory;

import Components.*;

public class WebFactory implements InterfaceFactory{
    public Input createInput() {
        return new WebInput();
    }

    public Output createOutput() {
        return new WebOutput();
    }
}
