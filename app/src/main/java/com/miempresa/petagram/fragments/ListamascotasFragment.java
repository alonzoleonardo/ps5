package com.miempresa.petagram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miempresa.petagram.R;
import com.miempresa.petagram.adapter.MascotaAdaptador;
import com.miempresa.petagram.pojo.Mascota;
import com.miempresa.petagram.presentador.IRecyclerViewFragmentPresenter;
import com.miempresa.petagram.presentador.RecyclerViewFragmentPresent;

import java.util.ArrayList;

public class ListamascotasFragment extends Fragment implements IRvListamascotasFragmentView{

    ArrayList<Mascota> mascotas;
    ArrayList<Mascota> mascotasfavoritas;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_listamascotas, container, false);
        listaMascotas = (RecyclerView) vista.findViewById(R.id.rvMascotas);

        presenter = new RecyclerViewFragmentPresent(this,getContext());

        return vista;
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        /*
        Date fechaActual = new Date();


        mascotas.add(new Mascota(R.drawable.diesel, "Diesel", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.betoben, "Betoben", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.boberman, "Boberman", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.branco, "Branco", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.dalma, "Dalma", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.donki, "Donki", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.kitty, "Kitty", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.michi, "Michi", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.pibe, "Pibe", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.puppy, "Puppy", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.teysi, "Teisi", 0, fechaActual));
        mascotas.add(new Mascota(R.drawable.toby, "Toby", 0, fechaActual));
         */

    }

    public void verMascotasActuales(MascotaAdaptador adaptador){

        mascotasfavoritas = new ArrayList<Mascota>();
        mascotasfavoritas = adaptador.getMascotas();
    }

    @Override
    public void generarLinearLayoutVertical() {
        //Crear LinearLayout
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //Darle sentido vertical
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //Agregar el diseño a la listaMascotas quien es un RecycleView
        listaMascotas.setLayoutManager(llm);

    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);

        verMascotasActuales(adaptador);
    }
}

