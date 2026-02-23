package Components;

import javax.swing.JOptionPane;

public class GUIInput implements Input {
    public String read() {
        String valor = JOptionPane.showInputDialog("Ingrese un valor:");
        return valor;
    }
}
