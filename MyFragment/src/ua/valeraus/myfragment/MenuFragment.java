package ua.valeraus.myfragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MenuFragment extends ListFragment {
	// String[] AndroidOS = new String[] { "Cupcake", "Donut", "Eclair",
	// "Froyo",
	// "Gingerbread", "Honeycomb", "Ice Cream SandWich", "Jelly Bean",
	// "KitKat" };
	// String[] Version = new String[] { "1.5", "1.6", "2.0-2.1", "2.2", "2.3",
	// "3.0-3.2", "4.0", "4.1-4.3", "4.4" };
	// String[] sNote = new String[] { "", "" };

	// final ListView listViewTest = new ListView(this);

	ArrayList<String> alNote = new ArrayList<String>();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		alNote.add("first");
		alNote.add("second");
		alNote.add("third");

		View view = inflater.inflate(R.layout.list_fragment, container, false);

		LayoutInflater factory = getLayoutInflater(null);
		View regisText = factory.inflate(R.layout.crete_note_activity, null);
		EditText etNote = (EditText) regisText
				.findViewById(R.id.edittext_note_content);
		String sNote = etNote.getText().toString();
		// alNote.add(0, sNote);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, alNote);
		// adapter.notifyDataSetChanged();
		setListAdapter(adapter);
		return view;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		TextFragment txt = (TextFragment) getFragmentManager()
				.findFragmentById(R.id.fragment2);
		txt.change(alNote.get(position), alNote.get(position));
		getListView().setSelector(android.R.color.holo_blue_dark);
	}
}