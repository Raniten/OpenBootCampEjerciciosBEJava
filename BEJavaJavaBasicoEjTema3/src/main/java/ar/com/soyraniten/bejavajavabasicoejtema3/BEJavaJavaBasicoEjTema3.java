
package ar.com.soyraniten.bejavajavabasicoejtema3;
public class BEJavaJavaBasicoEjTema3 {

    public static void main(String[] args) {
        
        String nombres[] = {"Harry", "Ron", "Hermione", "Severus", "Draco"};
        String nombresConcatenados = "";
         
        for (String nombre : nombres) {
            nombresConcatenados = nombresConcatenados + nombre;
        }
        
        System.out.println(nombresConcatenados);
        
        
        
        
        
    }
}
