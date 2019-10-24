package com.carlesramos.contactsfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.carlesramos.contactsfragment.R;
import com.carlesramos.contactsfragment.interficies.IContacteListener;

public class FragmentDetalle extends Fragment {
    private IContacteListener listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle,container,false);
    }

    public void setContactesListener(IContacteListener listener){
        this.listener = listener;
    }
    public void mostrarDetalle(){
        LinearLayout linDetalle = getView().findViewById(R.id.lstDetalle);
    }
}
