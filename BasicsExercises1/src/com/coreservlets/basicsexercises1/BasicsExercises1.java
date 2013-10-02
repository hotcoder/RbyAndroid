package com.coreservlets.basicsexercises1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/** Loads a simple layout from main.xml. None of the GUI
 *  controls have any behavior, and strings are hardcoded
 *  in main.xml (not taken from strings.xml).
 *  <p>
 *  From <a href="http://www.coreservlets.com/android-tutorial/">
 *  the coreservlets.com Android programming tutorial series</a>.
 */

public class BasicsExercises1 extends Activity {
    /** Initializes the app when it is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button push = (Button)findViewById(R.id.Push);
        
        push.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), ((EditText)findViewById(R.id.password)).getText(), Toast.LENGTH_LONG).show();
				
			}
		});

    }
}