package ca.ualberta.cs.lonelytwitter;



public class NormalTweet extends Tweet implements Tweetable{

    public NormalTweet(String message) {
        super(message);
    }

    @Override

    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
