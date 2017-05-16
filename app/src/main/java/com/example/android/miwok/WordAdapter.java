package com.example.android.miwok;

import android.app.Activity;
import android.net.LinkAddress;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arfat Salman on 14-Mar-17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mCategoryColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);

        mCategoryColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView engTextView = (TextView) listItemView.findViewById(R.id.english);
        engTextView.setText(currentWord.getEnglish());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getMiwok());

        LinearLayout text = (LinearLayout)listItemView.findViewById(R.id.text_container);
        text.setBackgroundColor(ContextCompat.getColor(getContext(), mCategoryColor));

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
