package CompositePattern;

public class Composite {
    public static void main(String[] args) {
        Army infantry = new Infantry();
        Army pilots = new Pilots();
        Army tanks = new Tanks();

        ArmyUaGeneral generalArmy = new ArmyUaGeneral();
        ArmyUaGeneral generalArmy1 = new ArmyUaGeneral();


        generalArmy.addArmyUnit(infantry);
        generalArmy.addArmyUnit(infantry);
        generalArmy.addArmyUnit(pilots);
        generalArmy.addArmyUnit(tanks);
        generalArmy.armyAlreadyGone();


        generalArmy.armyAlreadyGone();
        System.out.println();
        generalArmy.removeArmyUnit(infantry);
        generalArmy.armyAlreadyGone();

    }
}


