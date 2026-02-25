package Components;

public class GUIInputAdapter implements Input {

    private GUIInputInt guiInputInt;

    public GUIInputAdapter(GUIInputInt guiInputInt) {
        this.guiInputInt = guiInputInt;
    }

    @Override
    public String read() {
        int numero = guiInputInt.readInt();
        return String.valueOf(numero);
    }
}