package com.example.y520.ferdinan_1202150010_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Y520 on 2/18/2018.
 */

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) { 
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.buttonDineIn:
                if (checked)
                    displayToast("Dine In");
                break;
            case R.id.buttonTakeAway:
                if (checked)
                    displayToast("Take Away");
                break;
        }
    }

    private void displayToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show(); /
    }

    public void pesansekarang(View view) {
        if (((RadioButton)findViewById(R.id.buttonDineIn)).isChecked()) {
            Intent a = new Intent(this, MenuDetail.class);
            startActivity(a);
        }else if (((RadioButton)findViewById(R.id.buttonTakeAway)).isChecked()){
            Intent a = new Intent(this,Takeaway.class);
            startActivity(a);
        }else{
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show();
        }

    }
}
