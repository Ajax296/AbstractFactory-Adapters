package Components;

public class GUIOutputAdapter implements Output {

    private GUIOutputInt guiOutputInt;

    public GUIOutputAdapter(GUIOutputInt guiOutputInt) {
        this.guiOutputInt = guiOutputInt;
    }

    @Override
    public void show(String mensaje) {
        try {
            int numero = Integer.parseInt(mensaje);
            guiOutputInt.showInt(numero);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Error: El mensaje no es un número válido."
            );
        }
    }
}