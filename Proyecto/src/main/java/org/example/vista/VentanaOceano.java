package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaOceano extends JFrame {
    private JLabel lblId;
    private JLabel lblUrl;
    private JLabel lblUbiProfundidad;
    private JLabel lblUbiGeografica;
    private JLabel lblNombre;
    private JLabel lblTamano;
    private JTextField txtId;
    private JTextField txtUrl;
    private JTextField txtUbiProfundidad;
    private JTextField txtUbiGeografica;
    private JTextField txtNombre;
    private JTextField txtTamano;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblOceano;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; // Formulario para dar de alta un oceano
    private JPanel panel2; // Aqui voy a poner la tabla que muestre los datos
    private JPanel panel3; // Mostrar imagen del elemento seleccionado en la tabla
    private JPanel panel4;
    private JLabel imagenOceano;
    private JButton btnEliminar; //h
    private JLabel lblEliminar;
    private JTextField txtEliminar;
    private JLabel lblActualizar;
    private JTextField txtActualizar;
    private JButton btnUpdate;

    public VentanaOceano(String title) throws HeadlessException {
        super(title);

        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        // Panel 1

        panel1  = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(133, 179, 227));

        lblId = new JLabel("Id:");
        lblUrl = new JLabel("Url:");
        lblUbiProfundidad = new JLabel("UbiProfundidad:");
        lblUbiGeografica = new JLabel("UbiGeografica:");
        lblNombre = new JLabel("Nombre:");
        lblTamano = new JLabel("Tamano:");

        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtUrl = new JTextField(30);
        txtUbiProfundidad = new JTextField(15);
        txtUbiGeografica = new JTextField(15);
        txtNombre = new JTextField(15);
        txtTamano = new JTextField(10);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);

        panel1.add(lblUrl);
        panel1.add(txtUrl);

        panel1.add(lblUbiProfundidad);
        panel1.add(txtUbiProfundidad);

        panel1.add(lblUbiGeografica);
        panel1.add(txtUbiGeografica);

        panel1.add(lblNombre);
        panel1.add(txtNombre);

        panel1.add(lblTamano);
        panel1.add(txtTamano);

        panel1.add(btnAgregar);


        // Panel 2

        panel2  = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(199, 152, 245));

        btnCargar = new JButton("Cargar Datos");
        panel2.add(btnCargar);

        tblOceano = new JTable();
        scrollPane = new JScrollPane(tblOceano);

        panel2.add(scrollPane);


        // Panel 3

        panel3  = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(232, 178, 124));

        imagenOceano = new JLabel("......");
        panel3.add(imagenOceano);



        // Panel 4

        panel4  = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(234, 117, 138));

        lblEliminar = new JLabel("Oceano a eliminar (Id)");
        txtEliminar = new JTextField(5);

        lblActualizar = new JLabel("Oceano a actualizar (Id)");
        txtActualizar = new JTextField(5);

        btnEliminar = new JButton("Eliminar ");
        btnUpdate = new JButton("Actualizar");

        panel4.add(lblEliminar);
        panel4.add(txtEliminar);

        panel4.add(lblActualizar);
        panel4.add(txtActualizar);

        panel4.add(btnEliminar);
        panel4.add(btnUpdate);


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JLabel getLblUbiProfundidad() {
        return lblUbiProfundidad;
    }

    public void setLblUbiProfundidad(JLabel lblUbiProfundidad) {
        this.lblUbiProfundidad = lblUbiProfundidad;
    }

    public JLabel getLblUbiGeografica() {
        return lblUbiGeografica;
    }

    public void setLblUbiGeografica(JLabel lblUbiGeografica) {
        this.lblUbiGeografica = lblUbiGeografica;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblTamano() {
        return lblTamano;
    }

    public void setLblTamano(JLabel lblTamano) {
        this.lblTamano = lblTamano;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JTextField getTxtUbiProfundidad() {
        return txtUbiProfundidad;
    }

    public void setTxtUbiProfundidad(JTextField txtUbiProfundidad) {
        this.txtUbiProfundidad = txtUbiProfundidad;
    }

    public JTextField getTxtUbiGeografica() {
        return txtUbiGeografica;
    }

    public void setTxtUbiGeografica(JTextField txtUbiGeografica) {
        this.txtUbiGeografica = txtUbiGeografica;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtTamano() {
        return txtTamano;
    }

    public void setTxtTamano(JTextField txtTamano) {
        this.txtTamano = txtTamano;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblOceano() {
        return tblOceano;
    }

    public void setTblOceano(JTable tblOceano) {
        this.tblOceano = tblOceano;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() { //h
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JTextField getTxtEliminar() {
        return txtEliminar;
    }

    public void setTxtEliminar(JTextField txtEliminar) {
        this.txtEliminar = txtEliminar;
    }

    public JLabel getLblActualizar() {
        return lblActualizar;
    }

    public void setLblActualizar(JLabel lblActualizar) {
        this.lblActualizar = lblActualizar;
    }

    public JTextField getTxtActualizar() {
        return txtActualizar;
    }

    public void setTxtActualizar(JTextField txtActualizar) {
        this.txtActualizar = txtActualizar;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    //h
    public JLabel getImagenOceano() {
        return imagenOceano;
    }

    public void setImagenOceano(JLabel imagenOceano) {
        this.imagenOceano = imagenOceano;
    }

    public void limpiar(){
        txtUrl.setText("");
        txtUbiProfundidad.setText("");
        txtUbiGeografica.setText("");
        txtNombre.setText("");
        txtTamano.setText("");
    }
}
