package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by begert on 9/15/16.
 */
public abstract class Mood{


    private Date date;

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}

