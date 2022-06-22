package edu.bd.ewu.firstappcse489;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String s;
    ArrayList<String> operators = new ArrayList<String>();

    public static int addRemove(ArrayList digits, int div_index, int res) {
        return 0;
    }
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
        });
        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"0";
                result.setText(s);
            }
        });
        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"+";
                operators.add("+");
                result.setText(s);
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"-";
                operators.add("-");
                result.setText(s);
            }
        });
        findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"÷";
                operators.add("÷");
                result.setText(s);
            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s+"x";
                operators.add("x");
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
                if(s.charAt(s.length()-1) != 'x' && s.charAt(s.length()-1) != '-' && s.charAt(s.length()-1) != '+' && s.charAt(s.length()-1) != '÷'){
                    int res = 0;
                    //Separating Digits
                    String[] list = s.split("\\+|\\-|x|÷");
                    ArrayList<String> digits = new ArrayList<>(Arrays.asList(list));

                    //Separating Operators
                    char[] s_arr = s.toCharArray();
                    ArrayList<Character> operators = new ArrayList<>();
                    Character c;
                    for (char e : s_arr)
                    {
                        c = e;
                        if(c.equals('x') || c.equals('-') || c.equals('+')|| c.equals('÷')){
                            operators.add(c);
                        }
                    }
                    for (int i = 0; i <= operators.size(); i++) {
                        if(operators.indexOf('x') > operators.indexOf('÷')){
                            if(operators.contains('÷')){
                                int div_index = operators.indexOf('÷');
                                res = Integer.parseInt(digits.get(div_index)) / Integer.parseInt(digits.get(div_index+1));
                                operators.remove(div_index);

                                digits.remove(div_index);
                                digits.add(div_index, String.valueOf(res));
                                digits.remove(div_index+1);
                            }
                            if(operators.contains('x')){
                                int div_index = operators.indexOf('x');
                                res = Integer.parseInt(digits.get(div_index)) * Integer.parseInt(digits.get(div_index+1));
                                operators.remove(div_index);

                                digits.remove(div_index);
                                digits.add(div_index, String.valueOf(res));
                                digits.remove(div_index+1);
                            }
                        }
                        else{
                            if(operators.contains('x')){
                                int div_index = operators.indexOf('x');
                                res = Integer.parseInt(digits.get(div_index)) * Integer.parseInt(digits.get(div_index+1));
                                operators.remove(div_index);

                                digits.remove(div_index);
                                digits.add(div_index, String.valueOf(res));
                                digits.remove(div_index+1);
                            }
                            if(operators.contains('÷')){
                                int div_index = operators.indexOf('÷');
                                res = Integer.parseInt(digits.get(div_index)) / Integer.parseInt(digits.get(div_index+1));
                                operators.remove(div_index);

                                digits.remove(div_index);
                                digits.add(div_index, String.valueOf(res));
                                digits.remove(div_index+1);
                            }
                        }
                        if(operators.contains('-')){
                            int div_index = operators.indexOf('-');
                            System.out.println(digits.get(div_index) + digits.get(div_index+1));
                            res = Integer.parseInt(digits.get(div_index)) - Integer.parseInt(digits.get(div_index+1));
                            operators.remove(div_index);

                            digits.remove(div_index);
                            digits.add(div_index, String.valueOf(res));
                            digits.remove(div_index+1);
                        }
                        if(operators.contains('+')){
                            int div_index = operators.indexOf('+');
                            res = Integer.parseInt(digits.get(div_index)) + Integer.parseInt(digits.get(div_index+1));
                            operators.remove(div_index);

                            digits.remove(div_index);
                            digits.add(div_index, String.valueOf(res));
                            digits.remove(div_index+1);
                        }
                    }
                    result.setText(String.valueOf(res));
                }
                else{
                    System.out.println("Error");
                }
            }
        });
    }
}