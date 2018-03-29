package com.example.thoma.todolist_bichon_thomas_b2a;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<String> items;
    private ListView listviewtask;
    private Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listviewtask = (ListView) findViewById(R.id.listviewtask);
        items = new ArrayList<String>();
        items.add("First Item");
        items.add("Second Item");
        btnsave = (Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,add_task.class);
                        startActivityForResult(intent, 129);

            }
        });

    }


    protected  void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 129) {
            Bundle extras = data.getExtras();
            String name = extras.getString("name");
            }
        }
    }


