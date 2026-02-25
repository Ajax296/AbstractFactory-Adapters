package Components;

import javax.swing.JOptionPane;

public class GUIInputInt {

    public int readInt() {
        String valor = JOptionPane.showInputDialog("Ingrese un número entero:");

        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            return 0;
        }
    }
}