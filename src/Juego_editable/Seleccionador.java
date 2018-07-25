/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego_editable;

import javax.swing.JOptionPane;

/**
 *
 * @author LabingXEON
 */
public class Seleccionador {

    public static void main(String[] args) {
        Seleccionador ok = new Seleccionador();
        ok.estatico();

    }

    public void estatico() {
        Object color = JOptionPane.showInputDialog(null, "Seleccione Un Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Amarillo", "Azul", "Rojo"}, "Seleccione");
    }

    public void Dinamico() {
        
    }
}
