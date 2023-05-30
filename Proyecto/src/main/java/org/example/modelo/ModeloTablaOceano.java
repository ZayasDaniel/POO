package org.example.modelo;

import org.example.persistencia.OceanoDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaOceano implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Oceano> datos;
    private OceanoDAO odao;

    public ModeloTablaOceano() {
        odao = new OceanoDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaOceano(ArrayList<Oceano> datos) {
        this.datos = datos;
        odao = new OceanoDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return "Id";
            case 1:
                return "Url";
            case 2:
                return "UbiProfundidad";
            case 3:
                return "UbiGeografica";
            case 4:
                return "Nombre";
            case 5:
                return "Tamaño";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Oceano tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getUrl();
            case 2:
                return tmp.getUbiProfu();
            case 3:
                return tmp.getUbiGeo();
            case 4:
                return tmp.getNombre();
            case 5:
                return tmp.getTamano();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setUbiProfu((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setUbiGeo((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setTamano((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos() {
        try {
            //ArrayList<Oceano> tirar = odao.obtenerTodo();
            //System.out.println(tirar);
            datos = odao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarOceano(Oceano oceano) {
        boolean resultado = false;
        try {
            if (odao.insertar(oceano)) {
                datos.add(oceano);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }


    public Oceano getOceanoAtIndex(int idx){
        return datos.get(idx);
    }
}
