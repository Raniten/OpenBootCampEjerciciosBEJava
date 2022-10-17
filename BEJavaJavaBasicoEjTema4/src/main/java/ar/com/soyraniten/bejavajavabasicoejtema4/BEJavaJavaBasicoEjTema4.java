
package ar.com.soyraniten.bejavajavabasicoejtema4;

public class BEJavaJavaBasicoEjTema4 {

    public static void main(String[] args) {
        
        SmartPhone telefono1 = new SmartPhone();
        SmartWatch reloj1 = new SmartWatch("SW125", 4, "ELE12", 4, "Cuero", true, true);
        
        telefono1.setMemoriaCapacidadGB(16);
        telefono1.setModelo("XV168");
        telefono1.setCantCamaras(4);
        telefono1.setTamanioPantalla(8);
        telefono1.setProcesador("Xi12f40");
                
        System.out.println("El Smart Phone modelo " + telefono1.getModelo() + " viene provisto con el nuevo procesador " + telefono1.getProcesador() + 
                ", tiene una capacidad de memoria de " + telefono1.getMemoriaCapacidadGB() + " GB, posee " + telefono1.getCantCamaras() + " camaras dorsales");
        
        String sumerg;
        String pulsoMide;
        
        if (reloj1.isSumergible()) {
            sumerg = "El reloj es sumergible. ";
            
        } else {
            sumerg = "El reloj NO es sumergible. ";
        }
        
        if (reloj1.isMidePulso()) {
            pulsoMide = "El reloj mide las pulsaciones. ";
            
        } else {
            pulsoMide = "El reloj NO mide las pulsaciones. ";
        }
        
        System.out.println("El Smart Watch modelo " + reloj1.getModelo() + " viene provisto con el nuevo procesador " + reloj1.getProcesador() + 
                "GB, tiene una capacidad de memoria de " + reloj1.getMemoriaCapacidadGB() + " GB. " + sumerg + pulsoMide);
        
        
        
    }
}

class SmartDevice{
    String procesador;
    int memoriaCapacidadGB;
    String modelo;
    int tamanioPantalla;
        
    public SmartDevice(){
        
    }
    public SmartDevice(String procesador, int memoriaCapacidadGB, String modelo, int tamanioPantalla){
        this.procesador = procesador;
        this.memoriaCapacidadGB = memoriaCapacidadGB;
        this.modelo = modelo;
        this.tamanioPantalla = tamanioPantalla;
            }

    public int getMemoriaCapacidadGB() {
        return memoriaCapacidadGB;
    }

    public void setMemoriaCapacidadGB(int memoriaCapacidadGB) {
        this.memoriaCapacidadGB = memoriaCapacidadGB;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
}

class SmartPhone extends SmartDevice {
    int cantCamaras;
    
    public SmartPhone(){
        
    }
    
    public SmartPhone(String procesador, int memoriaCapacidadGB, String modelo, int tamanioPantalla, int cantCamaras){
        super(procesador, memoriaCapacidadGB, modelo, tamanioPantalla);
        this.cantCamaras = cantCamaras;
    }

    public int getCantCamaras() {
        return cantCamaras;
    }

    public void setCantCamaras(int cantCamaras) {
        this.cantCamaras = cantCamaras;
    }
    
    
}

class SmartWatch extends SmartDevice{
    String tipoMalla;
    boolean sumergible;
    boolean midePulso;
        
    public SmartWatch(){
                
    }
    
    public SmartWatch (String procesador, int memoriaCapacidadGB, String modelo, int tamanioPantalla, 
            String tipoMalla, boolean sumergible, boolean midePulso){
        super(procesador, memoriaCapacidadGB, modelo, tamanioPantalla);
        this.tipoMalla = tipoMalla;
        this.sumergible = sumergible;
        this.midePulso = midePulso;
    }

    public String getTipoMalla() {
        return tipoMalla;
    }

    public void setTipoMalla(String tipoMalla) {
        this.tipoMalla = tipoMalla;
    }

    public boolean isMidePulso() {
        return midePulso;
    }

    public void setMidePulso(boolean midePulso) {
        this.midePulso = midePulso;
    }

    public boolean isSumergible() {
        return sumergible;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }
    
    
    
}
