package mx.edu.unid.example.whatsapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link estados#newInstance} factory method to
 * create an instance of this fragment.
 */
public class estados extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerViewEstados;
    ArrayList<estadosModelo> listaestados;

    public estados() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mensajes.
     */
    // TODO: Rename and change types and number of parameters
    public static estados newInstance(String param1, String param2) {
        estados fragment = new estados();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_estados, container, false);
        listaestados=new ArrayList<>();
        recyclerViewEstados=vista.findViewById(R.id.recyclerEstados);
        recyclerViewEstados.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();
        RecyclerViewEstadosAdaptador adapter=new RecyclerViewEstadosAdaptador(listaestados);
        recyclerViewEstados.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listaestados.add(new estadosModelo("Alex","Hoy a las 2:02 p.m.",R.drawable.alex));
        listaestados.add(new estadosModelo("Edgardo","Ayer 9:37 p.m.",R.drawable.edgardo));
        listaestados.add(new estadosModelo("Tomas","Ayer 2:31 p.m.",R.drawable.tomas));
        listaestados.add(new estadosModelo("Erick","Hoy a las 12:59 p.m.",R.drawable.erick));
    }
}