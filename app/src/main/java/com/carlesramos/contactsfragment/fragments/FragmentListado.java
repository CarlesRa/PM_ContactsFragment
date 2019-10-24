package com.carlesramos.contactsfragment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.carlesramos.contactsfragment.R;
import com.carlesramos.contactsfragment.interficies.IContacteListener;

public class FragmentListado extends Fragment {

    private IContacteListener listener;
    private ListView rvListado;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvListado = getView().findViewById(R.id.lstListado);

    }

    public void setContactesListener(IContacteListener listener){
        this.listener = listener;
    }
}
