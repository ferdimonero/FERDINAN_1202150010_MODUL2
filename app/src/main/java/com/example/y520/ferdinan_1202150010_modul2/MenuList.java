package com.example.y520.ferdinan_1202150010_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Y520 on 2/18/2018.
 */

public class MenuList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menudetail);
    }

    public void pizzaABC (View view){
        Intent p = new Intent(MenuList.this, MenuDetail.class);
        startActivity(p);
    }
}
