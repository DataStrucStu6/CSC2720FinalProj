package Project;


public class Date
{
     int month;
     int day;
    int year;


    public Date(int month, int day, int year)
    {

        this.month = checkMonth(month);
        this.day = checkDay(day);
        this.year = year;


    }

    private int checkMonth(int month)
    {
        if( month > 0 && month<= 12)
        {
            return month;
        }
        else
        {
            System.out.printf("Invalid month (%d) set to 1.", month);
            return 1;
        }
    }
    private int checkDay(int day)
    {
        int  daysPerMonth[] =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(day > 0 && day <= daysPerMonth[month])
        {
            return day;
        }
        if(month == 2 && day == 29 &&
                (year%400 == 0 || (year%4 == 0 && year %100 != 0)))
        {
            return day;
        }
        System.out.printf("Invalid day (%d) set to 1.", day);
        return 1;
    }
    //getters & setters


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    public String toString(){
        return  (year + "/" + month + "/" + day);
    }


}