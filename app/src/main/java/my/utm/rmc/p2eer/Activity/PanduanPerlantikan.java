package my.utm.rmc.p2eer.Activity;

import android.app.Application;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import my.utm.rmc.p2eer.AppController;
import my.utm.rmc.p2eer.Guide;
import my.utm.rmc.p2eer.R;
import my.utm.rmc.p2eer.util.CustomRequest;

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
        String title = getIntent().getExtras().getString("title");
        String activityUmum = getIntent().getExtras().getString("permantauan_umum").replaceAll("\\\\n", "\n");
        String bengkelOs = getIntent().getExtras().getString("lantikan").replaceAll("\\\\n", "\n");
        String meetingOs = getIntent().getExtras().getString("kadar").replaceAll("\\\\n", "\n");
        String bengkelLocal = getIntent().getExtras().getString("sumber").replaceAll("\\\\n", "\n");
        String meetingLocal = getIntent().getExtras().getString("rujukan").replaceAll("\\\\n","\n");


        TextView t = (TextView) findViewById(R.id.grant_title);
        TextView d = (TextView) findViewById(R.id.syaratumum);
        TextView bOs = (TextView) findViewById(R.id.perlantikan);
        TextView mOs = (TextView) findViewById(R.id.kadar);
        TextView bOl = (TextView) findViewById(R.id.pembiayaan);
        TextView mOl = (TextView) findViewById(R.id.rujukan);

        t.setText(title);
        d.setText(activityUmum);
        bOs.setText(bengkelOs);
        mOs.setText(meetingOs);
        bOl.setText(bengkelLocal);
        mOl.setText(meetingLocal);
    }
}
