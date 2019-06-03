package com.example.lab4androidcoban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai1Activity extends AppCompatActivity {

    private EditText soA;
    private EditText soB;
    private Button btnKq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        soA = (EditText) findViewById(R.id.so_a);
        soB = (EditText) findViewById(R.id.so_b);
        btnKq = (Button) findViewById(R.id.btn_kq);

        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());

                Intent intent = new Intent(Bai1Activity.this,KetQuaActivity.class);
                Bundle bundle = new Bundle();

                bundle.putInt("soA",a);
                bundle.putInt("soB",b);

                intent.putExtra("data",bundle);

                startActivity(intent);
            }
        });


    }


}
