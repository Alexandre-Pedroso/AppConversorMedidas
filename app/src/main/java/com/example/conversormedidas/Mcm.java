package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        final EditText edtMt_Prog = (EditText) findViewById(R.id.edtMt);
        final EditText edtCm_Prog = (EditText) findViewById(R.id.edtCm);
        Button btnConv_Prog = (Button) findViewById(R.id.btnConv);
        Button btnNv_Prog = (Button) findViewById(R.id.btnNv);

        btnConv_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Mt = Double.parseDouble(edtMt_Prog.getText().toString());
                double Cm = Mt*100;
                edtCm_Prog.setText(String.valueOf(Cm));
            }
        });

        btnNv_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCm_Prog.setText("");
                edtMt_Prog.setText("");
                edtMt_Prog.requestFocus();
            }
        });
    }
}