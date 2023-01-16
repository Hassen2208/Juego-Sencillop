package Model;

import View.EventoTeclado;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.*;

public class Jugador {
    private Color login;
    private String nickname;
    private int x;
    private int y;

    public static final int ANCHO = 10;

    static final int ALTO = 60;

    public Jugador(String n, Color l, int x, int y)
    {
        nickname = n;
        login = l;
        this.x = x;
        this.y = y;
    }

    public Jugador(int i, int i1) {
    }

    public Rectangle2D getJugador() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    public void moverR1(int h)
    {
        if (EventoTeclado.w && y > limites.getMinY())
        {
            y--;
        }
        if (EventoTeclado.s && y < limites.getMaxY()-ALTO)
        {
            y++;
        }

    }

    public void moverR2(int h, Rectangle limites)
    {
        if (EventoTeclado.up && y > limites.getMinY())
        {
            y--;
        }
        if (EventoTeclado.down && y < limites.getMaxY()-ALTO)
        {
            y++;
        }

    }

    public Color getLogin() {
        return login;
    }

    public void setLogin(Color login) {
        this.login = login;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
