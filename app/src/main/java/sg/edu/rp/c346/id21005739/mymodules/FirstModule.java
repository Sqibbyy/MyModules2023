package sg.edu.rp.c346.id21005739.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstModule extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_module);

        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);

        Intent intentReceived =getIntent();
        String code = intentReceived.getStringExtra("code");
        tv1.setText("Module Code: " + code);

        Intent intentReceived2 = getIntent();
        String name = intentReceived2.getStringExtra("name");
        tv2.setText("Module Name: " + name);

        Intent intentReceived3 = getIntent();
        int year = intentReceived3.getIntExtra("year", 0);
        tv3.setText("Academic Year: " + year);

        Intent intentReceived4 = getIntent();
        int semester = intentReceived4.getIntExtra("semester", 0);
        tv4.setText("Semester: " + semester);

        Intent intentReceived5 = getIntent();
        int credit = intentReceived5.getIntExtra("credit", 0);
        tv5.setText("Module Credit: " + credit);

        Intent intentReceived6 = getIntent();
        String venue = intentReceived6.getStringExtra("venue");
        tv6.setText("Venue: " + venue);

    }
}