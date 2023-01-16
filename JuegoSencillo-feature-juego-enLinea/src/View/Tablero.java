/*
  Archivo: Tablero.java
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
 INTENCIÓN: Modelar las interacciones del juego
 - Pintar el panel del juego
 - Pintar las colisiones el juego
 - Pintar los puntos y vidas en el juego
 */

package View;

import Model.Jugador;

import java.awt.*;
import java.util.HashMap;

public class Tablero extends Canvas
{
    private HashMap<String, Jugador> jugadores = new HashMap<>();


    Jugador r1 = new Jugador( 10, 200);
    Jugador r2 = new Jugador(794 - 10 - Jugador.ANCHO, 200);
    Pelota p = new Pelota();


    public Tablero()
    {
        super();
        setBackground(Color.BLACK);
        setSize(800,500);
    }

    public void paint (Graphics g)
    {
        for (Jugador j: jugadores.values())
        {
            g.setColor(j.getLogin());
            g.fillRect(j.getX(), j.getY(), 30,30);
        }
    }

    public void setJugadores (HashMap<String, Jugador> jugadores)
    {
        this.jugadores = jugadores;
    }

    public HashMap<String, Jugador> getJugadores()
    {
        return jugadores;

    }

}

/*

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);

    }

    private void dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);

        g.fill(r1.getRaqueta());
        update();

        g.fill(r2.getRaqueta());
        update();

        g.fill(p.getShape());
        update();
    }

    //actualiza el estado (posicion) de las raquetas y pelota
    private void update() {

        p.moverPelota(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));

        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
    }

    //detecta si existe una colision entre la raqueta y la pelota
    private boolean colision(Rectangle2D r) {
        return p.getShape().intersects(r);
    }

    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(p.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(p.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (p.getScore1() == 5) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (p.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
 */
