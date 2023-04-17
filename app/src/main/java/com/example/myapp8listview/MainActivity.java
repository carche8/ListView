package com.example.myapp8listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres[] = {"Carmen", "Juan", "Carlos", "Raquel", "Maria", "Lucas", "Diego", "Daniela", "Virginia", "Fernando"};
    private String edades[] = {"23", "12", "25", "48", "44", "16", "23", "76", "3", "18"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años.");
            }
        });




    }
}