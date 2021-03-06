package my.utm.rmc.p2eer.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import my.utm.rmc.p2eer.AppController;
import my.utm.rmc.p2eer.CustomListAdapter;
import my.utm.rmc.p2eer.Guide;
import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/8/15.
 */
public class ExpandableListItemActivity extends MylistActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    // Guides json url
    private  String url;
    private ProgressDialog pDialog;
    private final List<Guide> guideList = new ArrayList<>();
    private CustomListAdapter adapter;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_grant);
        final ListView listView = (ListView) findViewById(R.id.list);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> ENTER:ExpandableListItemActivity");

        //makejsonobjreq();
        adapter = new CustomListAdapter(this, guideList);
        listView.setAdapter(adapter);

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

//         changing action bar color
//        getActionBar().setBackgroundDrawable(
//                new ColorDrawable(Color.parseColor("#1b1b1b")));

//         Creating volley request obj
        System.out.println(getIntent().getExtras().getString("parameter"));
        if(getIntent().getExtras().getString("parameter").equals("GUP")) {
            url = "http://161.139.30.13/radismob/proposal/get_gup_data.php";
        } else if (getIntent().getExtras().getString("parameter").equals("MOSTI")) {
            url = "http://161.139.30.13/radismob/proposal/get_mosti_data.php";
        } else if (getIntent().getExtras().getString("parameter").equals("KPM")) {
            url = "http://161.139.30.13/radismob/proposal/get_kpm_data.php";
        } else if (getIntent().getExtras().getString("parameter").equals("OTHER")) {
            url = "http://161.139.30.13/radismob/proposal/get_other_data.php";
        }
        final JsonArrayRequest guideReq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());
                        hidePDialog();

                        // Parsing json
                        for (int i = 0; i < response.length(); i++) {
                            try {

                                JSONObject obj = response.getJSONObject(i);
                                Guide guide = new Guide();
                                guide.setPid(obj.getInt("pid"));
                                guide.setTitle(obj.getString("name"));
                                guide.setDefinition(obj.getString("definition"));
                                guide.setRequirement(obj.getString("requirement"));
                                guide.setPeriod(obj.getString("period"));
                                guide.setAllocation(obj.getString("allocation"));
                                guide.setKpi(obj.getString("kpi"));
                                guide.setHowto(obj.getString("howto"));
                                guide.setEvaluation(obj.getString("evaluation"));
                                guide.setCategory(obj.getString("category"));
                                guide.setThumbnailUrl(obj.getString("thumbnail"));
                                guide.setBengkelOs(obj.getString("bengkel_os"));
                                guide.setMeetingOs(obj.getString("meeting_os"));
                                guide.setBengkelLocal(obj.getString("bengkel_local"));
                                guide.setMeetingLocal(obj.getString("meeting_local"));
                                guide.setActivityFunding(obj.getString("activity_funding"));
                                guide.setActivitySource(obj.getString("activity_source"));
                                guide.setActivityUmum(obj.getString("activity_umum"));
                                guide.setUmum(obj.getString("permantauan_umum"));
                                guide.setLantikan(obj.getString("lantikan"));
                                guide.setKadar(obj.getString("kadar"));
                                guide.setSumber(obj.getString("sumber"));
                                guide.setRujukan(obj.getString("rujukan"));
//                                guide.setRating(((Number) obj.get("rating"))
//                                        .doubleValue());
//                                guide.setYear(obj.getInt("releaseYear"));
//
//                                // Genre is json array
//                                JSONArray genreArray = obj.getJSONArray("genre");
//                                ArrayList<String> genre = new ArrayList<>();
//                                for (int j = 0; j < genreArray.length(); j++) {
//                                    genre.add((String) genreArray.get(j));
//                                }
//                                guide.setGenre(genre);

                                // adding guide to guides array
                                guideList.add(guide);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                        adapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                hidePDialog();

            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(guideReq);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ExpandableListItemActivity.this, Description.class);
                i.putExtra("pid", guideList.get(position).getPid());
                i.putExtra("title", guideList.get(position).getTitle());
                i.putExtra("definition", guideList.get(position).getDefinition());
                i.putExtra("requirement", guideList.get(position).getRequirement());
                i.putExtra("period", guideList.get(position).getPeriod());
                i.putExtra("allocation", guideList.get(position).getAllocation());
                i.putExtra("kpi", guideList.get(position).getKpi());
                i.putExtra("howto", guideList.get(position).getHowto());
                i.putExtra("evaluation", guideList.get(position).getEvaluation());
                i.putExtra("category", guideList.get(position).getCategory());
                i.putExtra("thumbnail", guideList.get(position).getThumbnailUrl());
                i.putExtra("bengkelOs", guideList.get(position).getBengkelOs());
                i.putExtra("meetingOs", guideList.get(position).getMeetingOs());
                i.putExtra("bengkelLocal", guideList.get(position).getBengkelLocal());
                i.putExtra("meetingLocal", guideList.get(position).getMeetingLocal());
                i.putExtra("activityFunding", guideList.get(position).getActivityFunding());
                i.putExtra("activitySource", guideList.get(position).getActivitySource());
                i.putExtra("activityUmum", guideList.get(position).getActivityUmum());
                i.putExtra("permantauan_umum", guideList.get(position).getUmum());
                i.putExtra("lantikan", guideList.get(position).getLantikan());
                i.putExtra("kadar", guideList.get(position).getKadar());
                i.putExtra("sumber", guideList.get(position).getSumber());
                i.putExtra("rujukan", guideList.get(position).getRujukan());
                //i.putExtra("title", guideList.get(position).getTitle());
//                ArrayList<Guide> guideArrayList = (ArrayList<Guide>) listView.getItemAtPosition(position);
//                i.putExtra("type_of_grant", guideArrayList.get(getTitle()))



                startActivity(i);
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        hidePDialog();
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }

//    public void onPengurusanProposalClicked(final View view) {
//        Intent intent = new Intent(this, Description.class);
//        intent.putExtra("arraylist", );
//        startActivity(intent);
//
//
//    }
}
