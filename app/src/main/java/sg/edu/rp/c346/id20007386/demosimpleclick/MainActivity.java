package sg.edu.rp.c346.id20007386.demosimpleclick;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView tvDisplay;
    EditText etInput;
    ToggleButton Tb;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link Java with UI
        btnDisplay = findViewById(R.id.btnDisplay);
        etInput = findViewById(R.id.etData);
        tvDisplay = findViewById(R.id.tvResult);
        Tb = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);

        //behaviour
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    tvDisplay.setText("He says " + stringResponse);
                }
                else{
                    // Write the code when female selected
                    tvDisplay.setText("She says " + stringResponse);
                }
                tvDisplay.setText(stringResponse);
            }
        });

        Tb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Add your code for the action
                        if (Tb.isChecked() == true) {
                            etInput.setEnabled(true);
                            etInput.setBackgroundColor(Color.TRANSPARENT);
                        } else {
                            etInput.setEnabled(false);
                            etInput.setBackgroundColor(Color.RED);
                        }
                    }
                }
        );

    }
}