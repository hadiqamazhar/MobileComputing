package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);
        final EditText editText = findViewById(R.id.editTextName);
        Button button = findViewById(R.id.buttonInsert);

        String[] array = {"Hadiqa","Hafsa", "Zoya"};

        final ArrayList<String> friendList = new ArrayList<>(asList(array));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);

        listView.setAdapter(arrayAdapter);

//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                    //Log.i("Hello",friendList.get(i));
//                    Toast.makeText(getApplicationContext(),"You clicked" + friendList.get(i),Toast.LENGTH_SHORT).show();
//                }
//            });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameToInsert = editText.getText().toString();
                friendList.add(nameToInsert);
                arrayAdapter.notifyDataSetChanged();

            }
        });
    }
}