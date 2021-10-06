package CompositePattern;

public class Pilots implements Army{
    @Override
    public void ExecuteOrder() {
        System.out.println("Pilots: order complete!");
    }
}
