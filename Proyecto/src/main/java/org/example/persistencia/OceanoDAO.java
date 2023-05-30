package org.example.persistencia;

import org.example.modelo.Oceano;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OceanoDAO implements InterfazDAO {

    public OceanoDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO oceano(url,ubiProfundidad,ubiGeografica,nombre,tamano) VALUES (?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Oceano) obj).getUrl());
        pstm.setString(2, ((Oceano) obj).getUbiProfu());
        pstm.setString(3, ((Oceano) obj).getUbiGeo());
        pstm.setString(4, ((Oceano) obj).getNombre());
        pstm.setString(5, ((Oceano) obj).getTamano());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE oceano SET url = ?, ubiProfundidad = ?, ubiGeografica = ?, nombre = ?, tamano = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sqlUpdate);

        pstm.setString(1, ((Oceano) obj).getUrl());
        pstm.setString(2, ((Oceano) obj).getUbiProfu());
        pstm.setString(3, ((Oceano) obj).getUbiGeo());
        pstm.setString(4, ((Oceano) obj).getNombre());
        pstm.setString(5, ((Oceano) obj).getTamano());
        pstm.setInt(6, ((Oceano) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM oceano WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM oceano";
        ArrayList<Oceano> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("oceano.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new Oceano(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM oceano WHERE id = ? ;";
        Oceano oceano = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            oceano = new Oceano(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            return oceano;
        }
        return null;
    }
}
