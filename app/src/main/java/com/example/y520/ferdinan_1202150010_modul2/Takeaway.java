package com.example.y520.ferdinan_1202150010_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Y520 on 2/18/2018.
 */

public class Takeaway extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        button2 = (Button) findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Takeaway.this, MenuList.class);
                startActivity(a);
            }
        });
    }
}


