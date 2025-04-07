package com.example.demo.login.login_user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;
import com.example.demo.login.register_user.RegisterUser;

public class login_user extends AppCompatActivity implements View.OnClickListener {
    //Declarar variables
    Button btnRegisterUser;
    @Override
    protected void onCreate  (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        //Asociar variables graficas con las logicas

        btnRegisterUser = findViewById(R.id.btnRegisterUser);
        //Asignar eventos a los botones

        btnRegisterUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            if(v.getId()== R.id.btnRegisterUser)
                registro();
            //caso contrario ,ingresa el boton INGRESAR ,valida la cuenta y accede ,por lo tanto ,se visualizara en el Componente Principal(Main)
    }

    private void registro() {
        Intent iRegistro = new Intent(this, RegisterUser.class);
        startActivity(iRegistro);
    }
}