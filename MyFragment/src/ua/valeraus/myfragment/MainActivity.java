package ua.valeraus.myfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	Intent intent = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		// �������� ��� ���������� ������ ����
		switch (id) {
		case R.id.action_notes:
			// infoTextView.setText("1");
			Toast.makeText(getApplicationContext(), "Notes", Toast.LENGTH_SHORT)
					.show();

			return true;
		case R.id.action_trash:
			// infoTextView.setText("2");
			return true;
		case R.id.action_archive:
			// infoTextView.setText("3");
			return true;
		case R.id.action_setting:
			// infoTextView.setText("4");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}