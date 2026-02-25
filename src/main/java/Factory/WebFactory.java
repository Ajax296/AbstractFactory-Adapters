package Factory;

import Components.*;

//No se creo un adaptador dado que no teniamos diseñado la parte web
public class WebFactory implements InterfaceFactory{
    public Input createInput() {
        return new WebInput();
    }

    public Output createOutput() {
        return new WebOutput();
    }
}
