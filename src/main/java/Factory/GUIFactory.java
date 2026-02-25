package Factory;

import Components.*;

public class GUIFactory implements InterfaceFactory {

    private boolean useInt;

    public GUIFactory(boolean useInt) {
        this.useInt = useInt;
    }

    @Override
    public Input createInput() {
        if (useInt) {
            return new GUIInputAdapter(new GUIInputInt());
        }
        return new GUIInput();
    }

    @Override
    public Output createOutput() {
        if (useInt) {
            return new GUIOutputAdapter(new GUIOutputInt());
        }
        return new GUIOutput();
    }
}