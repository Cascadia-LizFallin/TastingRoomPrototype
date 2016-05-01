package com.example.liz.tastingroomprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class ClarityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Need to set methods for radio buttons and text fields
//        initRbtnClear();
//        initRbtnHazy();
//        initRbtnBright();
//        initRbtnDull();
        initBackBtn();
        initHomeBtn();
        initResetBtn();
        initExportBtn();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tasting_room, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    // Radio button for Clear
    private void initRbtnClear() {
        RadioButton list = (RadioButton) findViewById(R.id.rbtnClear);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, ClarityActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }


    // Radio button for Hazy
    private void initRbtnHazy() {
        RadioButton list = (RadioButton) findViewById(R.id.rbtnHazy);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, ClarityActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Radio button for Bright
    private void initRbtnBright() {
        RadioButton list = (RadioButton) findViewById(R.id.rbtnBright);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, ClarityActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Radio button for Dull
    private void initRbtnDull() {
        RadioButton list = (RadioButton) findViewById(R.id.rbtnDull);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, ClarityActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
*/
    // Go back one page
    private void initBackBtn() {
        Button list = (Button) findViewById(R.id.btnBack);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, AppearanceActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Goes to the landing page
    private void initHomeBtn() {
        Button list = (Button) findViewById(R.id.btnHome);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, TastingRoom.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to reset notes, with an "Are You Sure" message
    // For now, just goes to landing page
    private void initResetBtn() {
        Button list = (Button) findViewById(R.id.btnReset);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, TastingRoom.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to export notes, to save, send by bluetooth, or email
    // For now, just goes to landing page
    private void initExportBtn() {
        Button list = (Button) findViewById(R.id.btnExport);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ClarityActivity.this, TastingRoom.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

}
