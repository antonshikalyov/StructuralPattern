package FacadePattern;

public class StartRide {
    boolean ruchnik = false;
    void start(){
        if (ruchnik == false){
            System.out.println("Можно ехать!");
        }
        else{
            System.out.println("Снимите ручник!!!");
        }
    }
}
