package com.example.no4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText DeditText;
    EditText TeditText;
    TextView TviewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DeditText =(EditText)findViewById(R.id.TravelDistance);
        TeditText =(EditText)findViewById(R.id.DrivingTime);
        TviewText =(TextView) findViewById(R.id.TotalCost);

        final Button button = (Button) findViewById(R.id.Calculation);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double T=0;
                double TTD=0;
                double TTD1=0;
                double TTD2=0;
                double TDT=0;
                double TDT1=0;
                double TDT2=0;
                double TD = Double.parseDouble(DeditText.getText().toString());
                double DT = Double.parseDouble(TeditText.getText().toString());
                if(DeditText.getText().toString().matches("") && TeditText.getText().toString().matches("")) {
                    Toast toast = Toast.makeText(MainActivity.this, "Please enter distance and time!!", Toast.LENGTH_LONG);
                    toast.show();
                }
                else
                {
                    TTD1=TD/250;
                    TTD+=TTD1;
                    TTD2=TD%250;
                        if(TTD2<1)
                        {
                            TTD+=1;
                        }

                        TTD=TTD*5;

                        TDT1=DT/60;
                        TDT+=TDT1;
                        TDT2=DT%60;
                        if(TDT2<1)
                        {
                            TDT+=1;
                        }
                        TDT=TDT*5;
                }
                T=TTD+TDT+75;
                TviewText.setText(String.valueOf(T));
            }
        });
    }
}
