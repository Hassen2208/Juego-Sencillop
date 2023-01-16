package Controller;

import Model.Cliente;
import Model.Despachador;
import Model.Jugador;
import View.Ventana;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.awt.Rectangle;

public class Controlador implements KeyListener
{
    public static boolean w;
    Ventana vista;
    public HashMap<String,Jugador> jugadores = new HashMap<>();
    public String jugadorActivo = "";
    public Despachador despachador;

    public Controlador(Ventana v)
    {
        vista = v;
        vista.getLienzo().setJugadores( jugadores);
    }

    public void keyTyped(KeyEvent keyEvent)
    {
    }

    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_UP:
                jugadores.get(jugadorActivo).moverR1(-2, Rectangle Limits);
                break;
            case KeyEvent.VK_RIGHT:
                jugadores.get(jugadorActivo).moverR1(2);
                break;
            case KeyEvent.VK_DOWN:
                jugadores.get(jugadorActivo).moverR2(2);
                break;
            case KeyEvent.VK_LEFT:
                jugadores.get(jugadorActivo).moverR2(-2);
                break;
        }



        int _x = jugadores.get(jugadorActivo).getX();
        int _y = jugadores.get(jugadorActivo).getY();
        despachador.send("mover:" + jugadorActivo + "," + _x + "," + _y);
    }

    public void keyReleased(KeyEvent keyEvent)
    {
    }

    private void ingresar()
    {
        String color = JOptionPane.showInputDialog(vista, "Color: ");
        despachador.send("login:"+color);
        jugadorActivo = color;
    }

    public void conectar()
    {
        Cliente conexion = new Cliente("localhost", 1234);
        try {
            despachador = conexion.conectar(vista);

            if (despachador != null) {
                ingresar();
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Error: " + e.getMessage());
        }
    }
}
