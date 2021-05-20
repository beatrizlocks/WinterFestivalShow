package br.senai.sc.winterfestival;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.senai.sc.winterfestival.Modelos.Shows;

public class MainActivity extends AppCompatActivity {

    private ListView listViewShows;
    private ArrayAdapter<Shows> adapterShows;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewShows = findViewById(R.id.listView_shows);
        ArrayList<Shows> shows = this.criarListaShows();

        adapterShows = new ArrayAdapter<Shows>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                shows);
        listViewShows.setAdapter(adapterShows);

    }

    private ArrayList<Shows> criarListaShows() {
        ArrayList<Shows> Shows = new ArrayList<Shows>();
        Shows.add(new Shows("Jota Quest","20 de Julho","Casa Do Dani" ));
        Shows.add(new Shows("The Black Eyed Peas","21 de Julho","Casa do  Rods"));
        Shows.add(new Shows("AnaVitória","22 de Julho","Casa da Bea"));
        return Shows;

    }
}