package my.utm.rmc.p2eer.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/10/15.
 */
public class PanduanAktiviti extends MylistActivity {

    private static final int INITIAL_DELAY_MILLIS = 500;
    private boolean mLimited;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.desc_aktiviti);
        String title = getIntent().getExtras().getString("title");
        String activityUmum = getIntent().getExtras().getString("activityUmum").replaceAll("\\\\n", "\n");
        String bengkelOs = getIntent().getExtras().getString("bengkelOs").replaceAll("\\\\n", "\n");
        String meetingOs = getIntent().getExtras().getString("meetingOs").replaceAll("\\\\n", "\n");
        String bengkelLocal = getIntent().getExtras().getString("bengkelLocal").replaceAll("\\\\n", "\n");
        String meetingLocal = getIntent().getExtras().getString("meetingLocal").replaceAll("\\\\n","\n");
        String activityFunding = getIntent().getExtras().getString("activityFunding").replaceAll("\\\\n","\n");
        String activitySource = getIntent().getExtras().getString("activitySource").replaceAll("\\\\n","\n");


        LinearLayout t1 = (LinearLayout) findViewById(R.id.layoutSwitch1);
        LinearLayout t2 = (LinearLayout) findViewById(R.id.layoutSwitch2);
        LinearLayout t3 = (LinearLayout) findViewById(R.id.layoutSwitch3);
        LinearLayout t4 = (LinearLayout) findViewById(R.id.layoutSwitch4);
        t2.setVisibility(View.GONE);
        t4.setVisibility(View.GONE);

        if (bengkelOs.equals("null")){
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.VISIBLE);
            TextView x2 = (TextView) findViewById(R.id.fulldesc);
            x2.setText(meetingOs);
        }

        if (bengkelLocal.equals("null")){
            t3.setVisibility(View.GONE);
            t4.setVisibility(View.VISIBLE);
            TextView x3 = (TextView) findViewById(R.id.descriptionAll);
            x3.setText(meetingLocal);
        }

        if ((bengkelOs.equals("null"))&&(meetingOs.equals("null"))) {
            
        }



        TextView t = (TextView) findViewById(R.id.grant_title);
        TextView d = (TextView) findViewById(R.id.definition);
        TextView bOs = (TextView) findViewById(R.id.bengkeldesc);
        TextView mOs = (TextView) findViewById(R.id.meetingdesc);
        TextView bOl = (TextView) findViewById(R.id.bengkellocdesc);
        TextView mOl = (TextView) findViewById(R.id.meetinglocdesc);
        TextView alloc = (TextView) findViewById(R.id.allocation);
        TextView source = (TextView) findViewById(R.id.rujukan);

        t.setText(title);
        d.setText(activityUmum);
        bOs.setText(bengkelOs);
        mOs.setText(meetingOs);
        bOl.setText(bengkelLocal);
        mOl.setText(meetingLocal);
        alloc.setText(activityFunding);
        source.setText(activitySource);
//

    }
}
