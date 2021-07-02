package keyone.keytwo.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    /* // метод 1
    TextView textView1;
    Button button1;
    int counter1;
    // метод 1*/

    private TextView textCounter1; // пользовательский элемент 1-го счетчика
    private Button button1;
    int counter_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /* // метод 1
        counter1 = 0;
        textView1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);
    // метод 1*/
        counter_1 = 0;
        textCounter1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);

    }

    public void button1_onClick(View view) {
    /* // метод 1
        counter1++;
        textView1.setText(counter1 + "");
    // метод 1*/
        counter_1++;
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counter_1));

    }
}
