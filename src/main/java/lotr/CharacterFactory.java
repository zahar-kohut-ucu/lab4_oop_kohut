package lotr;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.reflections.Reflections;

public class CharacterFactory {
    public lotr.Character createsCharacter() {
        Reflections refl = new Reflections("lotr");
        Set<Class<?extends lotr.Character>> lotrSubTypes = refl.getSubTypesOf(lotr.Character.class);
        lotrSubTypes.remove(lotr.Noble.class);
        List<Class<? extends lotr.Character>> lotrSubTypesList = new ArrayList<>(lotrSubTypes);

        Random rn = new Random();
        int idx = rn.nextInt(lotrSubTypes.size());
        Class<? extends lotr.Character> randomClass = lotrSubTypesList.get(idx);
        try {
            Constructor<? extends lotr.Character> constructor = randomClass.getDeclaredConstructor();
            lotr.Character product = constructor.newInstance();
            return product;
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
