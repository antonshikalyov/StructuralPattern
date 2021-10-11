package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ArmyUaGeneral implements Army{
    private List<Army> army = new ArrayList<Army>();

    public void addArmyUnit(Army army){
        this.army.add(army);
    }

    public void removeArmyUnit(Army army){
        this.army.remove(army);
    }

    @Override
    public void ExecuteOrder() {
        System.out.println("Army are ready for war...");
        for (Army army : army) {
            army.ExecuteOrder();
        }
    }
}
