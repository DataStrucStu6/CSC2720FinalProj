package Project;


import java.util.Iterator;
import java.util.Set;

public class Calendar {

  public Date date;
  public Time time;
  public Location location;


 public Calendar( Date date, Time time) {

        this.date = date;
        this.time = time;

    }

    public Calendar( Date date, Time time, Location location) {

        this.date = date;
        this.time = time;
        this.location = location;
    }

    public Calendar(  Location location) {

        this.location = location;
    }

    //Getters & Setters

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public Time getTime() {

     return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }




    @Override
    public String toString() {


     return "Task Scheduled for this date " + date + ", at " + time + "\n"
             + ("Task Address set to: " + location);

    }
}
