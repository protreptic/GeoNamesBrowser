package org.javaprotrepticon.android.geonamesbrowser.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SearchFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		TextView textView = new TextView(getActivity());
		textView.setText("dasdasdas");
		 
		return textView;
	}
	
}
