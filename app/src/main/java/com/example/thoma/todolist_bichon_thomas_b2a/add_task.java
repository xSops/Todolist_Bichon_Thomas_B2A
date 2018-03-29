package com.example.thoma.todolist_bichon_thomas_b2a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class add_task extends AppCompatActivity {

    private ArrayAdapter<String> itemsAdapter;
    private Spinner priority;
    private Button btnAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        priority = (Spinner) findViewById(R.id.priority);

        btnAddItem = (Button) findViewById(R.id.btnAddItem);

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent() ;
                Bundle extras = new Bundle();
                extras.putString("name", "valeur");
                intent.putExtras(extras);
                setResult(RESULT_OK, intent);
                finish();
            }
        });



    }
    public void AddTask(View v) {
        EditText taskname = (EditText) findViewById(R.id.taskname);
        String itemText = taskname.getText().toString();
        itemsAdapter.add(itemText);
        taskname.setText("");
    }

}
