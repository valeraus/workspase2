package ua.valeraus.loginregistr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SingUp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up_screen);
		
		Button btnSingIn;
		btnSingIn = (Button) findViewById(R.id.btnSignUp);
		btnSingIn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				Intent intent = new Intent(MainActivity.this, SingUp.class);
//				startActivity(intent);
			}
		});

		
	}

}
