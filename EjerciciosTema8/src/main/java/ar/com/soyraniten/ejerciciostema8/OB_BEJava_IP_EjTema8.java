
package ar.com.soyraniten.ejerciciostema8;
public class OB_BEJava_IP_EjTema8 {

    public static void main(String[] args) {
        Persona usuario1 = new Persona();
        usuario1.setEdad(25);
        usuario1.setNombre("Raúl Fernández");
        usuario1.setTelefono("+5491156865987");
        
        System.out.println("El usuario " + usuario1.getNombre() + " tiene " + usuario1.getEdad() + " años de edad y su telefono es " + usuario1.getTelefono());
        
        
    }
}

class Persona{
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}