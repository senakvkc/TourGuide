package com.example.user.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.R.layout;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurants_nar, R.string.info_restaurant_nar,
                R.drawable.maidens));
        words.add(new Word(R.string.restaurants_maidens, R.string.info_restaurant_maidens,
                R.drawable.nar));
        words.add(new Word(R.string.restaurants_ulus, R.string.info_restaurant_ulus,
                R.drawable.ulus));
        words.add(new Word(R.string.restaurants_lamouette, R.string.info_restaurant_lamouette,
                R.drawable.la_mouette_007));
        words.add(new Word(R.string.restaurants_rumeliskele, R.string.info_restaurant_rumeliskele,
                R.drawable.rumeli_hisali__skele_007));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);

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
