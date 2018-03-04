package com.example.aishw.calc;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, plus, minus, divide, mult,del, dot, ac, square, percent, equal;
    // public static TextView hist;
    public static TextView input;
    public static TextView hist;
    float val1, val2;
    boolean multiply, addition, subtraction, division, peri, squarei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        but6 = findViewById(R.id.but6);
        but7 = findViewById(R.id.but7);
        but8 = findViewById(R.id.but8);
        but9 = findViewById(R.id.but9);
        but0 = findViewById(R.id.but0);
        mult = findViewById(R.id.mult);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        square = findViewById(R.id.square);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.ac);
        percent = findViewById(R.id.percent);
        del= findViewById(R.id.del);
        equal = findViewById(R.id.equals);
         hist= findViewById(R.id.history);
        input = findViewById(R.id.screen);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "1");
                  hist.setText(hist.getText()+"1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "2");
                 hist.setText(hist.getText()+"2");
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "3");
                //hist.setText(hist.getText()+"3");
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "4");
                hist.setText(hist.getText()+"4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "5");
                hist.setText(hist.getText()+"5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "6");
                hist.setText(hist.getText()+"6");
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "7");
                hist.setText(hist.getText()+"7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "8");
                hist.setText(hist.getText()+"8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "9");
                 hist.setText(hist.getText()+"9");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "0");
                 hist.setText(hist.getText()+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    addition = true;
                    input.setText(null);

                hist.setText(hist.getText()+"+");
                set();}

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    subtraction = true;
                    input.setText(null);

                hist.setText(hist.getText()+"-");
                set();}
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    multiply = true;
                    input.setText(null);
                    hist.setText(hist.getText()+"*");

                set();}
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    division = true;
                    input.setText(null);
                    hist.setText(hist.getText()+"÷");

                set();}
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    peri = true;
                    input.setText(null);
                    hist.setText(hist.getText()+"%");

                set();}
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                } else {
                    val1 = Float.parseFloat(input.getText() + "");
                    squarei = true;
                    input.setText(null);
                    hist.setText(hist.getText()+"^");

                set();}
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input.length() == 0) {
                    input.setText("");
                }

                else {
                    String str = input.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    input.setText(str);
                    str = hist.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    hist.setText(str);


                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.length()==0)
                {
                    input.setText("");
                }
                else{
                val2 = Float.parseFloat(input.getText() + "");

                if (addition == true) {

                    input.setText(val1 + val2 + "");
                    hist.setText(val1 + val2 + "");
                    addition = false;
                }
                if (multiply == true) {
                    input.setText(val1 * val2 + "");
                    hist.setText(val1 * val2 + "");
                    multiply = false;
                }
                if (subtraction == true) {
                    input.setText(val1 - val2 + "");
                    hist.setText(val1 - val2 + "");
                    subtraction = false;
                }
                if (division == true) {
                    if (val2 == 0) {
                        input.setText("ERROR!");
                    } else {
                        input.setText(val1 / val2 + "");
                        hist.setText(val1 / val2 + "");
                        division = false;
                    }
                }
                if (squarei == true) {
                    input.setText(Math.pow(val1, val2) + "");
                    hist.setText(Math.pow(val1, val2) + "");
                    squarei = false;
                }
                if (peri == true) {

                    input.setText(val1/100 + "");
                    hist.setText(val1/100 + "");
                    peri = false;
                }

                unset();}
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                hist.setText("");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.length()==0)
                {
                    input.setText("");
                    hist.setText("");
                }
                input.setText(input.getText() + ".");
                hist.setText(hist.getText() + ".");
            }
        });
    }
    public static void set(){
        mult.setEnabled(false);
        divide.setEnabled(false);
        minus.setEnabled(false);
       percent.setEnabled(false);
        square.setEnabled(false);
        plus.setEnabled(false);
    }
    public static void unset(){
        mult.setEnabled(true);
        divide.setEnabled(true);
        minus.setEnabled(true);
        percent.setEnabled(true);
        square.setEnabled(true);
        plus.setEnabled(true);
    }

}