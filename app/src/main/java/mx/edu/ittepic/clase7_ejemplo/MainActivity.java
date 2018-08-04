package mx.edu.ittepic.clase7_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstView;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstView = findViewById(R.id.lsvOfertas);
        adaptador = new Adaptador(this, getArrayItem());
        lstView.setAdapter(adaptador);
    }

    private ArrayList<Banner> getArrayItem(){
        ArrayList<Banner> lista = new ArrayList<>();
        lista.add(new Banner(R.drawable.wipizz, "50% de descuento", "En alitas, cerveza y aros de cebolla"));
        lista.add(new Banner(R.drawable.pizzahut, "30% de descuento","En pizzas grande y familiar"));
        lista.add(new Banner(R.drawable.burger, "25% de descuento", "En combos dobles"));
        return  lista;
    }

}
