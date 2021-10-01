package StructuralPattern;

public class BridgePattern {
    public static void main(String[] args) {
        Device samsungLaptop = new Laptop(new Samsung());
        samsungLaptop.getDevise();

        Device asusLaptop = new Laptop(new Asus());
        asusLaptop.getDevise();

        Device samsungPhone = new Smartphone(new Samsung());
        samsungPhone.getDevise();

        Device samsungWatch = new SmartWatch(new Samsung());
        samsungWatch.getDevise();

        Device xiaomiWatch = new SmartWatch(new Xiaomi());
        xiaomiWatch.getDevise();
    }
}

abstract class Device{
    ConcreateDevise cd;

    public Device(ConcreateDevise cd) {
        this.cd = cd;
    }
    abstract void getDevise();
}

interface ConcreateDevise{
    void CreateDevise(String device);
}

class Laptop extends Device {

    public Laptop(ConcreateDevise cd) {
        super(cd);
    }

    @Override
    void getDevise() {
        cd.CreateDevise("Laptop ");
    }
}

class Smartphone extends Device {

    public Smartphone (ConcreateDevise cd) {
        super(cd);
    }

    @Override
    void getDevise() {
        cd.CreateDevise("Smart phone ");
    }
}

class SmartWatch extends Device {

    public SmartWatch(ConcreateDevise cd) {
        super(cd);
    }

    @Override
    void getDevise() {
        cd.CreateDevise("Smart watch ");
    }
}


class Samsung implements ConcreateDevise{
    @Override
    public void CreateDevise(String device) {
        System.out.println(device + "Samsung");
    }
}

class Xiaomi implements ConcreateDevise{
    @Override
    public void CreateDevise(String device) {
        System.out.println(device + "Xiaomi");
    }
}

class Asus implements ConcreateDevise{
    @Override
    public void CreateDevise(String device) {
        System.out.println(device + "Asus");
    }
}