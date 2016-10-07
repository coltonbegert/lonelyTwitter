package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 *
 * implements the interface fro tweetable
 * this is the base for all tweets
 *
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;


    /**
     * Instantiates a new Tweet.
     * needs a string for tweet message
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * If there is a date for the tweet this constructor will be used
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    /**
     * Is important boolean.
     * this is a marker that is used by the important and normal tweets
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();


    /**
     * Sets message. must be less than 140 characters
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;


    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }




    public String getMessage() {
        return message;
    }


    public Date getDate(){
        return date;
    }
}

