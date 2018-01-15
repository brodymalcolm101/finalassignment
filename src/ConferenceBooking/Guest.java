
package ConferenceBooking;

import java.util.Objects;

public class Guest {
    private String email;
    private String name;
    
    public Guest(String n, String e){
        name = n; 
        email = e;
    }
    
    public Guest(String info){
        
        //converts name<<e@mail.com>
        int div = info.indexOf("<");
        name = info.substring(0,div);
        email = info.substring(div+1, info.length() - 1);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guest other = (Guest) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        return name + "<" + email + ">";
    }

    
}
