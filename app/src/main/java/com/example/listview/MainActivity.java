package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1 ,arrayList);
        listView.setAdapter(adapter);
        btnonClick();
    }
    public void btnonClick(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String result = editText.getText().toString();
                arrayList.add(result);
            }
        });

    }
}
