package my.utm.rmc.p2eer.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import my.utm.rmc.p2eer.AppController;
import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/21/15.
 */
public class PanduanPemantauan extends MylistActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private String url;
    private ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.desc_pemantauan);
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

        String title = getIntent().getExtras().getString("title");
        String category = getIntent().getExtras().getString("category");

        TextView test = (TextView) findViewById(R.id.grant_title);
        test.setText(title);


        if (category.equals("GUP")) {
            url = "http://161.139.30.13/radismob/get_gup_pemantauan.php";
        } else if (category.equals("MOSTI")) {
            url = "http://161.139.30.13/radismob/get_mosti_pemantauan.php";
        } else if (category.equals("KPM")) {
            url = "http://161.139.30.13/radismob/get_kpm_pemantauan.php";
        } else if (category.equals("OTHER")) {
            url = "http://161.139.30.13/radismob/get_other_pemantauan.php";
        }

        makeJSONRequest();

    }

    private void makeJSONRequest() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        Log.d(TAG, jsonObject.toString());

                        try {
                            String report_dev = jsonObject.getString("report_dev").replaceAll("\\\\n", "\n");
                            String report_final = jsonObject.getString("report_final").replaceAll("\\\\n", "\n");
                            String vsiri_transfer = jsonObject.getString("vsiri_transfer").replaceAll("\\\\n", "\n");
                            String saluran = jsonObject.getString("saluran").replaceAll("\\\\n", "\n");
                            String lanjut_tempoh = jsonObject.getString("lanjut_tempoh").replaceAll("\\\\n", "\n");
                            String method = jsonObject.getString("method").replaceAll("\\\\n", "\n");

                            TextView x1 = (TextView) findViewById(R.id.perkembangan);
                            TextView x2 = (TextView) findViewById(R.id.akhir);
                            TextView x3 = (TextView) findViewById(R.id.vsiri);
                            TextView x4 = (TextView) findViewById(R.id.allocation);
                            TextView x5 = (TextView) findViewById(R.id.tempoh);
                            TextView x6 = (TextView) findViewById(R.id.method);

                            x1.setText(report_dev);
                            x2.setText(report_final);
                            x3.setText(vsiri_transfer);
                            x4.setText(saluran);
                            x5.setText(lanjut_tempoh);
                            x6.setText(method);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),
                                    "Error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        AppController.getInstance().addToRequestQueue(jsonObjectRequest);
    }
}