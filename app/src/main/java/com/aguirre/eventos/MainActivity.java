package com.aguirre.eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnAnonima);
        btn2 = findViewById(R.id.btnImplements);
        btn3.setOnClickListener(this);

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Evento utilizando clase anonima", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view){
        Toast.makeText(MainActivity.this, "Evento utilizando onclick de implements", Toast.LENGTH_SHORT).show();
    }

    public void eventoBoton(View view){
        Toast.makeText(MainActivity.this, "Evento utilizando onclick de metodo", Toast.LENGTH_SHORT).show();
    }

}