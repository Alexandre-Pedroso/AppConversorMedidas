package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_m);

        final EditText edtCen_Prog = (EditText) findViewById(R.id.edtCen);
        final EditText edtMet_Prog = (EditText) findViewById(R.id.edtMet);
        Button btnCov_Prog = (Button) findViewById(R.id.btnCov);
        Button btnNvo_Prog = (Button) findViewById(R.id.btnNvo);

        btnCov_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Cm = Double.parseDouble(edtCen_Prog.getText().toString());
                double Mt = Cm/100;
                edtMet_Prog.setText(String.valueOf(Mt));
            }
        });

        btnNvo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMet_Prog.setText("");
                edtCen_Prog.setText("");
                edtCen_Prog.requestFocus();
            }
        });
    }
}