package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        /*DemoLibroDB demo = new DemoLibroDB();
        demo.insertarStatement();

        System.out.println("Con Prepared");
        demo.insertarPreparedStatement();

        Libro libro = new Libro(0,"El juego","Desconocido");

//        if (demo.insertarLibro(libro)){
//            System.out.println("Se inserto correctamente");
//        }else{
//            System.out.println("No se insertó");
//        }

        System.out.println(demo.buscarLibroPorId(100));

        System.out.println("-------------------------");
        for (Libro tmp: demo.obtenerTodos()) {
            System.out.println("Libro: " + tmp );
            System.out.println("Titulo: " + tmp.getTitulo() );
        }
        */

        LibroDAO ldao = new LibroDAO();


        // Para insertar Libros
        /*Libro libro = new Libro(0,"Piensa en Java","Bruce Eckel");
        try{
            if(ldao.insertar(libro)){
                System.out.println("Se insertó correctamente");
            }else{
                System.out.println("No se pudó insertar....");
            }
        }catch(SQLException sqle){
            System.out.println("Error al insertar");
        }*/

        //Modificar Datos
        /*Libro libro = new Libro(1,"El perfume"," Patrick Süskind");
        try{
            if(ldao.update(libro)){
                System.out.println("Se modificó correctamente");
            }else{
                System.out.println("No se pudó modificar....");
            }
        }catch(SQLException sqle){
            System.out.println("Error al modificar");
        }*/



        //Borrar o Eliminacion
       /* try{
            if (ldao.delete("9")){
                System.out.println("Se eliminó correctamente");
            }else{
                System.out.println("No se pudó eliminar");
            }
        }catch(SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }*/


        try{
            Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("-------------");
            for (Object lib:ldao.obtenerTodo()) {
                System.out.println((Libro)lib);
            }
        }catch(SQLException sqle){
            System.out.println("Error");
            System.out.println(sqle.getMessage());
        }

    }
}