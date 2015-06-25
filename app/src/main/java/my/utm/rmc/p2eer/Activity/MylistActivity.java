package my.utm.rmc.p2eer.Activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import my.utm.rmc.p2eer.MylistAdapter;
import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class MylistActivity extends BaseActivity {

    private ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.desc_proposal);
        mListView = (ListView) findViewById(R.id.activity_mylist_listview);
    }

    public ListView getListView() {
        return mListView;
    }


    protected MylistAdapter createListAdapter() {
        return new MylistAdapter(this);
    }
}
