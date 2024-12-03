package com.ikaslea.lisviewkontrola2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    TextView lblEtiqueta;
    ListView lstOpciones;

    Titular[] datos = new Titular[]{
            new Titular("Título 1", "Subtítulo  1"),
            new Titular("Título 2", "Subtítulo  2"),
            new Titular("Título 3", "Subtítulo  3"),
            new Titular("Título 4", "Subtítulo  4"),
            new Titular("Título 5", "Subtítulo  5")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblEtiqueta = findViewById(R.id.LblEtiqueta);
        lstOpciones = findViewById(R.id.LstOpciones);

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);
        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                String opcionSeleccionada = datos[position].getTitulo();
                lblEtiqueta.setText("Aukeratutakoa: " + opcionSeleccionada);
            }
        });
    }
}