package ca.ualberta.cs.lonelytwitter;


/**
 * The type Normal tweet.
 * implements the interface for tweetable and extends Tweet
 * this is the base for all tweets
 *
 * by defualt they are not important
 *
 * @see Tweetable
 * @see Tweet
 */
public class NormalTweet extends Tweet implements Tweetable{

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    @Override

    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
