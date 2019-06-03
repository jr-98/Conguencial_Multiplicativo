/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conguencial_multiplicativo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author @Jonathan_Tillaguango_J
 */
public class Main extends vista {

//clase principal en donde se despliegan todas las interfaces de analisis de datos
    public static void main(String[] args) {

        String menu = 
                "1) Pruba de series\n"
                + "2) Prueba de Kolmogorox Smironov\n"
                + "3) Prueba de Poker\n"
                + "4) Prueba de las corrida\n"
                + "5) Salir";
        //int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una de las sigueintes opciones\n" + menu, JOptionPane.INFORMATION_MESSAGE));
        boolean keep = true;
      do{
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una de las siguientes opciones\n" + menu, JOptionPane.INFORMATION_MESSAGE));
       // if(option<=5){
           // option = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una de las siguientes opciones\n" + menu, JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1://Prueba de serie
                    vista GUImultiplicativo = new vista();
                    GUImultiplicativo.show(true);
                    break;
                case 2://Prueba de Kolmogorox Smironov
                    break;
                case 3://Prueba de Poker
                    GUITestPoker poker = new GUITestPoker();
                    poker.show(true);
                    break;
                case 4://Prueba de las corridas
                    break;
                case 5://salir
                    JOptionPane.showMessageDialog(null,"Seguro que desae salir","Salir",JOptionPane.INFORMATION_MESSAGE);
                      break;
                default:
                  JOptionPane.showMessageDialog(null, "Elija una opcion valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            break;
        }while (keep);
            
        }

    }


