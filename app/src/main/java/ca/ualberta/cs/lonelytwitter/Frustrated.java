package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by begert on 9/15/16.
 */
public class Frustrated extends Mood {


    public Frustrated(Date date) {
        super(date);
    }

    @Override
    public String format() {

        return "Apps not compiling";
    }
}
