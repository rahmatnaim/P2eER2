package my.utm.rmc.p2eer.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import my.utm.rmc.p2eer.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> ENTER:MainActivity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onGUPItemListlicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        intent.putExtra("parameter", "GUP");
        startActivity(intent);
    }

    public void onMostiItemClicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        intent.putExtra("parameter", "MOSTI");
        startActivity(intent);
    }
    public void onKpmItemClicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        intent.putExtra("parameter", "KPM");
        startActivity(intent);
    }
    public void onOtherItemClicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        intent.putExtra("parameter", "OTHER");
        startActivity(intent);
    }
}
