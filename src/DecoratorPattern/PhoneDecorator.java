package DecoratorPattern;

public class PhoneDecorator implements Phone{
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void baseFunction() {
        phone.baseFunction();
    }
}
