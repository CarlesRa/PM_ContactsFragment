package com.carlesramos.contactsfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

import com.carlesramos.contactsfragment.fragments.FragmentDetalle;
import com.carlesramos.contactsfragment.fragments.FragmentListado;
import com.carlesramos.contactsfragment.interficies.IContacteListener;
import com.carlesramos.contactsfragment.modelo.Contacte;

public class MainActivity extends AppCompatActivity implements IContacteListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado frgListado = (FragmentListado)getSupportFragmentManager().findFragmentById(R.id.frgListado);
        frgListado.setContactesListener(this);



    }

    @Override
    public void onContacteSeleccionado(Contacte c) {
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.frgDetalle) != null);
        if (hayDetalle){
            ((FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.frgDetalle)).mostrarDetalle();
        }
        else{
            Intent i = new Intent(this, DetalleActivity.class);
            startActivity(i);
        }
    }
}
