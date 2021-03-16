package dam.agamers.gtidic.udl.myenvents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nou_event(View view) {
        Intent i = new Intent(this, NouEvent.class);
        startActivity(i);
        finish();
    }
}