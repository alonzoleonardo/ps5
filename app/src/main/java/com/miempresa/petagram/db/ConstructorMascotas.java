package com.miempresa.petagram.db;

import android.content.ContentValues;
import android.content.Context;

import com.miempresa.petagram.R;
import com.miempresa.petagram.pojo.Mascota;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConstructorMascotas {

    private static boolean solounavez = true;

    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos() throws ParseException {

        BaseDatos db = new BaseDatos(context);
        if(solounavez) {
            insertarMascotas(db);
            solounavez = false;
        }

        return db.obtenerTodasLasMascotas();

        /*
        ArrayList<Mascota> mascotas = new ArrayList<>();
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

        return mascotas;
         */
    }

    public void darLikeaMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        db.modificarLikeMascota(mascota);
    }

    public int obtenerNumeroLikesdeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);

        return db.obtenerNumLikeMascota(mascota);
    }

    public void insertarMascotas(BaseDatos db){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");
        Date fechaUltimolikeTodos = new Date();

        ContentValues contentValues =new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.diesel);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Diesel");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.betoben);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Betoben");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.boberman);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Boberman");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.branco);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Branco");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.dalma);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Dalma");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.donki);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Donki");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.kitty);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Kitty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.michi);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Michi");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.pibe);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Pibe");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.puppy);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Puppy");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.teysi);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Teysi");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);


        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.toby);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Toby");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NUMERO_LIKES, 0);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FECHA_LIKE, sdf.format(fechaUltimolikeTodos));
        db.insertarMascota(contentValues);



    }
}
