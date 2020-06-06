package mx.edu.unid.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewChatAdaptador extends RecyclerView.Adapter<RecyclerViewChatAdaptador.ViewHolder> {

    public interface OnItemClickListener {
        public void onItemClick(View view, int position,  List<chatModelo> chatLista);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView contacto,mensaje;
        private ImageView fotoContacto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contacto=itemView.findViewById(R.id.tvContacto);
            mensaje=itemView.findViewById(R.id.tvmensaje);
            fotoContacto=itemView.findViewById(R.id.imgChat);
        }

        @Override
        public void onClick(View v) {
            if (chatModelo != null) {
                chatModelo.onItemClick(v, getPosition(), getData());
            }
        }
    }

    public List<chatModelo> chatLista;

    public RecyclerViewChatAdaptador(List<chatModelo> chatLista) {
        this.chatLista = chatLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contacto.setText(chatLista.get(position).getContacto());
        holder.mensaje.setText(chatLista.get(position).getMensaje());
        holder.fotoContacto.setImageResource(chatLista.get(position).getImgContacto());
    }

    @Override
    public int getItemCount() {
        return chatLista.size();
    }
}
