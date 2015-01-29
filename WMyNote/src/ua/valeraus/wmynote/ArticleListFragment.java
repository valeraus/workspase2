package ua.valeraus.wmynote;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArticleListFragment extends ListFragment {
	String[] AndroidOS = new String[] { "Cupcake", "Donut", "Eclair", "Froyo",
			"Gingerbread", "Honeycomb", "Ice Cream SandWich", "Jelly Bean",
			"KitKat" };
	String[] Version = new String[] { "1.5", "1.6", "2.0-2.1", "2.2", "2.3",
			"3.0-3.2", "4.0", "4.1-4.3", "4.4" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.list_fragment, container, false);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, AndroidOS);
		setListAdapter(adapter);
		return view;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		ArticleReaderFragment txt = (ArticleReaderFragment) getFragmentManager()
				.findFragmentById(R.id.viewer);
		txt.change(AndroidOS[position], "Version : " + Version[position]);
		getListView().setSelector(android.R.color.holo_blue_dark);
	}
}