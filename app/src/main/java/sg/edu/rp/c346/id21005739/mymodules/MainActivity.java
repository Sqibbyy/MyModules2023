package sg.edu.rp.c346.id21005739.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvM1;
    TextView tvM2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvM1 = findViewById(R.id.textViewM1);
        tvM2 = findViewById(R.id.textViewM2);

        tvM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("semester", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        tvM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondModule.class);
                intent.putExtra("code2", "C450");
                intent.putExtra("name2", "iPad Programming");
                intent.putExtra("year2", 2020);
                intent.putExtra("semester2", 2);
                intent.putExtra("credit2", 3);
                intent.putExtra("venue2", "W76M");
                startActivity(intent);
            }
        });
    }
}