package mx.edu.unid.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link chats#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chats extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerViewChats;
    ArrayList<chatModelo> listachats;


    public chats() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment chats.
     */
    // TODO: Rename and change types and number of parameters
    public static chats newInstance(String param1, String param2) {
        chats fragment = new chats();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_chats, container, false);
        listachats=new ArrayList<>();
        recyclerViewChats=vista.findViewById(R.id.recyclerChats);
        recyclerViewChats.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();
        RecyclerViewChatAdaptador adapter=new RecyclerViewChatAdaptador(listachats);
        recyclerViewChats.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listachats.add(new chatModelo("Alberto","Vamos al oxxo",R.drawable.alberto));
        listachats.add(new chatModelo("Erick","Como van con la tarea chavos?",R.drawable.erick));
        listachats.add(new chatModelo("Edgardo","Que tal como estan?",R.drawable.edgardo));
        listachats.add(new chatModelo("Alex","Que va a haber este sabado?",R.drawable.alex));
        listachats.add(new chatModelo("Irma","Aqui echandole ganas",R.drawable.irma));
        listachats.add(new chatModelo("Tomas","Tengo un chorro de chamba!",R.drawable.tomas));
        listachats.add(new chatModelo("Vladimir","Que paso Masters?",R.drawable.vladimir));
    }

}


