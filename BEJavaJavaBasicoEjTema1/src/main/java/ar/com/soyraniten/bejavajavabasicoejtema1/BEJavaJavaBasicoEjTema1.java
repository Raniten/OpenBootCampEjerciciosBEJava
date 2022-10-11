package ar.com.soyraniten.bejavajavabasicoejtema1;

public class BEJavaJavaBasicoEjTema1 {

    public static void main(String[] args) {
        
        // Tipo de datos: numeros enteros
        
        byte dia = 31;
        short mes = 12;
        int anio = 2022;
        
        System.out.println("Hoy es " + dia + " del mes " + mes + " del año " + anio);

        long telefono = 551125897856l;
        System.out.println("El telefono es: " + telefono);
        
        // Tipo de datos: numeros decimales
        
        float distancia = 345.68f;
        double velocidad = 1258.6589d;
        
        System.out.println("El asteroide está a una distancia de " + distancia + " y se acerca a una velocidad de " + velocidad);
        
        // Tipo de datos: textos
         char primerLetra = 'F';
         String nombre = "Facundo";
         
         System.out.println("El nombre es " + nombre + " y su primer letra es " + primerLetra);
         
         // Tipo de datos: lógicos
         
         boolean logica = true;
         
         System.out.println("La condicion es " + logica);
    }
}
