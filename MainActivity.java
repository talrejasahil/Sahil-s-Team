package com.rt.plaigarismtool;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        sp = getSharedPreferences("myp1",MODE_PRIVATE);

        //final String text = editText.getText().toString();
        //final String split = text.split(".")[0];


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = editText.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("text",text);
                editor.commit();
                Intent a = new Intent(MainActivity.this, Result.class);
                startActivity(a);
            }
        });
    }
}
