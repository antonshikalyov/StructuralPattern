package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map <String, Object> objects = new HashMap<>();

    public Flyweight getObject(String object) {
        Object obj = objects.get(object);
            if (obj == null) {
                switch (object) {
                    case "tree" -> {
                      obj = new Tree();
                         System.out.println("Create a tree!!!");
                    }
                    case "npc" -> {
                      obj = new NPC();
                         System.out.println("Create a NPC!!!");
                    }
                    case "bonus" -> {
                      obj = new Bonus();
                         System.out.println("Create a bonus!!!");
                    }
                }objects.put(object, obj);
        }return (Flyweight) obj;
    }
}
