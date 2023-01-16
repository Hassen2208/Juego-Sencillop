/*
  Archivo: Ventana.java
  Autor: Marcela Mazo, Hassen Ortiz
  Email: <marcela.mazo@correounivalle.edu.co> <hasse.ortiz@correounivalle.edu.co>
  Modificado por: Marcela Mazo, Hassen Ortiz
  <marcela.mazo@correounivalle.edu.co>
  Fecha creación: 2022-10-16
  Fecha última modificación: 2022-11-30
  Versión: 2.0
  Licencia: GPL
*/
/*
 CLASE: Tablero
 INTENCIÓN: El tablero tiene como intención ser el fondo de la pantalla del juego
 - Da el tamaño del fondo
 - Titulo del juego
 - Escucha los eventos del teclado
 RELACIONES:
 - conoce el Tablero
 - conoce la pelota
 - Reconoce los eventos del teclado
 */

package View;

import Controller.Controlador;

import javax.swing.*;
import java.awt.*;



public class Ventana extends JFrame {

   private Container panel;
   private Tablero lienzo;
   Pelota p = new Pelota();

   public Ventana() {
      super("Pong");
      setSize(800, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      panel = getContentPane();
      panel.setLayout(new FlowLayout());
      setLocationRelativeTo(null);
      setResizable(false);

      lienzo = new Tablero();
      panel.add(lienzo);

   }

   public Tablero getLienzo()
   {
      return lienzo;
   }
}
