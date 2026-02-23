package Components;

public class WebOutput implements Output {
    public void show(String mensaje) {
        System.out.println("Mostrando en la web: " + mensaje);
    }
}
