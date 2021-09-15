package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        final EditText edtMe_Prog = (EditText) findViewById(R.id.edtMe);
        final  EditText edtKM_Prog = (EditText) findViewById(R.id.edtKM);
        Button btnConvert_Prog = (Button) findViewById(R.id.btnConvert);
        Button btnNov_Prog = (Button) findViewById(R.id.btnNov);

        btnConvert_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double M = Double.parseDouble(edtMe_Prog.getText().toString());
                double Km = M/1000;
                edtKM_Prog.setText(String.valueOf(Km));
            }
        });

        btnNov_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtKM_Prog.setText("");
                edtMe_Prog.setText("");
                edtMe_Prog.requestFocus();
            }
        });
    }
}