package com.example.taherghrab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etValeur;
    private SeekBar ageseekbar;
    private Button consultutton;
    private RadioButton yes;
    private RadioButton no;
    private TextView titre;
    private  TextView age;


    private void init()
    {
        etValeur = findViewById(R.id.etValeur);
        age = findViewById(R.id.agetext);
        titre=findViewById(R.id.titretext);
        ageseekbar=findViewById(R.id.sbAge);
        yes=findViewById(R.id.rbtOui);
        no=findViewById(R.id.rbtNon);
        consultutton=findViewById(R.id.btnConsulter);
    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
            ageseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int a, boolean b) {
                    Log.i("Information", "onProgressChanged "+a);

                    age.setText("Votre age : "+a);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });


    }
 /* private  void calculer(View view){

        int age =ageseekbar.getProgress();

  }*/
}