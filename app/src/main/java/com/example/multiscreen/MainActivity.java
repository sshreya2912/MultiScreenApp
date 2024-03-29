package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String msg="com.example.multiscreen.order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void placeOrder(View view)
    {
         //this code runs when place order is pressed
        //build an intent to open another activity
        Intent intent=new Intent(this,OrderActivity.class);
        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);
        EditText editText3=findViewById(R.id.editText3);
        String message="Order for "+editText1.getText().toString() +","+editText2.getText().toString() +","+editText3.getText().toString()+"has been succesfully placed" ;
       intent.putExtra(msg,message);
        startActivity(intent);//starts the next activity
    }
}