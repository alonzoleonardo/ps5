package com.miempresa.petagram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miempresa.petagram.R;
import com.miempresa.petagram.adapter.PerfilMascotaAdaptador;
import com.miempresa.petagram.pojo.Mascota;
import com.miempresa.petagram.presentador.IRecyclerViewFragmentPresenter;
import com.miempresa.petagram.presentador.RecyclerViewFragmentPresent;

import java.util.ArrayList;

public class PerfilmascotaFragment extends Fragment implements IRvPerfilmascotaFragmentView{

    private RecyclerView rvPerfilmascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_perfilmascota, container, false);

        rvPerfilmascotas = (RecyclerView) vista.findViewById(R.id.rvPerfilmascotas);

        presenter = new RecyclerViewFragmentPresent(this,getContext());

        return vista;
    }

    @Override
    public void generarGridLayoutManager() {
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        rvPerfilmascotas.setLayoutManager(glm);
    }

    @Override
    public PerfilMascotaAdaptador crearAdaptadorPerfil(ArrayList<Mascota> mascotas) {
        PerfilMascotaAdaptador perfilAdaptador = new PerfilMascotaAdaptador(mascotas,getActivity());
        return perfilAdaptador;
    }

    @Override
    public void inicializarAdaptadorRVPerfil(PerfilMascotaAdaptador perfilMascotaAdaptador) {
        rvPerfilmascotas.setAdapter(perfilMascotaAdaptador);
    }
}