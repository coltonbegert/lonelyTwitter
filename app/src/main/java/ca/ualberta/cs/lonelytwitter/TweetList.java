package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by colton on 2016-09-29.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;

    public TweetList() {

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
}
