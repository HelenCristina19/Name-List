package com.example.listadenomes;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listNomes;

    private String[] itens = {
            "Ana julia", "Eduarda Renes", "Maite Valentina",
            "Rafael Cristofori", "Sergio Santos"


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNomes = findViewById(R.id.listNomes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );

        listNomes.setAdapter(adapter);

        listNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String nomeSelecionado = listNomes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), nomeSelecionado, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
