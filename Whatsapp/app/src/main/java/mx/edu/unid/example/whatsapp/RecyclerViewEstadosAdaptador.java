package mx.edu.unid.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewEstadosAdaptador extends RecyclerView.Adapter<RecyclerViewEstadosAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView contacto,mensaje;
        private ImageView fotoContacto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contacto=itemView.findViewById(R.id.tvContacto);
            mensaje=itemView.findViewById(R.id.tvmensaje);
            fotoContacto=itemView.findViewById(R.id.imgChat);
        }
    }

    public List<estadosModelo> estadosLista;

    public RecyclerViewEstadosAdaptador(List<estadosModelo> estadosLista) {
        this.estadosLista = estadosLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estados,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contacto.setText(estadosLista.get(position).getContacto());
        holder.mensaje.setText(estadosLista.get(position).getMensaje());
        holder.fotoContacto.setImageResource(estadosLista.get(position).getImgContacto());
    }

    @Override
    public int getItemCount() {
        return estadosLista.size();
    }
}
