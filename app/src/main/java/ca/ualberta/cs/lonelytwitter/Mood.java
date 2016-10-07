package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by begert on 9/15/16.
 */
public abstract class Mood{


    private Date date;

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Format string.
     *
     * @return the string
     */
    public abstract String format();
}

