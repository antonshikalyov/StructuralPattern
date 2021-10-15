package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class FlyMain {
    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();
        List <Flyweight> objects = new ArrayList<>();

        objects.add(flyweight.getObject("tree"));
        objects.add(flyweight.getObject("tree"));
        objects.add(flyweight.getObject("tree"));
        objects.add(flyweight.getObject("bonus"));
        objects.add(flyweight.getObject("bonus"));
        objects.add(flyweight.getObject("npc"));

        for (Flyweight flyweight1: objects)
              {
           flyweight1.setObject();
        }
    }
}
