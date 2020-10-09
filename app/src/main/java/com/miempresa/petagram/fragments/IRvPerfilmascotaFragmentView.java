package com.miempresa.petagram.fragments;

import com.miempresa.petagram.adapter.PerfilMascotaAdaptador;
import com.miempresa.petagram.pojo.Mascota;

import java.util.ArrayList;

public interface IRvPerfilmascotaFragmentView {

    public void generarGridLayoutManager();

    public PerfilMascotaAdaptador crearAdaptadorPerfil(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRVPerfil(PerfilMascotaAdaptador perfilMascotaAdaptador);
}
