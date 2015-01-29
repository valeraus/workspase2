package ua.valeraus.wmynote;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends Activity {

	private EditText etEmail;
	private EditText etPass;
	private EditText etUserName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up_screen);

		etEmail = (EditText) findViewById(R.id.etEmail);
		etPass = (EditText) findViewById(R.id.etPass);
		etUserName = (EditText) findViewById(R.id.etUserName);
		// Button btnSingUp;
		// btnSingUp = (Button) findViewById(R.id.btnSignUp2);
		// btnSingUp.setOnClickListener(new OnClickListener() {

		findViewById(R.id.btnSignUp2).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				final String email = etEmail.getText().toString();
				if (!isValidEmail(email)) {
					etEmail.setError("Invalid Email");
					Toast.makeText(getApplicationContext(), "Invalid Email",
							Toast.LENGTH_LONG).show();
				}

				final String pass = etPass.getText().toString();
				if (!isValidPassword(pass)) {
					etPass.setError("Invalid Password");
					Toast.makeText(getApplicationContext(), "Invalid Password",
							Toast.LENGTH_LONG).show();
				}

				setContentView(R.layout.note_fragment);
			}
		});

	}

	// validating email id
	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// validating password with retype password
	private boolean isValidPassword(String pass) {
		if (pass != null && pass.length() > 5) {
			return true;
		}
		return false;
	}

}