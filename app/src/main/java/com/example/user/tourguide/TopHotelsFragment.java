package com.example.user.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TopHotelsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.tophotels_ciragan, R.string.info_tophotels_ciragan,
                R.drawable.ciragan));
        words.add(new Word(R.string.tophotels_hilton, R.string.info_tophotels_hilton,
                R.drawable.hilton));
        words.add(new Word(R.string.tophotels_swiss, R.string.info_tophotels_swiss,
                R.drawable.swiss));
        words.add(new Word(R.string.tophotels_fourseasons, R.string.info_tophotels_fourseasons,
                R.drawable.fourseasons));
        words.add(new Word(R.string.tophotels_raffles, R.string.info_tophotels_raffles,
                R.drawable.raffles));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_topHotels);

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
