package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin10 {

    public static void main(String[] args) {
        Metodos juego1 = new Metodos();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 50"));
        juego1.adivinaNum(num);
    }
}
