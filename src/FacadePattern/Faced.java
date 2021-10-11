package FacadePattern;

public class Faced {
    CarValue value = new CarValue();
    RunEngine run = new RunEngine();
    StartRide start = new StartRide();

    void faced(){
        if (value.sostoyanie) {
            run.RunEngine();
            start.start();
        }
        else {
            System.out.println("Езда запрещена!");
        }
    }
}
