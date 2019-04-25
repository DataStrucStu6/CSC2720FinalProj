package CSc2720FinalProj;

public class Location {
    
    private Location next;
    private Location previous;
    private String name;
    private String date;
    private String time;
    private String address;
    private String reminderFrq;
    private String reminderLoc;
    
    //default constructor
    public Location() {
        this.next = null;
        this.previous = null;
        this.name = "";
        this.date = "__/__/____";
        this.time = "__:__:__";
        this.address = "";
    }

    public Location(String name, String date, String time, String address) {
        this.next = null;
        this.previous = null;
        this.name = name;
        this.date = date;
        this.time = time;
        this.address = address;
    }      

    public Location getNext() {
        return this.next;
    }
    
    public void setNext(Location l) {
        if(l != null)
            this.next = l;
        else
            return;
    }    
    
    public Location getPrevious() {
        return this.previous;
    }
    
    public void setPrevious(Location l) {
        if(l != null)
            this.previous = l;
        else
            return;
    }    
    
    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String s) {
        this.date = s;
    }
    
    public String getTime() {
        return this.time;
    }

    public void setTime(String s) {
        this.time = s;
    }
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String s) {
        this.address = s;
    }

    public String getReminderFrq() {
        return this.reminderFrq;
    }

    public void setName(String s) {
        this.reminderFrq = s;
    }
    
    public String getReminderLoc() {
        return this.reminderLoc;
    }
    
    public void setReminderLoc(String s) {
        this.reminderLoc = s;
    }
}
