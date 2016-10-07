package ca.ualberta.cs.lonelytwitter;


/**
 * The type Important tweet.
 * @see Tweet
 */
public class ImportantTweet extends Tweet{

    /**
     * Instantiates a new Important tweet.
     * extends tweet to mark it important
     *
     * @see Tweet
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
