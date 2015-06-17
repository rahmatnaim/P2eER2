package my.utm.rmc.p2eer.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        assert getActionBar() != null;
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
