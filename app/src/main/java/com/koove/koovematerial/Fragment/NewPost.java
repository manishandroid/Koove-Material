package com.koove.koovematerial.Fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.koove.koovematerial.Adapter.SimpleCardStackAdapter;
import com.koove.koovematerial.Model.ResponseModel;
import com.koove.koovematerial.R;

import java.util.ArrayList;

/**
 * Created by Manish on 10/18/2015.
 */
public class NewPost extends Fragment
{
    private CardContainer mCardContainer;

    private static ArrayList<ResponseModel> responseModelArrayList;

    public static NewPost getInstance(ArrayList<ResponseModel> responseModelArrayList)
    {
        NewPost newPost = new NewPost();
        NewPost.responseModelArrayList = responseModelArrayList;
        return newPost;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_swipable_cards, null);
        setupCardView(view);
        return view;
    }

    private void setupCardView(View view)
    {
        mCardContainer = (CardContainer) view.findViewById(R.id.layoutview);
        Resources r = getResources();
        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getActivity(), responseModelArrayList);

        for(int i = 0; i < responseModelArrayList.size(); i++)
        {
            adapter.add(new CardModel());

        }
        mCardContainer.setAdapter(adapter);
    }
}
