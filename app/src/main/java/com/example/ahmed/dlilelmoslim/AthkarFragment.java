package com.example.ahmed.dlilelmoslim;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;


public class AthkarFragment extends Fragment {


    public AthkarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_azkar, container, false);

        String[] strings = new String[]{"أذكار الصباح", "أذكار المساء", "أذكار الاستيقاظ", "أذكار النوم", "أذكار الوضوء", "أذكار المنزل", "أذكار الأذان", "أذكار المسجد", "الأذكار بعد الصلوات المفروضة"};
        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_activated_1, strings);
        ListView listView = view.findViewById(R.id.azkar_fragment);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent(mirinnig.class);
                        break;
                    case 1:
                        intent(evning.class);
                        break;
                    case 2:
                        intent(wakeup.class);
                        break;
                    case 3:
                        intent(sleep.class);
                        break;
                    case 4:
                        intent(beforewodoa.class);
                        break;
                    case 5:
                        intent(outsidehome.class);
                        break;
                    case 6:
                        intent(athan.class);
                        break;
                    case 7:
                        intent(backmosque.class);
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