package CSc2720FinalProj;
import java.util.LinkedList;

public class Note {
	String note;
	
	public Note() {
		
	}
	LinkedList<String> tasks = new LinkedList<String>();
	
	public String getNotes(int t) {
		return tasks.get(t-1);
	}
	public void addNotes(String note) {
		tasks.add(note);
	}
	public void deleteNotes(int n) {
		tasks.remove(n-1);
	}
	public String getAllNotes() {
		String s ="";
		for(int i=1; i<=numofTasks(); i++) {
			s = s+"-"+getNotes(i)+"\n";
		}
		return s;
	}
	public int numofTasks() {
		return tasks.size();
	}
}
