package my.utm.rmc.p2eer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;

import java.util.List;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Guide> guideItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Guide> guideItems) {
        this.activity = activity;
        this.guideItems = guideItems;
    }

    @Override
    public int getCount() {
        return guideItems.size();
    }

    @Override
    public Object getItem(int location) {
        return guideItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_grid_panduan, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
//        NetworkImageView thumbNail = (NetworkImageView) convertView
//                .findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);
//        TextView rating = (TextView) convertView.findViewById(R.id.rating);

        Guide m = guideItems.get(position);

        title.setText(m.getTitle());


        return convertView;
    }
}
