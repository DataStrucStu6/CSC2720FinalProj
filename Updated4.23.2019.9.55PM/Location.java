package CSc2720FinalProj;
import java.util.LinkedList;

public class Location {
	String name;
	int order;
	
	public Location() {
		
	}
	LinkedList<String> locations = new LinkedList<>();
	
	public void addLocation(String name) {
		locations.add(name);
	}
	public void deleteLocation(String name) {
		locations.remove(name);
	}
	public int numofLocations() {
		return locations.size();
	}
	public String getAllLocations() {
		String s ="";
		for(int i=0; i<numofLocations(); i++) {
			s = s+locations.get(i)+"\n";
		}
		return s;
	}
}
