package sg.edu.rp.c346.id19029863.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.ButtonDisplayDate);
        btnDisplayTime = findViewById(R.id.ButtonDisplayTime);
        btnReset = findViewById(R.id.ButtonReset);
        tvDisplay = findViewById(R.id.textViewDisplay);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {

                String stringResponse = tp.getCurrentHour().toString();
                String stringResponse2 = tp.getCurrentMinute().toString();
                tvDisplay.setText("Time is " + stringResponse + "." + stringResponse2);

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                int intResponse = dp.getDayOfMonth();
                int intResponse2 = dp.getMonth() + 1;
                int intResponse3 = dp.getYear();
                tvDisplay.setText("Date is " + intResponse+ "/" + intResponse2 + "/" + intResponse3);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2019, 12,1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(00);
            }
        });


    }
}
