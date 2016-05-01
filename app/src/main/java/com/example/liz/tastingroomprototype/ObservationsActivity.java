package com.example.liz.tastingroomprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ObservationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observations);

        final Button ObsBtn =
                (Button) findViewById(R.id.btnObservations);

        initAppearanceBtn();
        initNoseBtn();
        initPalateBtn();
        initConclusionsBtn();
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

        // Goes to next logical page, Observations

    private void initAppearanceBtn() {
        Button list = (Button) findViewById(R.id.btnAppearance);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ObservationsActivity.this, AppearanceActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to go to Nose activity
    // For now, just goes reloads this page
    private void initNoseBtn() {
        Button list = (Button) findViewById(R.id.btnNose);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ObservationsActivity.this, ObservationsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to go to Palate activity
    // For now, just reloads this page
    private void initPalateBtn() {
        Button list = (Button) findViewById(R.id.btnPalate);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ObservationsActivity.this, ObservationsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to go to Conclusions activity
    // For now, just reloads this page
    private void initConclusionsBtn() {
        Button list = (Button) findViewById(R.id.btnConclusions);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ObservationsActivity.this, ObservationsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Go back one page
    private void initBackBtn() {
        Button list = (Button) findViewById(R.id.btnBack);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ObservationsActivity.this, TastingRoom.class);
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
                Intent intent = new Intent(ObservationsActivity.this, TastingRoom.class);
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
                Intent intent = new Intent(ObservationsActivity.this, TastingRoom.class);
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
                Intent intent = new Intent(ObservationsActivity.this, TastingRoom.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void setForEditing(boolean enabled) {


        EditText eTextObsNotes = (EditText) findViewById(R.id.editTextObsNotes);

        eTextObsNotes.setEnabled(enabled);
        if (enabled) {
            eTextObsNotes.requestFocus();
        }

    }







}
