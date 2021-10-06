package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ArmyUaGeneral{
    private List<Army> army = new ArrayList<Army>();

    public void addArmyUnit(Army army){
        this.army.add(army);
    }

    public void removeArmyUnit(Army army){
        this.army.remove(army);
    }

    public void armyAlreadyGone(){
        System.out.println("Army are ready for war...");
        for (Army army : army) {
            army.ExecuteOrder();
        }
    }
}
