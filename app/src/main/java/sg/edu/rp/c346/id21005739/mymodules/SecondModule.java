package sg.edu.rp.c346.id21005739.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondModule extends AppCompatActivity {

    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_module);

        tv7 = findViewById(R.id.textView7);
        tv8 = findViewById(R.id.textView8);
        tv9 = findViewById(R.id.textView9);
        tv10 = findViewById(R.id.textView10);
        tv11 = findViewById(R.id.textView11);
        tv12 = findViewById(R.id.textView12);

        Intent intentReceived7 =getIntent();
        String code2 = intentReceived7.getStringExtra("code2");
        tv7.setText("Module Code: " + code2);

        Intent intentReceived8 = getIntent();
        String name2 = intentReceived8.getStringExtra("name2");
        tv8.setText("Module Name: " + name2);

        Intent intentReceived9 = getIntent();
        int year2 = intentReceived9.getIntExtra("year2", 0);
        tv9.setText("Academic Year: " + year2);

        Intent intentReceived10 = getIntent();
        int semester2 = intentReceived10.getIntExtra("semester2", 0);
        tv10.setText("Semester: " + semester2);

        Intent intentReceived11 = getIntent();
        int credit2 = intentReceived11.getIntExtra("credit2", 0);
        tv11.setText("Module Credit: " + credit2);

        Intent intentReceived12 = getIntent();
        String venue2 = intentReceived12.getStringExtra("venue2");
        tv12.setText("Venue: " + venue2);
    }
}
