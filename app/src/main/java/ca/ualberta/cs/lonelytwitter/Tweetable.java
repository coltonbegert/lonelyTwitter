package ca.ualberta.cs.lonelytwitter;



import java.util.Date;


/**
 * The interface Tweetable.
 * @see Tweet
 * @see NormalTweet
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();
}
