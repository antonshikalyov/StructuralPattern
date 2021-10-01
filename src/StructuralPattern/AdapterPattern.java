package StructuralPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        DVA MyPicture = new Adapter();
        MyPicture.ShowPictureDVA();
        MyPicture.ApplySettingsDVA();
    }
}

interface DVA{
    void ShowPictureDVA();
    void ApplySettingsDVA();
}

class VGA{
    void ShowPictureVGA(){
        System.out.println("Show VGA picture!");
    }
    void ApplySettingsVGA(){
        System.out.println("Apply VGA settings!");
    }
}

class Adapter extends VGA implements DVA{

    @Override
    public void ShowPictureDVA() {
        ShowPictureVGA();
    }

    @Override
    public void ApplySettingsDVA() {
        ApplySettingsVGA();
    }
}