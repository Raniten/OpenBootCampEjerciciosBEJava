
package ar.com.soyraniten.proyectoej7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ProyectoEj7_8_9 {

    public static void main(String[] args) {
        ArrayList<Character> lista = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> recuento = new HashMap<>();
        String contenido = "";
        
        try {
        InputStream in = new FileInputStream("Album.csv");
        byte[] datos = in.readAllBytes();
        String cont = new String(datos);
        contenido = cont;
        
        in.close();
        
        for (int i = 0; i < datos.length; i++) {
            lista.add((char)datos[i]);
            System.out.print(datos[i] + " ");
        }
        
            System.out.println(" ");
        //PrintStream out = new PrintStream("archivoSalida.txt");
        //out.write(datos);
        //out.close();
        } catch (Exception e) {
            System.out.println("Excepción: " + e);
        }
        lista.remove(0);
        lista.remove(0);
        lista.remove(0);
        
        System.out.println(lista);
        System.out.println(contenido);
        System.out.println(contenido.charAt(0));
        System.out.println(contenido.length());
        
        int b = contenido.charAt(0);
        System.out.println("B= " + b);
        
        System.out.println(contenido.charAt(30));
        contenido = contenido.replace((char) 65279, (char)0);
        contenido = contenido.replace(';', (char)0);
        
        System.out.println(contenido);
        
        
    }
}
