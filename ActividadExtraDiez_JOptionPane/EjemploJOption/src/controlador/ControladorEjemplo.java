package controlador;

import vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjemplo extends MouseAdapter {

    private Ventana view;
    public ControladorEjemplo(Ventana view) {
        this.view = view;

        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == view.getBtnMensaje()){
            //System.out.println("Mensaje");

            ImageIcon icono = new ImageIcon("exito.png");
            //JOptionPane.showMessageDialog(view,"Hola desde el ejemplo"); // Primera Opción
            //JOptionPane.showMessageDialog(view,"Hola desde el ejemplo","Titulo Personalizado",JOptionPane.ERROR_MESSAGE); // Segunda Opción
            JOptionPane.showMessageDialog(view,"Hola desde el ejemplo",
                    "Titulo Personalizado",
                    JOptionPane.WARNING_MESSAGE,icono); // Tercera Opción
        }
        if(e.getSource() == view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view,"Ejemplo de entrada",
                    "Titulo Personalizado",
                    JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);

        }
        if(e.getSource() == view.getBtnOpcion()){
            //System.out.println("Opción");
            int respuesta = JOptionPane.showConfirmDialog(view, "¿Estas seguro de borrar el registro?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);

            if(respuesta == JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste opcion SI");

            }else{
                view.getLblResultado().setText("Elegiste opcion NO");

            }
        }
    }
}