package com.example.androidbody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            ImagenesGenerales images = new ImagenesGenerales();
            Fragment fragment = new EjemploFragmento();
            ((EjemploFragmento) fragment).setImagenes(images.getCabezas());
            ((EjemploFragmento) fragment).setIndex(0);
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragment).commit();


            Fragment fragment2 = new EjemploFragmento();
            ((EjemploFragmento) fragment2).setImagenes(images.getCuerpos());
            ((EjemploFragmento) fragment2).setIndex(0);
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor2, fragment2).commit();


            Fragment fragment3 = new EjemploFragmento();
            ((EjemploFragmento) fragment3).setImagenes(images.getPiernas());
            ((EjemploFragmento) fragment3).setIndex(0);
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor3, fragment3).commit();

            //espacio para github
            //otro espacio
            //espacio invasor
            //otro espacio invasor
        }
    }
}
