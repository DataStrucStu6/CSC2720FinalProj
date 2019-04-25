package Project;
import Project.Calendar;


import java.util.*;


public class Main {


    public static void main(String[] args) {


        //Task Obj
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your Task: ");
        String task = sc.nextLine();

        Task t = new Task(task);

        List<Task> taskList = new LinkedList<>();
        taskList.add(t);

        //User set Calendar

        //Date Obj

        System.out.println("Please enter task date as format (mm/dd/yyyy): ");
        String dateInString = sc.nextLine();

        int month = Integer.parseInt(dateInString.substring(0, 2));
        int day = Integer.parseInt(dateInString.substring(3, 5));
        int year = Integer.parseInt(dateInString.substring(6, 10));

        Date date = new Date(month, day, year);

        //Time Obj

        System.out.println("Please enter task Time as 24-hour format (hh:mm)");
        String timeInString = sc.nextLine();
        int hour = Integer.parseInt(timeInString.substring(0, 2));
        int minute = Integer.parseInt(timeInString.substring(3, 5));


        Time time = new Time(hour, minute);

        //Calendar Obj

        Calendar calendar = new Calendar(date, time);

        List<Calendar> calList = new LinkedList<Calendar>();
        calList.add(calendar);

        //Location Obj

        System.out.println("Please enter task Address as format (ZipCode): ");
        String zip = sc.nextLine();

        Location zipCode = new Location(zip);

        List<Location> locList = new LinkedList<Location>();
        locList.add(zipCode);

        //Cal & Loc

        Calendar cl = new Calendar(date, time, zipCode);

        List<Calendar> calLoc = new LinkedList<Calendar>();
        calLoc.add(cl);


        //Task Info
        System.out.println(t);
        System.out.println(cl);

        //This one works with task as key but doesn't work to implement comparable of zipcode
        Map<String, List<Calendar>> map1 = new HashMap<>();
        map1.put(task, calLoc);

        System.out.println(Arrays.asList(map1));

        //Compare ZipCode with user current location
        // (keep asking where use is until zipcode matches it and returns task associated with/
        //Location Obj

        //CHeck Location
        System.out.println("Where are you currently driving by? Address as format (ZipCode): ");
        String zip1 = sc.nextLine();
        Location zipCode1 = new Location(zip1);

        List<Location> locList1 = new LinkedList<Location>();
        locList1.add(zipCode1);



        //find key from value in HashMap Java - one to one mapping

        /*public static void printMapList (Map < String, List <Calendar>> t){

            // First
            Set<String> keys = t.getTask();
            Iterator<String> i = (Iterator<String>) keys.iterator();

            while (i.hasNext()) {
                String key = i.next();

                System.out.println(key + " : " + t.calendar);
            }
            map1.forEach( );
*/



        }


}
