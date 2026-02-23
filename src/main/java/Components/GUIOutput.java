package Components;

public class GUIOutput implements Output {
    public void show(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(null, mensaje);
    }
}
