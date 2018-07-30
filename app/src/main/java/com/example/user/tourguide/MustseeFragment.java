package com.example.user.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MustseeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.mustsee_grandbazaar, R.string.info_mustsee_grandbazaar,
                R.drawable.grandbazaar));
        words.add(new Word(R.string.mustsee_galata, R.string.info_mustsee_galata,
                R.drawable.galata));
        words.add(new Word(R.string.mustsee_arcmus, R.string.info_mustsee_arcmus,
                R.drawable.archmus));
        words.add(new Word(R.string.mustsee_toy, R.string.info_mustsee_toy,
                R.drawable.toymuseum));
        words.add(new Word(R.string.mustsee_sabanci, R.string.info_mustsee_sabanci,
                R.drawable.sabanci));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_mustSee);

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
