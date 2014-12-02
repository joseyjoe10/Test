package ie.gmit.sw;


import android.os.*;
import android.app.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	private int n = 20;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.dynamic_layout); //Attach the layout to this activity

	    
	    for (int i = 0; i < n; i++) {
	        Button button = new Button(this);
	        button.setText("Button :"+i);
	        button.setId(i);
	        final int buttonID = button.getId();

	        LinearLayout layout = (LinearLayout) findViewById(R.id.dyn_layout);
	        layout.addView(button);
	        	        	        
	        button.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Toast.makeText(MainActivity.this, "Button clicked index = " + buttonID, Toast.LENGTH_SHORT).show();
	            }
	        });
	    }
	    
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }   
}