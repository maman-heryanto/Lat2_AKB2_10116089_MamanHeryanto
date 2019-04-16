package com.t.lat2_akb2_10116089_mamanheryanto;

/**
 * AKB2 10116089 Maman Heryanto
 * CHANGELOG
 * Aplikasi V0.1 15/04/2019 15.00
 * - Membuat Halaman Home
 * - Membuat Halaman Register
 * - Membuat Halaman Verify
 *Aplikasi V0.2 16/04/2019 07.00
 * - Membuat Halaman verifyAccount
 * - Membuat Halaman Blood
 *
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }

    public void Register(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}
