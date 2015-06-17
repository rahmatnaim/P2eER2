package my.utm.rmc.p2eer.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class ItemDataActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_guide_item);
    }

    public void onExpandListItemAdapterClicked(final View view) {
        Intent intent = new Intent(this, ExpandableListItemActivity.class);
        startActivity(intent);
    }
}
