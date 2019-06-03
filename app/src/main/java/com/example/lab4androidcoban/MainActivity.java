
package com.example.lab4androidcoban;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnBai1;
    private Button btnBai2;
    private Button btnBai3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
    }


    public void bai1(View view) {
        startActivity(new Intent(MainActivity.this,Bai1Activity.class));
    }

    public void bai2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps")));
    }

    public void bai3(View view) {
        startActivity(new Intent(MainActivity.this,Bai3Activity.class));
    }
}
