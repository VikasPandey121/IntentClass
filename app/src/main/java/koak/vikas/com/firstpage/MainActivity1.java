package koak.vikas.com.firstpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity1 extends AppCompatActivity {


    Button button1, button2, button3;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        txt = findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity1.this, SecondActivity.class);

                intent.putExtra("Data", txt.getText().toString().trim());
                startActivity(intent);


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9315973945"));
                startActivity(i1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent i2 = new Intent((Intent.ACTION_VIEW), Uri.parse("http://www.google.com"));
              //  Intent i2 = new Intent((Intent.ACTION_VIEW) );
                Intent i2 = new Intent((Intent.ACTION_VIEW),Uri.parse("geo:")) ;

                startActivity(i2);


            }
        });

    }
}