package com.example.toko1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText NBA,Rpe,UBu,ORu;
    private Button TBe;
    private TextView txtNamaBarang;
    private TextView txthargabeli;
    private TextView txtumurbarang;
    private TextView txtjumlahpenawar;
    private TextView NB1;
    private TextView HJ1;
    private TextView txtN;
    private TextView txtH;
    private RadioButton GAa;
    private RadioButton GBb;
    private RadioButton GCc;
    private RadioGroup Ga;
    double z;
    double q;
    double w;
    double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Badoy Shop");

        NBA = (EditText) findViewById(R.id.NB);
        Rpe = (EditText) findViewById(R.id.Rp);
        UBu = (EditText) findViewById(R.id.UB);
        ORu = (EditText) findViewById(R.id.OR);
        TBe = (Button) findViewById(R.id.TB);
        txtNamaBarang = (TextView) findViewById(R.id.NB);
        txthargabeli = (TextView) findViewById(R.id.Rp);
        txtumurbarang = (TextView) findViewById(R.id.UB);
        txtjumlahpenawar = (TextView) findViewById(R.id.OR);
        GAa = (RadioButton) findViewById(R.id.GA);
        GBb = (RadioButton) findViewById(R.id.GB);
        GCc = (RadioButton) findViewById(R.id.GC);
        NB1 = (TextView) findViewById(R.id.NamaBarang1);
        HJ1 = (TextView) findViewById(R.id.hargajual);
        txtN = (TextView) findViewById(R.id.N);
        txtH = (TextView) findViewById(R.id.H);
        Ga = (RadioGroup) findViewById(R.id.G);


        TBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NB = NBA.getText().toString().trim();
                String Rp = Rpe.getText().toString().trim();
                String UB = UBu.getText().toString().trim();
                String OR = ORu.getText().toString().trim();
                txtN.setText("" + NB);
                double B = Double.parseDouble(Rp);
                double C = Double.parseDouble(UB);
                double D = Double.parseDouble(OR);
                double x = D;
                double um = C;
                if(um >50){
                    q = B/10/100;
                }

                double pw = D;

                if (pw >10){
                    w = B/5/100;
                }

                double jm = Ga.getCheckedRadioButtonId();

                if (jm == R.id.GA) {
                    z = B/20/100;
                } else if (jm == R.id.GB) {
                    z = B/10/100;
                } else if (jm == R.id.GC){
                    z= B/5/100;
                }
                ;
                double total = z + w + q + x;
                txtH.setText (""+ total);
            }

});
    }
}