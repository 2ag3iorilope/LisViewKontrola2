package com.ikaslea.lisviewkontrola2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class AdaptadorTitulares  extends ArrayAdapter<Titular> {
    Activity context;
    Titular datos [] ;
    public AdaptadorTitulares(Activity context, Titular[] datos){
        super(context, R.layout.listitem_titular, datos);
        this.context = context;
        this.datos = datos;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.listitem_titular, null);

        TextView lblTitulo = item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(datos[position].getTitulo());

        TextView lblSubtitulo = item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

        return item;
    }
}
