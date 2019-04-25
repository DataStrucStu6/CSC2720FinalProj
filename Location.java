package Project;

public class Location {


    String aStreet;
    String aCity;
    String aState;
    String aZip;

    public Location(String aStreet, String aCity, String aState, String aZip) {
        this.aStreet = aStreet;
        this.aCity = aCity;
        this.aState = aState;
        this.aZip = aZip;
    }
    public Location( String zip) {
        aZip = zip;

    }


    //getters & setters

    //Street
    public String getaStreet() {
        return aStreet;
    }

    public void setaStreet(String aStreet) {
        this.aStreet = aStreet;
    }

    //State
    public String getaState() {
        return aState;
    }

    public void setaState(String aState) {
        this.aState = aState;
    }
    //City

    public String getaCity() {
        return aCity;
    }

    public void setaCity(String aCity) {
        this.aCity = aCity;
    }

    //ZipCode
    public String getaZip() {
        return aZip;
    }

    public void setaZip(String aZip) {
        this.aZip = aZip;
    }


    public String toString() {
        return ( "Location ZipCode, " + aZip);
    }

}







