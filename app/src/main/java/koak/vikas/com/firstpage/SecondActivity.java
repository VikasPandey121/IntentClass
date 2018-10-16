package koak.vikas.com.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView showdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showdata =  findViewById(R.id.ShowMessage);

        Intent j = getIntent();

        if(j.hasExtra("Data")){
        showdata.setText(j.getExtras().getString( "Data"));


    }}
}
