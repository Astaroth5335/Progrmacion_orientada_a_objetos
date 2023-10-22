import javax.swing.JOptionPane;

import model.Correo;
import model.Password;

public class App {
    public static void main(String[] args) throws Exception {

        String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        String apellido = JOptionPane.showInputDialog("Cual es su apellido?");
        String compania = JOptionPane.showInputDialog("A que compañia pertenece?");
        
        Password password = new Password(12);
        Correo correo = new Correo(nombre, apellido, compania, password.getContrasenia());

        System.out.println(correo);

    }
}
