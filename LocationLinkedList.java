package CSc2720FinalProj;

public class LocationLinkedList {
    private Location head;
    private Location tail;
    private int n;
    
    public LocationLinkedList() {
	this.head = null;
	this.tail = null;
	this.n = 0;
    }
    
    public int size() {
	return this.n;
    }
    
    public Location getHead() {
	return this.head;
    }
    
    public Location getTail() {   
	return this.tail;
    }

    public void insertFirst(Location l) {
	Location temp = this.getHead();	
	this.head = l;
	l.setNext(temp);
	this.n++;
    }

    public void append(Location l) {
	if(this.n == 0) 
	    this.head = l;
	else {
	    this.getTail().setNext(l);
	    this.tail = l;	    
	}
	this.n++;
    }    
    
    public void emptyList() {
        for(int i = 0; i < this.n; i++) {
            Stars temp = this.get(i);
            temp = null;
        }

	this.head = null;
	this.tail = null;
        this.n = 0;
    }

    public Location get(int index) {
        if(index >= this.n || index < 0) {
            return null;
        }
        //sets a temp star object to the first item in list                                                                                               
        Location current = this.head;

        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void add(Location l) {
        if(this.n == 0)
            this.head = l;
        else {
            Location last = this.get(this.n-1);
            last.setNext(l);
	    this.tail = l;
        }
        this.n++;
    }
    
    public int removePortion(int from, int to) {
	if((from < 0 || from > this.n) || (to > this.n || to < 0)) {
	    return -1;
	}
	
	else  {	    
	    if(from != 0) {
		Location locFrom = this.get(from-1);
		Location locTo = this.get(to);
		Location toPlusOne = this.get(to +1);
		locFrom.setNext(toPlusOne);
		this.n = n - (to + 1 - from);
	    }	
	    else if(from == 0) {
		this.head = this.get(to + 1);
		this.n = n - (to + 1);
	    }
	}	
	return 0;		
    }
    

}
