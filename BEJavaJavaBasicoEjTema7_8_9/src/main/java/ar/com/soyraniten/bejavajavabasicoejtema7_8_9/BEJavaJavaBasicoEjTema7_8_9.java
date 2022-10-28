package ar.com.soyraniten.bejavajavabasicoejtema7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class BEJavaJavaBasicoEjTema7_8_9 {

    public static void main(String[] args) {
        
        System.out.println("PUNTO 0 ++++++++++++++++++++++++++++++++++");
        
        String cadena = "Hola mundo";
        String cadenaInvertida = reverse(cadena);
        System.out.println("La cadena invertida de " + cadena + " es: " + cadenaInvertida);
        
        System.out.println("PUNTO 1 ++++++++++++++++++++++++++++++++++");
        
        String[] punto1 = {"Hola", "mundo", "cómo", "están", "todos"};
        for (String cadIterador : punto1) {
            System.out.println(cadIterador);
        }
        
        System.out.println("PUNTO 2 ++++++++++++++++++++++++++++++++++");

        int arrayEnteros2[][] = new int[2][5];
        for (int i = 0; i < arrayEnteros2.length; i++) {
            for (int j = 0; j < arrayEnteros2[i].length; j++) {
                arrayEnteros2[i][j] = (int)(Math.random()*25+1);
            }            
        }
        
        for (int i = 0; i < arrayEnteros2.length; i++) {
            for (int j = 0; j < arrayEnteros2[i].length; j++) {
                System.out.println("El número del array en la posición [" + i + "][" + j + "] es: " + arrayEnteros2[i][j]);
            }            
        }
        
        System.out.println("PUNTO 3 ++++++++++++++++++++++++++++++++++");
        
        Vector<Integer> vectorInt3 = new Vector();
        vectorInt3.add((int)(Math.random()*25+1));
        vectorInt3.add((int)(Math.random()*25+1));
        vectorInt3.add((int)(Math.random()*25+1));
        vectorInt3.add((int)(Math.random()*25+1));
        vectorInt3.add((int)(Math.random()*25+1));
        System.out.println(vectorInt3);
        vectorInt3.remove(1);
        vectorInt3.remove(1);
        System.out.println(vectorInt3);
        
        System.out.println("PUNTO 4 ++++++++++++++++++++++++++++++++++");
        
        // PUNTO 4: Si declaramos un vector con su capacidad por defecto, y con todos los agregados
        //se va incrementando esa capacidad en distintos momentos, la operación de incrementar
        // su capacidad cada vez, es costosa en términos de recuros de computador. Es conveniente declarar el vector
        //con la capacidad estimada que va a tener a lo largo de su uso
        
        System.out.println("PUNTO 5 ++++++++++++++++++++++++++++++++++");
        
        ArrayList<String> arrLstStr5 = new ArrayList<>(4);
        arrLstStr5.add("Hola ");
        arrLstStr5.add("mundo ");
        arrLstStr5.add("cómo ");
        arrLstStr5.add("están ");
        
        LinkedList<String> lnkList5 = new LinkedList<>(arrLstStr5);
        
        for (int i = 0; i < arrLstStr5.size(); i++) {
            System.out.println(arrLstStr5.get(i));
        }
        System.out.println("- - - - - - - - - - - - - - - - -");
        for (int i = 0; i < lnkList5.size(); i++) {
            System.out.println(lnkList5.get(i));
        }
        System.out.println("PUNTO 6 ++++++++++++++++++++++++++++++++++");
        
        ArrayList<Integer> arrLstInt6 = new ArrayList<>(10);
                
        //El ArrayList se crea con una capacidad determinada (10), pero sigue estando vacío, pro lo tanto size() devuelve 0
        
        for (int i = 0; i < 10; i++) { 
            arrLstInt6.add(i+1);
        }
        
        System.out.println(arrLstInt6);
        
        for (int i = 0; i<arrLstInt6.size(); i++) { 
            if (arrLstInt6.get(i) % 2 != 0){
                arrLstInt6.remove(i);
            }
        }
        
        for (int i = 0; i<arrLstInt6.size(); i++) { 
            System.out.println(arrLstInt6.get(i));
        }
        
        System.out.println("PUNTO 7 ++++++++++++++++++++++++++++++++++");
        int dividendo7 = 12;
        int divisor7 = 0;
        int division = 0;
        
        try{
            division = DividePorCero(dividendo7, divisor7);
            System.out.println("La división de " + dividendo7 + " por " + divisor7 + " es: " + division);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");
        
        
        System.out.println("PUNTO 8 ++++++++++++++++++++++++++++++++++");
        
        try {
        InputStream in = new FileInputStream("archivoEntrada.txt");
        byte[] datos = in.readAllBytes();
        in.close();
        
        PrintStream out = new PrintStream("archivoSalida.txt");
        out.write(datos);
        out.close();
        } catch (Exception e) {
            System.out.println("Excepción: " + e);
        }
        
           
        
        
    }
    
    
    public static String reverse(String texto) {
        String cadenaReversa = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            cadenaReversa = cadenaReversa + texto.charAt(i);
        }
        return cadenaReversa;
    }
    
    public static int DividePorCero(int dividendo, int divisor) throws ArithmeticException {
        try {
        int resultado = dividendo / divisor;
        return (resultado);
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
}

