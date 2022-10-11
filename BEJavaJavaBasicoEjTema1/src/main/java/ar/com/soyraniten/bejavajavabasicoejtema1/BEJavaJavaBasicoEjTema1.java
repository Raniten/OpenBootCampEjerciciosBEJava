
package ar.com.soyraniten.bejavajavabasicoejtema1;
public class BEJavaJavaBasicoEjTema1 {

    public static void main(String[] args) {
        
        String[] carreras = new String [5];
        carreras[0] = "Arquitectura";
        carreras[1] = "Ciencias Economicas";
        carreras[2] = "Leyes";
        carreras[3] = "Ingenieria en Sisteams de Informacion";
        carreras[4] = "Humanidades";
        
        Student alumno1 = new Student("Perez", "Ramiro", 19, 5548987852L, carreras[0], 2022, true);
        Student alumno2 = new Student("Gomez", "Daniel", 18, 5558965287L, carreras[3], 2022, false);
        Student alumno3 = new Student();
        
        alumno3.setApellido("Martínez");
        alumno3.setNombre("juan Carlos");
        alumno3.setEdad(19);
        alumno3.setTelefono(55234789L);
        alumno3.setAnioIngreso(2021);
        alumno3.setCarrera(carreras[4]);
        alumno3.setRegular(false);
        
        Professor docente1 = new Professor();
        Professor docente2 = new Professor("Rodríguez", "Rodrigo");
        
        docente2.setEdad(45);
        docente2.setSueldo(1856.25);
        
                
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        
        System.out.println("------------------------------------------------------");
        
        System.out.println(docente1.toString());
        System.out.println(docente2.toString());
        
        
        
        
        
    }
}
class Person{
    private String apellido;
    private String nombre;
    private int edad;
    private long telefono;
    
    public Person(){
        
    }
        
    public Person(String apellido, String nombre, int edad, long telefono){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return ("Person{" + "apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + '}');
    }
    
    
        
}

class Student extends Person{
    private String carrera;
    private int anioIngreso;
    private boolean regular;
    
    public Student(){
        
    }
    
    public Student(String apellido, String nombre, int edad, long telefono, String carrera, int anioIngreso, boolean regular) {
        super(apellido, nombre, edad, telefono);
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
        this.regular = regular;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return (super.toString() + " " + "Student{" + "carrera=" + carrera + ", anioIngreso=" + anioIngreso + ", regular=" + regular + '}');
    }
    
    
    
    
}

class Professor extends Person{
    private String materia;
    private double sueldo;
    
    public Professor(){
        
    }
    
    public Professor(String apellido, String nombre){
        super(apellido, nombre, 0, 0);
    }

    public Professor(String apellido, String nombre, int edad, long telefono, String materia, double sueldo) {
        super(apellido, nombre, edad, telefono);
        this.materia = materia;
        this.sueldo = sueldo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return (super.toString() + " " + "Professor{" + "materia=" + materia + ", sueldo=" + sueldo + '}');
    }
    
    
}
