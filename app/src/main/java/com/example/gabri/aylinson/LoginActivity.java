package com.example.gabri.aylinson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_kayol= (Button) findViewById(R.id.btn_kaydol);
        Button btn_giris= (Button) findViewById(R.id.btn_giris);

        btn_giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent=new Intent(getApplicationContext(),Tabbed.class);
                startActivity(ıntent);
            }
        });
        btn_kayol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(ıntent);
            }
        });


    }
}
