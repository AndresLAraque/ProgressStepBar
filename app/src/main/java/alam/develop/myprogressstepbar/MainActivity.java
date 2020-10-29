package alam.develop.myprogressstepbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class MainActivity extends AppCompatActivity {

    String[] descriptionData = {"Uno", "Dos", "Tres", "Cuatro"};
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irutas = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(irutas);
                stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
            }
        });
    }
}
