package FacadePattern;

public class CarValue {
    boolean sostoyanie = true;
    boolean carValue(){
        if (sostoyanie){
            System.out.println("Можно ехать!");
        }
        else {
            System.out.println("Машина не готова, нужен ремонт!");
        }
        return sostoyanie;
    }
}

