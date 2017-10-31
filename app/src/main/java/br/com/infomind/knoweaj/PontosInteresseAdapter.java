package br.com.infomind.knoweaj;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**

 */

public class PontosInteresseAdapter extends RecyclerView.Adapter {

    Context context;
    List<PontoInteresse> listaPontoInteresse;

    public PontosInteresseAdapter(Context c, List<PontoInteresse> f){
        this.context = c;
        this.listaPontoInteresse = f;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ponto_interesse_inflater, parent, false);

        pontoInteresseViewHolder holder = new pontoInteresseViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        pontoInteresseViewHolder pontoHolder = (pontoInteresseViewHolder) holder;
        PontoInteresse pontoEscolhido = listaPontoInteresse.get(position);
        pontoHolder.textViewNome.setText(pontoEscolhido.getNome());

    }

    @Override
    public int getItemCount() {
        return listaPontoInteresse == null ? 0 : listaPontoInteresse.size();
    }

    public class pontoInteresseViewHolder extends RecyclerView.ViewHolder {

        final TextView textViewNome;
        //final ImageView img;
        public pontoInteresseViewHolder(View v) {
            super(v);
            textViewNome = v.findViewById(R.id.ponto_interesse);
            //img = v.findViewById(R.id.img);


        }
    }

}