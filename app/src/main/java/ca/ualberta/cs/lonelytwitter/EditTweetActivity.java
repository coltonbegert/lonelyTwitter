package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.editTextView);
        textView.setText(bundle.getString("EditTweetActivityText"));

    }
}
