package Project;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task {

    private String task;

      Calendar calendar;



    public Task(String task)
    {
        this.task = task;

    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Calendar compare(Calendar c) {
        if (this.calendar.getDate().year < c.getDate().year) {
            return this.calendar;
        }
        else if (this.calendar.getDate().year > c.getDate().year) {
            return c;
        }
        else {
            if (this.calendar.getDate().month < c.getDate().month) {
                return this.calendar;
            }
            else if (this.calendar.getDate().month > c.getDate().month) {
                return c;
            }
            else {
                if (this.calendar.getDate().day < c.getDate().day) {
                    return this.calendar;
                }
                else if (this.calendar.getDate().day > c.getDate().day) {
                    return c;
                }
                else {
                    if (this.calendar.getTime().getHour() < (c.getTime().getHour())) {
                        return this.calendar;
                    }
                    else if (this.calendar.getTime().getHour() > c.getTime().getHour()) {
                        return c;
                    }
                    else {
                        if (this.calendar.getTime().getMinute() < (c.getTime().getMinute())) {
                            return this.calendar;
                        }
                        else if (this.calendar.getTime().getMinute() > c.getTime().getMinute()) {
                            return c;
                        }
                        else {
                            return this.calendar;
                        }
                    }
                }
            }
        }
    }



    public String toString(){
        return  ("Your Task is:  " + task );
    }




}
