package ua.valeraus.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {
	TextView text, vers;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.text_fragment, container, false);
		text = (TextView) view.findViewById(R.id.Notes);
		vers = (TextView) view.findViewById(R.id.Note);
		return view;
	}

	public void change(String txt, String txt1) {
		text.setText(txt);
		vers.setText(txt1);
	}
}