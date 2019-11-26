package com.example.wigidds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.color_sppiner);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this , "The selected item :" + spinner.getSelectedItem(),Toast.LENGTH_LONG).show();
                CheckBox checkBox = findViewById(R.id.check_cnd);
                if(checkBox.isChecked()){
                    Log.i("spinner" , "Condition Accepted");

                }else
                {
                    Log.i("spinner" , "Condition Not Accepted");
                    Toast.makeText(MainActivity.this , "Select the condition" ,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void itemChecked(View view){

        RadioGroup radioGroup = findViewById(R.id.radio);
        int id = radioGroup.getCheckedRadioButtonId();
        Log.i("idRadio" , "item checked"+id);
        switch (id){
            case R.id.yellow :
                Toast.makeText(this,"Yellow",Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                Toast.makeText(this,"Blue",Toast.LENGTH_SHORT).show();
                break;
            case R.id.green:
                Toast.makeText(this,"Green",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pink:
                Toast.makeText(this,"Pink",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
