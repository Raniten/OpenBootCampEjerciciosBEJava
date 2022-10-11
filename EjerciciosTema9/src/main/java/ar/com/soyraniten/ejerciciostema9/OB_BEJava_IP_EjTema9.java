
package ar.com.soyraniten.ejerciciostema9;
public class OB_BEJava_IP_EjTema9 {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        
        cliente1.setNombre("Rafael Pérez");
        cliente1.setEdad(35);
        cliente1.setTelefono("+541138385269");
        cliente1.setCredito(350);
        
        Trabajador trabajador1 = new Trabajador();
        
        trabajador1.setNombre("María Antonieta");
        trabajador1.setEdad(29);
        trabajador1.setTelefono("+541147895632");
        trabajador1.setSalario(1120);
        
        System.out.println("El cliente " + cliente1.getNombre() + " tiene " + cliente1.getEdad() + " años y su teléfono es " + cliente1.getTelefono() + " y su crédito es " + cliente1.getCredito());
        System.out.println("El Trabajador " + trabajador1.getNombre() + " tiene " + trabajador1.getEdad() + " años y su teléfono es " + trabajador1.getTelefono() + " y su salario es " + trabajador1.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}