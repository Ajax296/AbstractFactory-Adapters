package Factory;

import Components.Input;
import Components.Output;

public interface InterfaceFactory {
    Input createInput();
    Output createOutput();
}
