package my.utm.rmc.p2eer.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/24/15.
 */
public class PanduanPerlantikan extends MylistActivity {
    private ProgressDialog pDialog;
    private static final String TAG = MainActivity.class.getSimpleName();
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.desc_perlantikan);
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

        String title = getIntent().getExtras().getString("title");
        String category = getIntent().getExtras().getString("category");

        TextView test = (TextView) findViewById(R.id.grant_title);
        test.setText(title);

        if (category.equals("GUP")){
            url = "";
        }
    }
}
