package com.example.test;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.Window;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends SherlockActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This has to be called before setContentView and you must use the
        //class in com.actionbarsherlock.view and NOT android.view
        requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);
        
        setSupportProgressBarVisibility(true);
 

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(R.menu.menu, menu);;
        return super.onCreateOptionsMenu(menu);
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
 
         switch (item.getItemId())
         {
         case R.id.help_button:
             Toast.makeText(MainActivity.this, "help button", Toast.LENGTH_SHORT).show();
             return true;
  
         case R.id.settings_button:
             Toast.makeText(MainActivity.this, "settings button", Toast.LENGTH_SHORT).show();
             return true;
          
        default:
            return super.onOptionsItemSelected(item);
        }
    }


}
