package com.miempresa.petagram.presentador;

import android.content.Context;

import com.miempresa.petagram.db.ConstructorMascotas;
import com.miempresa.petagram.fragments.IRvListamascotasFragmentView;
import com.miempresa.petagram.fragments.IRvPerfilmascotaFragmentView;
import com.miempresa.petagram.pojo.Mascota;

import java.text.ParseException;
import java.util.ArrayList;

public class RecyclerViewFragmentPresent implements IRecyclerViewFragmentPresenter{

    private IRvListamascotasFragmentView iRvListamascotasFragmentView;
    private IRvPerfilmascotaFragmentView iRvPerfilmascotaFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresent(IRvListamascotasFragmentView iRvListamascotasFragmentView, Context context) {
        this.iRvListamascotasFragmentView = iRvListamascotasFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
        mostrarMascotasRV();
    }
    public RecyclerViewFragmentPresent(IRvPerfilmascotaFragmentView iRvPerfilmascotaFragmentView, Context context) {
        this.iRvPerfilmascotaFragmentView = iRvPerfilmascotaFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
        mostrarMascotasRVPerfil();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        try {
            mascotas = constructorMascotas.obtenerDatos();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarMascotasRV() {

        iRvListamascotasFragmentView.inicializarAdaptadorRV(iRvListamascotasFragmentView.crearAdaptador(mascotas));
        iRvListamascotasFragmentView.generarLinearLayoutVertical();

    }

    @Override
    public void mostrarMascotasRVPerfil() {
        iRvPerfilmascotaFragmentView.inicializarAdaptadorRVPerfil(iRvPerfilmascotaFragmentView.crearAdaptadorPerfil(mascotas));
        iRvPerfilmascotaFragmentView.generarGridLayoutManager();
    }


}
