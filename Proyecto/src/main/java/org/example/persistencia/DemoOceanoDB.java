package org.example.persistencia;

import org.example.modelo.Oceano;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoOceanoDB {

    public DemoOceanoDB() {
    }

    public void insertarStatement(){
        String laUrl = "https://thumbs.dreamstime.com/b/icono-del-oc%C3%A9ano-pac%C3%ADfico-en-estilo-de-moda-dise%C3%B1o-aislado-el-fondo-blanco-vector-simple-y-135740489.jpg";
        String laUbiProfun = "No profunda";
        String laUbiGeogra = "No profunda";
        String elNombre = "Oceano Atlantico";
        String elTamano = "Muy Grande";
        try{
            Statement stm = ConexionSingleton.getInstance("oceano.db").getConnection().createStatement();

            String sqlInsert = "INSERT INTO oceano(url,ubiProfundidad,ubiGeografica,nombre,tamano) VALUES('"+laUrl+"','"+laUbiProfun+"','"+laUbiGeogra+"','"+elNombre+"','"+elTamano+"')";
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("Se insertaron " + rowCount + " registros");

        }catch(SQLException sqle){
            System.out.println("Error al conectar" + sqle.getMessage());
        }
    }

    public void insertarPreparedStatement(){
        String laUrl = "https://thumbs.dreamstime.com/b/icono-del-oc%C3%A9ano-pac%C3%ADfico-en-estilo-de-moda-dise%C3%B1o-aislado-el-fondo-blanco-vector-simple-y-135740489.jpg";
        String laUbiProfun = "profunda";
        String laUbiGeogra = "profunda";
        String elNombre = "Oceano Atlantico";
        String elTamano = "Muy peque";
        String sqlInsert = "INSERT INTO oceano(url,ubiProfundidad,ubiGeografica,nombre,tamano) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,laUrl);
            pstm.setString(2,laUbiProfun);
            pstm.setString(3,laUbiGeogra);
            pstm.setString(4,elNombre);
            pstm.setString(5,elTamano);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");

        }catch(SQLException sqle){
            System.out.println("Error Prepared Statement" + sqle.getMessage());
        }
    }

    public boolean insertarOceano(Oceano oceano){
        String sqlInsert = "INSERT INTO oceano(url,ubiProfundidad,ubiGeografica,nombre,tamano) VALUES (?,?,?,?,?)";
        int rowCount = 0;
        try{
            PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,oceano.getUrl());
            pstm.setString(2,oceano.getUbiProfu());
            pstm.setString(3,oceano.getUbiGeo());
            pstm.setString(4,oceano.getNombre());
            pstm.setString(5,oceano.getTamano());
            rowCount = pstm.executeUpdate();
            // No es necesario System.out.println("Se insertaron " + rowCount + " registros");

        }catch(SQLException sqle){
            System.out.println("Error Prepared Statement" + sqle.getMessage());
        }
        return rowCount > 0;
    }

    public Oceano buscarOceanoPorId( int id){ //Vamos a buscar un Oceano por id por ello usamos un int
        String sql = "SELECT * FROM oceano WHERE id = ? ;";
        Oceano oceano =null;
        try{
            PreparedStatement pstm = ConexionSingleton.getInstance("oceano.db").getConnection().prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                oceano = new Oceano(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            }
        }catch(SQLException sqle) {
            System.out.println("Error al buscar");
        }
        return oceano;
    }

    public ArrayList<Oceano> obtenerTodos(){
        String sql = "SELECT * FROM oceano";
        ArrayList<Oceano> resultado = new ArrayList<>();
        try{
            Statement stm = ConexionSingleton.getInstance("oceano.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                resultado.add(new Oceano(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
            }

        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
