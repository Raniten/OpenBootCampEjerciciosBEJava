
package ar.com.soyraniten.bejavajavabasicoejtema2;

public class BEJavaJavaBasicoEjTema2 {

    public static void main(String[] args) {
        
        float tasaIVA = 21.0f;
        float precioNeto = 258.17f;
        float precioFinal;
        
        precioFinal = calculoPrecioFinal(tasaIVA, precioNeto);
        
        System.out.println("El precio final del prodcuto con IVA incluido es: " + precioFinal);
        
        
    }
    
    public static float calculoPrecioFinal(float tasaIva, float precioNeto){
        return(precioNeto + precioNeto * tasaIva / 100);
    }
}
