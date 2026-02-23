package Factory;

import Components.*;

public class GUIFactory implements InterfaceFactory {
    public Input createInput(){
        return new GUIInput();
    }

    public Output createOutput(){
        return new GUIOutput();
    }
}
