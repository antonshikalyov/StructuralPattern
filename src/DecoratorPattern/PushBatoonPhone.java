package DecoratorPattern;

public class PushBatoonPhone implements Phone{
    @Override
    public void baseFunction() {
        System.out.println("Can calls!");
    }
}
