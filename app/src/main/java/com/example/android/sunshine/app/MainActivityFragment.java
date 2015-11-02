package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] data = {
                "Lun 6/23 - Soleado - 31/17",
                "Mar 6/24 - Niebla - 21/8",
                "Mie 6/25 - Nublado - 22/17",
                "Jue 6/26 - Lluvia - 18/11",
                "Vie 6/27 - Niebla - 21/10",
                "Sab 6/28 - Atrapado - 23/18",
                "Dom 6/29 - Soleado - 20/7"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(data));

        mForecastAdapter =
                new ArrayAdapter<>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(mForecastAdapter);


        return rootView;
    }
}
