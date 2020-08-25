package com.example.bookstoresimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    private Button buttonSave = null;
    private Button buttonReset = null;

    private EditText titelText = null;
    private EditText autorText = null;
    private EditText verlagText = null;
    private TextView isbnText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        final Button buttomHome = (Button) findViewById(R.id.buttonHome);
        buttomHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonHomeClicked();
            }
        });
        final Button buttomAdd = (Button) findViewById(R.id.buttonAdd);
        buttomAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonAddClicked();
            }
        });
        final Button buttomHList = (Button) findViewById(R.id.buttonList);
        buttomHList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonListClicked();
            }
        });

        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("doButtonSaveClick");
            }
        });

        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("doButtonResetClick");
            }
        });

        // COMMENT 23

        autorText = (EditText)findViewById(R.id.bookTitel);
        titelText = (EditText) findViewById(R.id.bookAutor);
        verlagText = (EditText) findViewById(R.id.bookVerlag);
        isbnText = (EditText) findViewById(R.id.bookIsbn);

        Intent intent = getIntent();
        if( intent != null )  {
            String message = intent.getStringExtra( "message" );
            TextView lParam = (TextView) findViewById(R.id.listParam);
            lParam.setText(message);
        }
    }

    // COmment 2. User im Team!!

    private void buttonHomeClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        String message = "Come from Add!";
        intent.putExtra("message", message);
        startActivity(intent);
    }

    private void buttonAddClicked() {
        Intent intent = new Intent(this, AddActivity.class);
        String message = "Come from Add!";
        intent.putExtra("message", message);
        startActivity(intent);
    }

    private void buttonListClicked() {
        Intent intent = new Intent(this, ListActivity.class);
        String message = "Come from Add!";
        intent.putExtra("message", message);
        startActivity(intent);
    }
}
