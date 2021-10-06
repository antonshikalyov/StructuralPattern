package DecoratorPattern;

public class SmartPhone extends PhoneDecorator{

    public SmartPhone(Phone phone) {
        super(phone);
    }

    public void smartOptions(){
        System.out.println("Have android OS wi-fi and etc.");
    }

    @Override
    public void baseFunction() {
        super.baseFunction();
        smartOptions();
    }
}
