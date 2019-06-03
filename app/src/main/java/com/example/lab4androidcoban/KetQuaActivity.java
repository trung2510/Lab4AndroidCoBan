package com.example.lab4androidcoban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KetQuaActivity extends AppCompatActivity {

    private TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        tvKQ = (TextView) findViewById(R.id.tvKQ);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        int a = bundle.getInt("soA");
        int b = bundle.getInt("soB");
        int ketqua = BSCLN(a,b);
        tvKQ.setText(ketqua +"");

    }

    public int USCLN(int a,int b){
        if (b == 0) {
            return a;
        }
        else {
            return USCLN(b,a%b);
        }
    }
    public int BSCLN(int a,int b){
        return (a*b/USCLN(a,b));
    }
}
