package CompositePattern;

public class Infantry implements Army{
    @Override
    public void ExecuteOrder() {
        System.out.println("Infantry: order complete!");
    }
}
