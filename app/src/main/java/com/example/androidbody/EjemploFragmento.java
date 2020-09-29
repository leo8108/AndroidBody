package com.example.androidbody;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EjemploFragmento extends Fragment {
    private int[] imagenes;
    private int index;
    private final String savedSrc = "indexImage";
    private final String savedImages = "savedImages";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = LayoutInflater.from(getContext()).inflate(R.layout.fragment_layout,container,false);
        final ImageView personPart =  vista.findViewById(R.id.imageView);
        if(savedInstanceState != null){
            this.imagenes = savedInstanceState.getIntArray(savedImages);
            this.index = savedInstanceState.getInt(savedSrc);
            /**/
        }

        personPart.setImageResource(imagenes[index]);
        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personPart.setImageResource(imagenes[increment()]);
            }
        });
        return vista;
    }
    public int increment(){
        index = (index + 1)%imagenes.length;
        return index;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(savedSrc,index);
        Log.d("MILOG","Rotando a 180°" + index);
        outState.putIntArray(savedImages,imagenes);
    }
    public void setImagenes(int[] imagenes) {
        this.imagenes = imagenes;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
