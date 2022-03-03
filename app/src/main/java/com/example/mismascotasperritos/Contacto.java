package com.example.mismascotasperritos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Contacto extends AppCompatActivity {

    private EditText etNombreContacto;
    private EditText etMensaje;
    private EditText etCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    public void enviarMensaje(View view) {

        Intent i=new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{etCorreo.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,etNombreContacto.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,etMensaje.getText().toString());
        startActivity(i);
        
    }
}