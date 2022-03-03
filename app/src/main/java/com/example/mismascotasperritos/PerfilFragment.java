package com.example.mismascotasperritos;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mismascotasperritos.adaptador.AdaptadorMascotas;

import java.util.ArrayList;

        public class PerfilFragment extends Fragment {

            RecyclerViewFragment recyclerViewFragment1=new RecyclerViewFragment();
            AdaptadorMascotas adaptadorMascotas1=new AdaptadorMascotas();


            public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                // return super.onCreateView(inflater, container, savedInstanceState);
                View v = inflater.inflate(R.layout.fragment_recyckerview, container, false);


                return v;

            }

            public PerfilFragment() {
                // Required empty public constructor
          }



        }
