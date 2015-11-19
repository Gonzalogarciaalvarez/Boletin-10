package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {

    public void adivinaNum(int num) {

        boolean respuesta = false;
        while (respuesta != true) {
            int res = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero"));
            if (res < num) {
                JOptionPane.showMessageDialog(null, "El numero es mayor");
            }
            if (res > num) {
                JOptionPane.showMessageDialog(null, "El numero es menor");
            }
            if (res == num) {
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Has acertado");
            }

        }
    }

}
