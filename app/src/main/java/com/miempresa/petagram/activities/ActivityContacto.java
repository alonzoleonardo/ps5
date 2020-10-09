package com.miempresa.petagram.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.miempresa.petagram.R;
import com.miempresa.petagram.correo.SendMail;

public class ActivityContacto extends AppCompatActivity implements View.OnClickListener {

    //Declarando EditText
    private EditText etCorreo;
    private EditText etNombre;
    private EditText etMensaje;

    //Declarando botón
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        //Inicializando las vistas
        etCorreo  = (EditText) findViewById(R.id.etCorreo);
        etNombre  = (EditText) findViewById(R.id.etNombre);
        etMensaje = (EditText) findViewById(R.id.etMensaje);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        sendEmail();
    }

    private void sendEmail(){
        //Obteniendo contenido para email
        String email = etCorreo.getText().toString().trim();
        String subject = etNombre.getText().toString().trim();
        String message = etMensaje.getText().toString().trim();

        //Creaando objeto SendMail
        SendMail sm = new SendMail(this, email,subject,message);

        //Ejecutando sendmail para enviar correo
        sm.execute();

    }
}