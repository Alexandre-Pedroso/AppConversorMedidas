package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);

        final EditText edtKm_Prog = (EditText) findViewById(R.id.edtKm);
        final EditText edtM_Prog = (EditText) findViewById(R.id.edtM);
        Button btnConverter = (Button) findViewById(R.id.btnConverter);
        Button btnNovo = (Button) findViewById(R.id.btnNovo);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Km = Double.parseDouble(edtKm_Prog.getText().toString());
                double m = Km*1000;
                edtM_Prog.setText(String.valueOf(m));
            }
        });

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM_Prog.setText("");
                edtKm_Prog.setText("");
                edtKm_Prog.requestFocus();
            }
        });
    }
}