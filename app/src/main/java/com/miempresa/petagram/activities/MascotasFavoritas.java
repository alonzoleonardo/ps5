package com.miempresa.petagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.miempresa.petagram.R;
import com.miempresa.petagram.adapter.MascotaAdaptador;
import com.miempresa.petagram.fragments.IRvListamascotasFragmentView;
import com.miempresa.petagram.pojo.Mascota;
import com.miempresa.petagram.presentador.IRecyclerViewFragmentPresenter;
import com.miempresa.petagram.presentador.RecyclerViewFragmentPresent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MascotasFavoritas extends AppCompatActivity implements IRvListamascotasFragmentView {

    private ArrayList<Mascota> mascotasordenadas;
    private RecyclerView listamascotasfav;
    private IRecyclerViewFragmentPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listamascotasfav = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        presenter = new RecyclerViewFragmentPresent(this,MascotasFavoritas.this);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

    public ArrayList<Mascota> ordenamientoMascotasFavoritas(ArrayList<Mascota> listafav){
        ArrayList<Mascota> mascotasfav = new ArrayList<Mascota>();
        Date fechaAct = new Date();
        boolean sigueprimero = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");


        //ArrayList<Mascota> listafav = (ArrayList<Mascota>) getIntent().getSerializableExtra("mascotafav");

        ArrayList<Mascota> listaordenada = new ArrayList<Mascota>();
        for (int i = 0; i < listafav.size(); i++) {
            for (int j = 0; j < listafav.size(); j++) {
                if(listafav.get(i).getFechaUltimoLike().compareTo(listafav.get(j).getFechaUltimoLike()) >= 0){
                    sigueprimero = true;
                } else {
                    sigueprimero = false;
                    break;
                }
            }
            if (sigueprimero){
                listaordenada.add(listafav.get(i));
                listafav.remove(listafav.get(i));
                i = -1;
            }
        }


        for (int k = 0; k < 5; k++) {
            mascotasfav.add(listaordenada.get(k));
        }

        return mascotasfav;

    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listamascotasfav.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        mascotasordenadas = ordenamientoMascotasFavoritas(mascotas);
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotasordenadas,this);
        return mascotaAdaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listamascotasfav.setAdapter(adaptador);
    }
}