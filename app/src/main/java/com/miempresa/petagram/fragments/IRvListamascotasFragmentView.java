package com.miempresa.petagram.fragments;

import com.miempresa.petagram.adapter.MascotaAdaptador;
import com.miempresa.petagram.pojo.Mascota;

import java.util.ArrayList;

public interface IRvListamascotasFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
