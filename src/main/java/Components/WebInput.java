package Components;

public class WebInput implements Input {
        public String read() {
            // Simulación de lectura desde una interfaz web
            String valor = "Valor ingresado desde la web";
            System.out.println("Simulando lectura desde la web: " + valor);
            return valor;
        }
}
