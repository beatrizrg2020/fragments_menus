package com.example.mismascotasperritos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mismascotasperritos.adaptador.AdaptadorMascotas;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<MascotasVo> mascotasVos;

    //ArrayList<MascotasVo> perfilMascota ; //guardar copia

    public RecyclerView rvMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View v=inflater.inflate(R.layout.fragment_recyckerview,container,false);


        rvMascotas=(RecyclerView)v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        rvMascotas.setLayoutManager(llm);

        llenarLista();
        inicializarAdaptador();
        guardarArray(mascotasVos);


        return v;
    }

    public void inicializarAdaptador() {
        AdaptadorMascotas adaptadorMascotas=new AdaptadorMascotas(mascotasVos,getActivity());
        rvMascotas.setAdapter(adaptadorMascotas);

    }

   public void llenarLista() {

        mascotasVos=new ArrayList<MascotasVo>();

        mascotasVos.add(new MascotasVo("Toby",0,R.drawable.perrito1));
        mascotasVos.add(new MascotasVo("Sol",0,R.drawable.perrito2));
        mascotasVos.add(new MascotasVo("Zeus",0,R.drawable.perrito3));
        mascotasVos.add(new MascotasVo("Luna",0,R.drawable.perrito4));
        mascotasVos.add(new MascotasVo("Estrella",0,R.drawable.perrito5));
        mascotasVos.add(new MascotasVo("Tony",0,R.drawable.perrito6));
        mascotasVos.add(new MascotasVo("Ciprix",0,R.drawable.perrito7));
        mascotasVos.add(new MascotasVo("Yerry",0,R.drawable.perrito8));


    }

    public ArrayList<MascotasVo> guardarArray(ArrayList<MascotasVo> mascota1){

        ArrayList<MascotasVo> perfilMascota=new ArrayList<MascotasVo>();


        for (MascotasVo elementos1:mascota1){

            perfilMascota.add(elementos1);


        }

        return perfilMascota;


    }




}

