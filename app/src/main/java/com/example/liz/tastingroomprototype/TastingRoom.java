package com.example.liz.tastingroomprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

public class TastingRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasting_room);

        final Button ObsBtn =
                (Button) findViewById(R.id.btnObservations);

        initObsBtn();
        initResetBtn();
        initExportBtn();

/*        setForEditing(false);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
 /*       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tasting_room, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
    private void initObsBtn() {
        Button list = (Button) findViewById(R.id.btnObservations);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TastingRoom.this, ObservationsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // Add functionality to erase all notes
    // For now, just goes to landing page
    private void initResetBtn() {
        Button list = (Button) findViewById(R.id.btnReset);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TastingRoom.this, TastingRoom.class);
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
                Intent intent = new Intent(TastingRoom.this, TastingRoom.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void setForEditing(boolean enabled) {


        EditText eTextWinery = (EditText) findViewById(R.id.editTextWinery);
        EditText eTextWineName = (EditText) findViewById(R.id.editTextWineName);
        EditText eTextYear = (EditText) findViewById(R.id.editTextYear);
        EditText eTextLandingNotes = (EditText) findViewById(R.id.editTextLandingNotes);

        eTextWinery.setEnabled(enabled);
        eTextWineName.setEnabled(enabled);
        eTextYear.setEnabled(enabled);
        eTextLandingNotes.setEnabled(enabled);
        if (enabled) {
            eTextWinery.requestFocus();
        }

    }


}
