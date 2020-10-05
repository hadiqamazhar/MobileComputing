package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnPlus, btnMinus,btnMultiply, btnDivide, btnClear, btnEqual, btnPercent, btnDot, btnAC;
    TextView input,output;
    String action= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEight);
        btn9 = findViewById(R.id.btnNine);
        btnClear = findViewById(R.id.btnClear);
        btnAC = findViewById(R.id.btnAC);
        btnPercent = findViewById(R.id.btnPercent);
        btnDot = findViewById(R.id.btnDot);

        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnSubtract);

        btnEqual = findViewById(R.id.btnEqual);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "*");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "/");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + ".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                input.setText(action + "%");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action = input.getText().toString();
                Expression e = new Expression(action);
                String result= "";
                result = String.valueOf(e.calculate());
                output.setText(result);
            }
        });
    }
}