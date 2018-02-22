package com.example.henry.lab15recyclerviewbasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.Adapter adapterN;
    private RecyclerView.LayoutManager layoutManager;

    String [] nombres={"HENRY RICO ESPARZA",
            "ERICK RICO ESPARZA",
            "JAVIER RICO ESPARZA",
            "CARLOS RICO ESPARZA",
            "ABRAHAM RICO ESPARZA",
            "LUIS RICO ESPARZA",
            "JESUS RICO ESPARZA",
            "DAVID RICO ESPARZA",
            "MIGUEL RICO ESPARZA",
            "JOSE RICO ESPARZA",};

    String [] noctrl = {"14400000",
            "14400001",
            "14400002",
            "14400003",
            "14400004",
            "14400005",
            "14400006",
            "14400007",
            "14400008",
            "14400009",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear referencias hacia el componente RecycleriView
        recyclerView = findViewById(R.id.recycler_id);

        // Crear un objeto de tipo RecyclerAdapter que recibe un arreglo de cadenas
        adapter = new RecyclerAdapter(nombres,noctrl);
        //adapterN = new RecyclerAdapter(noctrl);

        // Crea un objeto de tipo LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);

        // Establecer el LayautManager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        // Establecer el Adapter
        recyclerView.setAdapter(adapter);
        //recyclerView.setAdapter(adapterN);

    }
}
