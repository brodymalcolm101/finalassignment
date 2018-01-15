
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UltraMap {

    public static void main(String[] args) {
        HashMap<String, HashSet<Pokemon>> m = new HashMap<String, HashSet<Pokemon>>();

        //start electric collection and the rest
        m.put("ELECTRIC", new HashSet());
        m.put("WATER", new HashSet());
        m.put("GRASS", new HashSet());

        m.get("ELECTRIC").add(new Pokemon(25, "Pikachu"));
        m.get("ELECTRIC").add(new Pokemon(100, "Voltorb"));
        m.get("ELECTRIC").add(new Pokemon(26, "Raichu"));

        m.get("WATER").add(new Pokemon(7, "Squirtle"));
        m.get("WATER").add(new Pokemon(9, "Blastoise"));

        m.get("GRASS").add(new Pokemon(1, "Bulbasaur"));
        m.get("GRASS").add(new Pokemon(2, "Ivysaur"));
        m.get("GRASS").add(new Pokemon(3, "Venusaur"));
        m.get("GRASS").add(new Pokemon(45, "Vileplume"));

        System.out.println(m);

        //getting just the grass type
        HashSet g = m.get("GRASS");
        System.out.println("Here are the grass Pokémon");
        Iterator it = g.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //get a list of just keys -> comes out as a "SET"
        Set types = m.keySet();

        it = types.iterator();
        System.out.println("Here are the different types of Pokémon");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
};

/* 
        
        This is if you are not pointing to a SET
        
        m.put("FIRE", new Pokemon(4, "Charmander"));
        m.put("WATER", new Pokemon(12, "Squirtle"));
        m.put("ELECTRIC", new Pokemon(25, "Pikachu"));
        m.put("ELECTRIC", new Pokemon(26, "Raichu"));
        System.out.println(m);
 */


    

