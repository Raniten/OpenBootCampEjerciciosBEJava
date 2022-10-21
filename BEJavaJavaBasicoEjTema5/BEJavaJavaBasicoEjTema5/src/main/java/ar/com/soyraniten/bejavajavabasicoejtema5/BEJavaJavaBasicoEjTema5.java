

package ar.com.soyraniten.bejavajavabasicoejtema5;

public class BEJavaJavaBasicoEjTema5 {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
