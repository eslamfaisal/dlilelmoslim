package com.example.ahmed.dlilelmoslim;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdieaaFragment extends Fragment {


    public AdieaaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adieaa, container, false);

        String[] strings = new String[]{
                "دعاء صلاة الاستخارة",
                "دعاء الهم والحزن",
                "الدعاء قبل الطعام",
                "الدعاء بعد الطعام",
                "دعاء السفر",
                "الدعاء عند الغضب",
                "دعاء دخول السوق"
        };

        ArrayAdapter adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_activated_1, strings);
        ListView listView = view.findViewById(R.id.adieaa_fragment);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent(estikarapray.class);
                        break;
                    case 1:
                        intent(graive.class);
                        break;
                    case 2:
                        intent(beforeat.class);
                        break;
                    case 3:
                        intent(aftereat.class);
                        break;
                    case 4:
                        intent(travilling.class);
                        break;
                    case 5:
                        intent(angery.class);
                        break;
                    case 6:
                        intent(entermarket.class);
                        break;
                }
            }
        });

        return view;

    }

    private void intent(Class mirinnigClass) {
        Intent intent = new Intent(getContext(), mirinnigClass);
        startActivity(intent);
    }

}
