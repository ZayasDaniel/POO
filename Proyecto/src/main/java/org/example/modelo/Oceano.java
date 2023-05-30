package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Oceano {
    private int id;
    private String url;
    private String ubiProfundidad;
    private String  ubiGeografica;
    private String nombre;
    private String tamano;


    public Oceano() {
    }

    public Oceano(int id, String url, String ubiProfu, String ubiGeo, String nombre, String tamano) {
        this.id = id;
        this.url = url;
        this.ubiProfundidad = ubiProfu;
        this.ubiGeografica = ubiGeo;
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUbiProfu() {
        return ubiProfundidad;
    }

    public void setUbiProfu(String ubiProfu) {
        this.ubiProfundidad = ubiProfu;
    }

    public String getUbiGeo() {
        return ubiGeografica;
    }

    public void setUbiGeo(String ubiGeo) {
        this.ubiGeografica = ubiGeo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Oceano{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", ubiProfu='" + ubiProfundidad + '\'' +
                ", ubiGeo='" + ubiGeografica + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }

    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen );
    }
}
