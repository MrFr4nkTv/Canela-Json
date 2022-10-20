/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.entidades.Usuario;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        //Agregar pasos https://www.recetasnestle.com.mx/recetas/frankie-brownie-halloween-postre-horno
        // 
        
        List<Paso> pasos = new ArrayList<>();
        
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescripcion("Precalentar el horno a 180°");
        pasos.add(paso1);
        
        Paso paso2 = new Paso();
        paso2.setOrden(2);
        paso2.setDescripcion("Agrega topos a la salsa y mezcla suavemente para que absorba un poco de salsa");
        pasos.add(paso2);
        
        receta.setPasos(pasos);
        
        receta.setDificultad(Dificultad.INTERMEDIO);
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setCorreoElectronico("rodolfoelreno@gmail.com");
        usuario.setContrasena("hesoyam");
        
        receta.setUsuario(usuario);
        
        System.out.println("*** RECETAS NESTLÉ");
        System.out.println("Subido por " + receta.getUsuario().getNombre());
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones: " + receta.getNumeroPorciones());
        System.out.println("Tiempo de preparación: " +receta.getTiempo() + " minutos");
        
        
        System.out.println("Ingredientes:");
        for(Ingrediente i : receta.getIngredientes()){
            System.out.println("- " + i.getNombre());
        }
        
        System.out.println("Pasos:");
        for(Paso p : receta.getPasos()){
            System.out.println(p.getOrden()+ ".- " + p.getDescripcion()) ;
        }
        
        
        
    }       
}       