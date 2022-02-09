package ie.gmit.passenger;

public class Passenger {

    public String title;
    public String name;

    public Passenger(String title, String name) {
        setTitle(title);
        setName(name);
    }

    public void setTitle(String t) {
        if(t.equals("Mr") || t.equals("Mrs") || t.equals("Ms")) {
            this.title = t;
        }
        else {
            throw new IllegalArgumentException("Invalid title provided");
        }
    }
    public String getTitle() {
        return title;
    }

    public void setName(String n) {
        if(n.length() >= 3) {
            this.name = n;
        }
        else {
            throw new IllegalArgumentException("Invalid name provided");
        }
    }
    public String getName() {
        return name;
    }

}
