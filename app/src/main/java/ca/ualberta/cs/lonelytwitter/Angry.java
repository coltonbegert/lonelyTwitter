package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by begert on 9/15/16.
 * @see Mood
 */
public class Angry extends Mood {

    /**
     * Instantiates a new Angry.
     * extends mood with a string of text
     *
     * @param date the date
     */
    public Angry(Date date) {
        super(date);
    }

    @Override
    public String format() {
        return "When android studio crashes";
    }


}
