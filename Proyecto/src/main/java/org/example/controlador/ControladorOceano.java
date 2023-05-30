package org.example.controlador;

import org.example.modelo.ModeloTablaOceano;
import org.example.modelo.Oceano;
import org.example.vista.VentanaOceano;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorOceano extends MouseAdapter {
    private VentanaOceano view;
    private ModeloTablaOceano modelo;

    public ControladorOceano(VentanaOceano view) {
        this.view = view;
        modelo = new ModeloTablaOceano();
        this.view.getTblOceano().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);

        //g
        this.view.getTblOceano().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);//h
        this.view.getBtnUpdate().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            System.out.println("Evento sobre boton cargar");
            modelo.cargarDatos();
            this.view.getTblOceano().setModel(modelo);
            this.view.getTblOceano().updateUI();
        }

        if(e.getSource() == this.view.getBtnAgregar()){
            System.out.println("Evento sobre boton agregar"); // g
            Oceano oceano = new Oceano();
            oceano.setId(0);
            oceano.setUrl(this.view.getTxtUrl().getText());
            oceano.setUbiProfu(this.view.getTxtUbiProfundidad().getText());
            oceano.setUbiGeo(this.view.getTxtUbiGeografica().getText());
            oceano.setNombre(this.view.getTxtNombre().getText());
            oceano.setTamano(this.view.getTxtTamano().getText());
            if(modelo.agregarOceano(oceano)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblOceano().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Por favor revise su conexion",
                        "Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if (e.getSource() == view.getTblOceano()){
            System.out.println("Evento sobre tabla"); // g
            int index = this.view.getTblOceano().getSelectedRow();
            Oceano tmp = modelo.getOceanoAtIndex(index);
            try{
                this.view.getImagenOceano().setIcon(tmp.getImagen());
                this.view.getImagenOceano().setText("");

            }catch(MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }

        if(e.getSource() == view.getBtnEliminar()){
            System.out.println("Evento sobre boton eliminar");
            this.view.getTxtEliminar();
        }

        if(e.getSource() == view.getBtnUpdate()){
            System.out.println("Evento sobre boton Actualizar");
            this.view.getLblActualizar();
        }


    }


}
