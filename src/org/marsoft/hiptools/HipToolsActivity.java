package org.marsoft.hiptools;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.TextView;
import android.widget.Toast;

public class HipToolsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setAdapter(new ImageAdapter(this));
        
        g.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
        	public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        		Toast.makeText(HipToolsActivity.this, "" + position, Toast.LENGTH_SHORT).show();
        	}
			@Override
			public void onNothingSelected(AdapterView<?> parent) {
			}
        });
    }
    
    public class ImageAdapter extends BaseAdapter {
    	int mGalleryItemBackground;
    	private Context mContext;
    	
    	private Integer[] mImageIds = {
    			R.drawable.icon,
    			R.drawable.icon
    	};
    	
    	public ImageAdapter(Context c) {
    		mContext = c;
    		TypedArray a = obtainStyledAttributes(R.styleable.HipToolsGallery);
    		mGalleryItemBackground = a.getResourceId(
    				R.styleable.HipToolsGallery_android_galleryItemBackground, 0);
    		a.recycle();
    	}
    	
    	public int getCount() {
    		return mImageIds.length;
    	}
    	
    	public Object getItem(int position) {
    		return mImageIds[position];
    	}
    	
    	public long getItemId(int position) {
    		return position;
    	}
    	
    	public View getView(int position, View convertView, ViewGroup parent) {
    		TextView t = new TextView(mContext);
    		t.setText("№"+position);
    		t.setLayoutParams(new Gallery.LayoutParams(128, 128));
    		t.setBackgroundResource(mGalleryItemBackground);
    		return t;
    	}
    }
}