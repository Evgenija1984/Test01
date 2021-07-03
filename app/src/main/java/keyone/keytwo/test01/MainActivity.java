package keyone.keytwo.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textCounter1; // пользовательский элемент 1-го счетчика
    private TextView textCounter2; // пользовательский элемент 2-го счетчика
    private TextView textCounter3; // пользовательский элемент 3-го счетчика
    private TextView textCounter4; // пользовательский элемент 4-го счетчика
    private TextView textCounter5; // пользовательский элемент 5-го счетчика
    private TextView textCounter6; // пользовательский элемент 6-го счетчика
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

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
        textCounter5 = findViewById(R.id.textView5);
        textCounter6 = findViewById(R.id.textView6);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counters.increaseCounter2();
                textCounter2.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_2()));
            }
        });
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button5:
                    counters.increaseCounter5();
                    textCounter5.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_5()));
                    break;
                case R.id.button6:
                    counters.increaseCounter6();
                    textCounter6.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_6()));
                    break;
            }
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                counters.increaseCounter3();
                textCounter3.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_3()));
                break;
            case R.id.button4:
                counters.increaseCounter4();
                textCounter4.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_4()));
                break;
        }
    }

    public void button1_onClick(View view) {
        counters.increaseCounter1();
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_1()));

    }

}
