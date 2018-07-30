package com.example.user.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.historical_yerebatan, R.string.info_historical_yerebatan,
                R.drawable.yerebatan));
        words.add(new Word(R.string.historical_bluemos, R.string.info_historical_bluemos,
                R.drawable.bluemos));
        words.add(new Word(R.string.historical_ayasofya, R.string.info_historical_ayasofya,
                R.drawable.ayasofya));
        words.add(new Word(R.string.historical_topkapi, R.string.info_historical_topkapi,
                R.drawable.topkapi));
        words.add(new Word(R.string.historical_gulhane, R.string.info_historical_gulhane,
                R.drawable.gulhane));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_historical);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
