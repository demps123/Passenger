package ie.gmit.passenger;

public class Passenger {

    public String t;

    public Passenger(String title) {
        setTitle(title);
    }

    public void setTitle(String t) {
        if(t.equals("Mr") || t.equals("Mrs") || t.equals("Ms")) {
            this.t = t;
        }
        else {
            throw new IllegalArgumentException("Invalid title provided");
        }
    }

    public String getTitle() {
        return t;
    }
}
