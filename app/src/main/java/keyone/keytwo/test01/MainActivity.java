package keyone.keytwo.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textCounter1; // пользовательский элемент 1-го счетчика
    private TextView textCounter2; // пользовательский элемент 2-го счетчика
    private TextView textCounter3; // пользовательский элемент 3-го счетчика
    private TextView textCounter4; // пользовательский элемент 4-го счетчика
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Counters counters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counters = new Counters();
        initView();

    }

    private void initView() {
        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        textCounter3 = findViewById(R.id.textView3);
        textCounter4 = findViewById(R.id.textView4);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counters.increaseCounter2();
                textCounter2.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_2()));
            }
        });


    }

    public void button1_onClick(View view) {
        counters.increaseCounter1();
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_1()));

    }
}
