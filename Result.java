package com.rt.plaigarismtool;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class Result extends AppCompatActivity {
        TextView tvResult;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = findViewById(R.id.tvResult);

        sp = getSharedPreferences("myp1",MODE_PRIVATE);
        String text = sp.getString("text","");

        Map<String, String> parameter = new HashMap<>();

        parameter.put("q", text);
        parameter.put("location", "Austin, Texas, United States");
        parameter.put("hl", "en");
        parameter.put("gl", "us");
        parameter.put("google_domain", "google.com");
        parameter.put("api_key", "af1470bd88f8a11c1cbc6b3ec8a194e4cd731f1b00e18f2d72d0849e925e0e72");

        //GoogleSearchResults client = new GoogleSearchResults(parameter);
       // JsonObject results = client.getJson();
    }


}
