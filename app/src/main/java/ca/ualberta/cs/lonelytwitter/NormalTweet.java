package ca.ualberta.cs.lonelytwitter;

/**
 * Created by begert on 9/15/16.
 */
public class NormalTweet extends Tweet implements Tweetable{

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
