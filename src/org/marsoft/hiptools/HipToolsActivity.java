package org.marsoft.hiptools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import android.widget.Toast;

public class HipToolsActivity extends Activity {
	private String[] hip = null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView sl = (TextView) findViewById(R.id.slavonic);
        Typeface font = Typeface.createFromAsset(this.getAssets(), "fonts/HirmUcs8.ttf");
        sl.setTypeface(font);
        sl.setTextSize(24);
        sl.setText("Прове1рка Ц~С`, тэ3к4с5т6а7. Съе1шь ещё2 этихъ мzгкихъ французскихъ бuлокъ1булок1бу~локъ");
    }
    
    private void loadHip(File file) throws IOException {
    	BufferedReader r = new BufferedReader(new FileReader(file));
    	ArrayList<String> hip = new ArrayList<String>();
    	String para = "";
    	for(String line = r.readLine(); line != null; line = r.readLine()) {
    		if(line.trim().length() > 0)
    			para += line;
    		else { // конец абзаца
    			hip.add(para);
    			para = "";
    		}
    	}
    	this.hip = hip.toArray(new String[0]);
    }
}