
import java.util.HashSet;


public class SetsEx1 {

  
    public static void main(String[] args) {
        HashSet<String> b = new HashSet<String>();
        b.add("Pikachu");
        b.add("Charmander");
        b.add("Squirtle");
        b.add("Butterfree");
        b.add("Pikachu");
        System.out.println(b);
        //can't have duplicates
        
      
          System.out.println("Pikachu".hashCode());
          System.out.println("Charmander".hashCode());
          System.out.println("Squirtle".hashCode());
          System.out.println("Butterfree".hashCode());
          b.remove("Squirtle");
          System.out.println("I now have " + b.size() + " Pokemon");
          b.clear(); //empties the collection
          System.out.println("I now have " + b.size() + " Pokemon");
         
       
        
    }
    
}
