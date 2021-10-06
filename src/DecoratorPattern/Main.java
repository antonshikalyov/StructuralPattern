package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Phone phone = new FlagmanSmartPhone(new SmartPhone(new PushBatoonPhone()));
        phone.baseFunction();
    }
}
