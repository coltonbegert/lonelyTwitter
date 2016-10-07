package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.AssertionFailedError;

import java.util.ArrayList;

/**
 * Created by colton on 2016-09-29.
 * @see TweetList
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    /**
     * Instantiates a new Tweet list test.
     */
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }


    /**
     * Test get tweet.
     */
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());

    }

    /**
     * Test has tweet.
     */
    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test add tweet.
     */
//    @Test(expected=IllegalArgumentException.class)
    public void testAddTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);

        try {
            list.add(tweet);
            fail();
        } catch(IllegalArgumentException e) {

        }

        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test delete.
     */
    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    /**
     * Test get count.
     */
    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test2");
        tweets.add(tweet);
        assertEquals(tweets.getCount(), 1);
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 2);
    }

    /**
     * Test get tweets.
     *
     */
    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        tweets.add(tweet1);
        tweets.add(tweet2);
        ArrayList<Tweet> returned = tweets.getTweets();
        assertTrue(returned.contains(tweet1));
        assertTrue(returned.contains(tweet2));

    }
}
