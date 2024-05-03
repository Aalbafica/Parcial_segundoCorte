package com.example.parcial2.UsuarioAdapt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.R;
import com.example.parcial2.RecyclerViewInterface;
import com.example.parcial2.clases.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapt extends RecyclerView.Adapter<UserAdapt.ViewHolder> {

    private RecyclerViewInterface recyclerViewInterface;
    private List<Usuario> datos;


    public UserAdapt(List<Usuario> datos, RecyclerViewInterface recyclerViewInterface){
        this.datos= datos;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public UserAdapt.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario, parent, false);
        return new ViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapt.ViewHolder holder, int position) {
        Usuario dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_usuario, estado_usuario, tipo_usuario;
        ImageView img_usuario;

        private Button seemore;
        public ViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            txt_nombre_usuario = itemView.findViewById(R.id.txt_nombre_usuario);
            estado_usuario = itemView.findViewById(R.id.estado_usuario);
            tipo_usuario = itemView.findViewById(R.id.tipo_usuario);

            img_usuario = itemView.findViewById(R.id.img_usuario);

            seemore = itemView.findViewById(R.id.btn_see);

            seemore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerViewInterface !=null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }

                    }
                }
            });

        }

        public void bind(Usuario dato){
            txt_nombre_usuario.setText(dato.getNombre());
            estado_usuario.setText(dato.getEstado());
            tipo_usuario.setText(dato.getTipo());



            // imagen...
            Picasso.get().load(dato.getImagen()).into(img_usuario);
        }

    }

}
