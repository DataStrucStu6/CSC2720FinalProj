package Project;



import java.util.*;

public class Main {



    public static void main(String[] args) {



        //Task Obj
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your Task: ");
        String task = sc.nextLine();

        Task t= new Task(task);

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

        Calendar cl = new Calendar(date,time,zipCode);

        List<Calendar> calLoc = new LinkedList<Calendar>();
        calLoc.add(cl);


        //Task Info
        System.out.println(t);
        System.out.println(cl);

         //This one works with task as key but doesn't work to implement comparable of zipcode
        //Map<List<Task>, List> map1 = new HashMap<>();
        //map1.put(taskList,calList);
        //map1.put(taskList, locList);
        //map1.put(taskList, calLoc);


        //Compare ZipCode with user current location
        // (keep asking where use is until zipcode matches it and returns task associated with/

        // HashMaps
        Map<String, List> map1 = new HashMap<>();
        System.out.println("Where are you (ZipCode)? ");
        String zipObj = sc.nextLine();
        Location newLoc = new Location(zipObj);
        map1.put("One",calList);
        map1.put("Two", locList);
        map1.put("Three", calLoc);


        //find key from value in HashMap Java - one to one mapping
        String stValue= "two";
        String strKey = null;
        for(Map.Entry entry: map.entrySet()){
            if(stValue.equals(entry.getValue())){
                strKey = entry.getKey();
                break; //breaking because its one to one map
            }
        }

        System.out.println("Task from Hash table Key:  "+ strKey +" value: " + stValue);
    }



        /*System.out.println(t);

        Iterator<String> i = (Iterator<String>) t.iterator();

        System.out.println("Set iterator:");

        while (i.hasNext()) {
            System.out.println(i.next());

        }*/






    }


}