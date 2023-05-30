package org.example;

import org.example.controlador.ControladorOceano;
import org.example.modelo.Oceano;
import org.example.persistencia.DemoOceanoDB;
import org.example.persistencia.OceanoDAO;
import org.example.vista.VentanaOceano;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaOceano view = new VentanaOceano("Proyecto Final ZRMD 2208");
        ControladorOceano controller = new ControladorOceano(view);
    }
}