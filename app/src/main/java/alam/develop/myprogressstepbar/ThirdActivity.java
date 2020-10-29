package alam.develop.myprogressstepbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class ThirdActivity extends AppCompatActivity {

    String[] descriptionData = {"Uno", "Dos", "Tres", "Cuatro"};
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irutas = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(irutas);
                stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
            }
        });

    }
}
