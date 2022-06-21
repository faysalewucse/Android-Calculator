package edu.bd.ewu.firstappcse489;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        s = "";
        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"1";
                result.setText(s);
            }
        });

        findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"2";
                result.setText(s);
            }
        });
        findViewById(R.id.three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"3";
                result.setText(s);
            }
        });
        findViewById(R.id.four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"4";
                result.setText(s);
            }
        });
        findViewById(R.id.five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"5";
                result.setText(s);
            }
        });
        findViewById(R.id.six).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"6";
                result.setText(s);
            }
        });
        findViewById(R.id.seven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"7";
                result.setText(s);
            }
        });
        findViewById(R.id.eight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"8";
                result.setText(s);
            }
        });
        findViewById(R.id.nine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"9";
                result.setText(s);
            }
        });

        findViewById(R.id.dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+".";
                result.setText(s);
            }
        });findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"0";
                result.setText(s);
            }
        });findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"+";
                result.setText(s);
            }
        });findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"-";
                result.setText(s);
            }
        });findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"÷";
                result.setText(s);
            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"x";
                result.setText(s);
            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"x";
                result.setText(s);
            }
        });
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = "";
                result.setText(s);
            }

        });
        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s.substring(0, s.length()-1);
                result.setText(s);
            }
        });
        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s.contains("x")||s.contains("+")||s.contains("-")||s.contains("÷")){
                    if(s.contains("x")){
                        String[] digits = s.split("x", 0);
                        result.setText(String.valueOf(Integer.parseInt(digits[0]) * Integer.parseInt(digits[1])));
                    }
                }
                else{
                    result.setText(s);
                }
            }
        });
    }
}