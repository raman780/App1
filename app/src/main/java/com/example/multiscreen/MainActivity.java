package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.shiwam.multiScreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void placeOrder(View view){
        /*
          We will handle the click on the place order button here
          Build an intent to open another activity
          */
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = findViewById(R.id.editTextTextPersonName3);
        String message = "Order for" + editText1.getText().toString() + "," + editText2.getText().toString() + "&"
                + editText3.getText().toString() + "has been successfully placed";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}