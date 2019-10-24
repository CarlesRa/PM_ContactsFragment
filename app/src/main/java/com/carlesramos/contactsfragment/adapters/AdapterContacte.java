package com.carlesramos.contactsfragment.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.carlesramos.contactsfragment.R;
import com.carlesramos.contactsfragment.modelo.Contacte;

public class AdapterContacte extends RecyclerView.Adapter<AdapterContacte.ContactesViewHolder> implements View.OnClickListener{

    private Context context;
    private Contacte[] contactes;

    public AdapterContacte(Context context, Contacte[] contactes) {
        this.context = context;
        this.contactes = contactes;
    }

    @NonNull
    @Override
    public AdapterContacte.ContactesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_contactos, parent,false);
        itemView.setOnClickListener(this);
        ContactesViewHolder cvh = new ContactesViewHolder(itemView);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterContacte.ContactesViewHolder holder, int position) {
        Contacte item = contactes[position];
        holder.bindContacte(item);
    }

    @Override
    public int getItemCount() {
        return contactes.length;
    }

    @Override
    public void onClick(View v) {

    }

    static class ContactesViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombre;
        private TextView tvApellido;
        private TextView tvDireccion;
        private TextView tvEmpresa;
        private TextView tvFechaNac;
        private TextView tvTelefono1;
        private TextView tvTelefono2;
        private TextView tvEmail;

        public ContactesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvApellido = itemView.findViewById(R.id.tvApellido);
            tvDireccion = itemView.findViewById(R.id.tvDireccion);
            tvEmpresa = itemView.findViewById(R.id.tvEmpresa);
            tvFechaNac = itemView.findViewById(R.id.tvFechaNac);
            tvTelefono1 = itemView.findViewById(R.id.tvTelefono1);
            tvTelefono2 = itemView.findViewById(R.id.tvTelefono2);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }

        public void bindContacte(Contacte c){
            tvNombre.setText(c.getNombre());
            tvApellido.setText(c.getApellido());
            tvDireccion.setText(c.getDireccion());
            tvEmpresa.setText(c.getEmpresa());
            tvFechaNac.setText(c.getFechaNac());
            tvTelefono1.setText(c.getTelefono1());
            tvTelefono2.setText(c.getTelefono2());
        }
    }
}
