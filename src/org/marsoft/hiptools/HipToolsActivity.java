package org.marsoft.hiptools;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import android.widget.Toast;

public class HipToolsActivity extends Activity {
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
}