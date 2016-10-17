package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by james on 12/7/15.
 */
public class ResultActivity extends AppCompatActivity {
    private Button mBackButton;
    TextView result;
    String [] madlib = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result_textview);
        Intent intent = getIntent();


        String noun1= intent.getStringExtra("noun1");
        String noun2= intent.getStringExtra("noun2");
        String adj1 = intent.getStringExtra("adj1");
        String adj2 = intent.getStringExtra("adj2");
        String animal = intent.getStringExtra("animal");
        String game = intent.getStringExtra("game");

        result.setText("A good vacation is where you take a trip to " +
                "some " + adj1 +  " place with your "+ adj2 + " family. Usually you go to some place" +
                " near a " + noun1 + " or up on a " + noun2 + " A good vacation is one where you " +
                "can ride " + animal + "and play "+ game);


        mBackButton = (Button) findViewById(R.id.back_button);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
