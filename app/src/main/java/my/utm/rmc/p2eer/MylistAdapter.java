package my.utm.rmc.p2eer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nhaarman.listviewanimations.ArrayAdapter;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class MylistAdapter extends ArrayAdapter<String> {

    private final Context mContext;

    public MylistAdapter(final Context context) {
        mContext = context;
        for (int i = 0; i < 1000; i++) {
            add(mContext.getString(R.string.row_number, i));
        }
    }

    @Override
    public long getItemId(final int position) {
        return getItem(position).hashCode();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

}
