package com.koove.koovematerial.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.andtinder.R;
import com.andtinder.model.CardModel;
import com.andtinder.view.CardStackAdapter;
import com.bumptech.glide.Glide;
import com.koove.koovematerial.Model.ResponseModel;

import java.util.ArrayList;

public final class SimpleCardStackAdapter extends CardStackAdapter {

	private ArrayList<ResponseModel> modelArrayList;
	private Context mContext;

	public SimpleCardStackAdapter(Context mContext, ArrayList<ResponseModel> modelArrayList) {
		super(mContext);
		this.mContext = mContext;
		this.modelArrayList = modelArrayList;
	}

	@Override
	protected View getCardView(int position, CardModel model, View convertView, ViewGroup parent) {
		if(convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.std_card_inner, parent, false);
			assert convertView != null;
		}

		model.setTitle(modelArrayList.get(position).getPostTitle());
		model.setDescription(modelArrayList.get(position).getSeller().getDisplayName());
		ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
		Glide.with(mContext).load(modelArrayList.get(position).getMediumImage()).into(imageView);
		imageView.setImageDrawable(model.getCardImageDrawable());
		((TextView) convertView.findViewById(R.id.title)).setText(model.getTitle());
		((TextView) convertView.findViewById(R.id.description)).setText(model.getDescription());

		return convertView;
	}
}
