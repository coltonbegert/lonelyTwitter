package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by begert on 9/15/16.
 */
public class Angry extends Mood {

    public Angry(Date date) {
        super(date);
    }

    @Override
    public String format() {
        return "When android studio crashes";
    }


}
