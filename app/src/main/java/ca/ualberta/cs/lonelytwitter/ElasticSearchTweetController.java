package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import java.util.ArrayList;
import java.util.List;

import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;

/**
 * Created by colton on 2016-10-20.
 */

public class ElasticSearchTweetController {
    // made the database a variable
    public static final String databaseAddress = "http://cmput301.softwareprocess.es:8080";
    private static JestDroidClient client;

    public static class AddTweetsTask extends AsyncTask<NormalTweet, Void, Void> {
        protected Void doInBackground(NormalTweet... tweets) {
            verifySettings();
            for (NormalTweet tweet : tweets){
                Index index = new Index.Builder(tweet).index("testing").type("tweet").build();

                try {
                    DocumentResult result = client.execute(index);
                    if (result.isSucceeded()) {
                        tweet.setId(result.getId());


                    } else {
//                        fixed spelling error from elsatic to elastic
                        Log.i("Error", "Failed to insert the tweet into elastic search");

                    }
                }
                catch (Exception e) {
                    Log.i("Error", "The application failed to build and send the tweets");
                }
            }


            return null;
        }
    }
    public static class GetTweetsTask extends AsyncTask<String, Void, ArrayList<NormalTweet>> {


        protected ArrayList<NormalTweet> doInBackground(String... search_parameters) {
            verifySettings();
            ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

            Search search = new Search.Builder("{\"size\": 50," + search_parameters)
                    .addIndex("testing")
                    .addType("tweet")
                    .build();
            try {
                SearchResult result = client.execute(search);
                if (result.isSucceeded()){
                    List<NormalTweet> foundTweets = result.getSourceAsObjectList(NormalTweet.class);
                    tweets.addAll(foundTweets);

                } else {
//                    fixed spelling errors
                    Log.i("Error","The search executed but didn't work");
                }
            } catch (Exception e){
                Log.i("Error", "Executing the get tweets method failed");
            }
            return tweets;
        }
    }

    public static void verifySettings(){
        if (client == null) {
//            made the database location a constant variable
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder(databaseAddress);
            DroidClientConfig config = builder.build();

            JestClientFactory factory = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();
        }
    }
}
