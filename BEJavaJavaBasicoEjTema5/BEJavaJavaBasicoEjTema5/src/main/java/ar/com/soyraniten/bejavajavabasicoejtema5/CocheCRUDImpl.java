package ar.com.soyraniten.bejavajavabasicoejtema5;
public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Método SAVE definidio en la clase CocheCRUDImpl");
    }

    @Override
    public void findAll() {
        System.out.println("Método FINDALL definidio en la clase CocheCRUDImpl");
    }

    @Override
    public void delete() {
        System.out.println("Método DELETE definidio en la clase CocheCRUDImpl");
    }
    
}
