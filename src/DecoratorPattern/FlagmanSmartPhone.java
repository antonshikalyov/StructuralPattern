package DecoratorPattern;

public class FlagmanSmartPhone extends PhoneDecorator{

    Phone phone;

    public FlagmanSmartPhone(Phone phone) {
        super(phone);
    }

    public void flagmanOptions(){
        System.out.println("Have nfc and more performance");
    }

    @Override
    public void baseFunction() {
        super.baseFunction();
        flagmanOptions();
    }

}
