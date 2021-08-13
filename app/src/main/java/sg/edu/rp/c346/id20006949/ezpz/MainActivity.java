package sg.edu.rp.c346.id20006949.ezpz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1 , et2;
    Button add ,mul ,div , sub,equal;
    TextView answer;
    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        answer = findViewById(R.id.answer);
        equal = findViewById(R.id.equals);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(et1.getText().toString());
                    double b = Double.parseDouble(et2.getText().toString());
                    ans = a + b;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(et1.getText().toString());
                double b = Double.parseDouble(et2.getText().toString());
                ans = a - b;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(et1.getText().toString());
                double b = Double.parseDouble(et2.getText().toString());
                ans = a*b;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(et1.getText().toString());
                double b = Double.parseDouble(et2.getText().toString());
                if(b!=0)
                    ans = a/b;
                else
                    Toast.makeText(getApplicationContext(),"Enter Valid Numbers",Toast.LENGTH_SHORT).show();
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = String.valueOf(ans);
                answer.setText(ans1);
                ans= 0;
            }
        });
    }
}