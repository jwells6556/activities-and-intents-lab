package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2,txt3,txt4,txt5,txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button) findViewById(R.id.submit);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1 = (EditText) findViewById(R.id.edittext1);
                txt2 = (EditText) findViewById(R.id.edittext2);
                txt3 = (EditText) findViewById(R.id.edittext3);
                txt4 = (EditText) findViewById(R.id.edittext4);
                txt5 = (EditText) findViewById(R.id.edittext5);
                txt6 = (EditText) findViewById(R.id.edittext6);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);

                intent.putExtra("noun1",txt1.getText().toString());
                intent.putExtra("noun2",txt2.getText().toString());
                intent.putExtra("adj1",txt3.getText().toString());
                intent.putExtra("adj2",txt4.getText().toString());
                intent.putExtra("animal",txt5.getText().toString());
                intent.putExtra("game",txt6.getText().toString());

                if (!txt1.equals(" ") && !txt2.equals(null) && !txt3.equals(null)
                        &&!txt4.equals(null) && !txt5.equals(null) && !txt6.equals(null) ) {
                    startActivity(intent);
                }

                else
                    Toast.makeText(getApplicationContext(),"Please fill in all fields!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
