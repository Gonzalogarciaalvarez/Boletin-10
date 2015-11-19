package boletin.pkg10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {

    int numramdom = (int) (Math.random() * 50);
    boolean respuesta = false;

    public void numeroAletorio() {
        System.out.println(numramdom);
        while (respuesta != true) {
            int numres = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una respuesta"));
            if ((numres - numramdom) > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos");
            }
            if ((numres - numramdom) <= 20 && (numres - numramdom) >= 10) {
                JOptionPane.showMessageDialog(null, "Lejos");
            }
            if ((numres - numramdom) < 10 && (numres - numramdom) > 5) {
                JOptionPane.showMessageDialog(null, "Cerca");
            }
            if ((numres - numramdom) <= 5 && numres != numramdom) {
                JOptionPane.showMessageDialog(null, "Muy cerca");
            }
            if (numres == numramdom) {
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Has acertado");
            }
        }
    }
}
