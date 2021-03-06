package ConferenceBooking;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class Conference {
    Conference conf;
    private String name, description;
    private HashSet<Guest> people;
    private ImageIcon image;
    
    public Conference(String n, String d, String img){
        name = n; 
        description = d;
        people = new HashSet();
        image = new ImageIcon(getClass().getResource(img));
        if(img=="html.PNG")
            people.add(new Guest("Bob", "htmlpro@abc.com"));
        if(img=="java.PNG"){
            people.add(new Guest("Joe", "javapro@xyz.com"));
            people.add(new Guest("Amy", "javagirl@xyz.com"));
    }}

    public void save(PrintWriter pw, String key){
        Iterator it = people.iterator();
        while(it.hasNext())
        {
             pw.println(key);
             pw.println(it.next());
        }
    }
    
    
    public boolean signup(Guest g){
        //if guest is already added
        
        
        
        return true; 
    }
    
    public boolean remove(Guest g){
        //get the guest and remove
        //.contains to see if guest is in there or not
       return true;
    
        
    }
    
    
    public String getName() {
        return name;
    }

   

    public String getDescription() {
        return description;
    }

    
    

    public HashSet<Guest> getPeople() {
        return people;
    }

  

    public ImageIcon getImage() {
        return image;
    }

  
    public boolean signup(){
        return true;
    }
    
    public boolean remove(){
        return true;
    }

  
}
