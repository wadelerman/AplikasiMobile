package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasilNama;
    EditText masukNama;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Memanggil Variabel
        masukNama=(EditText)findViewById(R.id.inputNama);
        hasilNama=(TextView)findViewById(R.id.nama);
    }

    //tampilNama=yang ada di Button Onclick
    public void tampilNama(View view) {
        hasilNama.setText("Halo "+masukNama.getText()+"!");
        masukNama.setText("");
    }
}
