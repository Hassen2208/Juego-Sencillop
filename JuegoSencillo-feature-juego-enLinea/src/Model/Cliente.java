package Model;

import View.Tablero;
import View.Ventana;

import java.net.*;

public class Cliente
{

    private String hostName;
    private int portNumber;

    public Cliente (String hostName, int portNumber)
    {
        this.hostName = hostName;
        this.portNumber = portNumber;
    }

    public Despachador conectar (Ventana gui) throws Exception
    {

        Socket kkSocket = new Socket(hostName, portNumber);

        Despachador lector = new Despachador(kkSocket);
        lector.gui = gui;
        lector.start();

        return lector;
    }

}
