package keyone.keytwo.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    Button button1;
    int counter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter1 = 0;
        textView1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);

    }

    public void button1_onclick(View view) {
        counter1++;
        textView1.setText(counter1 + "");


    }
}
