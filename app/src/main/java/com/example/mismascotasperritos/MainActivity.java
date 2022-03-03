package com.example.mismascotasperritos;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mismascotasperritos.adaptador.AdaptadorMascotas;
import com.example.mismascotasperritos.adaptador.PageAdapter;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static android.os.Build.VERSION_CODES.P;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity   {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        setUpViewPager();


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
       inflater.inflate(R.menu.menu_opciones,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mContacto:

                Intent intent=new Intent(getApplicationContext(),Contacto.class);
                startActivity(intent);

                return true;

        }
        switch (item.getItemId()) {

            case R.id.mAcercaD:
                Intent i=new Intent(getApplicationContext(),AcercaD.class);
                startActivity(i);

              return true;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment>fragments=new ArrayList<Fragment>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new RecyclerViewFragment());
        return fragments;


   }
    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
       tabLayout.setupWithViewPager(viewPager);

       tabLayout.getTabAt(0).setIcon(R.drawable.home_icon);
       tabLayout.getTabAt(1).setIcon(R.drawable.perfil_icon);



    }


}