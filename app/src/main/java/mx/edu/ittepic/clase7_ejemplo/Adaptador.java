package mx.edu.ittepic.clase7_ejemplo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Banner> listItems;

    public Adaptador(Context context, ArrayList<Banner> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size(); //Tamaño asociado al ListView
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position); //Obtener elemento de la lista
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Banner item = (Banner) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);

        ImageView imgFoto = convertView.findViewById(R.id.imgFoto);
        TextView txvTitulo = convertView.findViewById(R.id.txvTitulo);
        TextView txvDescripcion = convertView.findViewById(R.id.txvDescripcion);

        imgFoto.setImageResource(item.getImagen());
        txvTitulo.setText(item.getTitulo());
        txvDescripcion.setText(item.getDescripcion());

        return convertView;
    }
}
