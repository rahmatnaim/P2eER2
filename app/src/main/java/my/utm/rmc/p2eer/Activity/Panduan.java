package my.utm.rmc.p2eer.Activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/10/15.
 */
public class Panduan extends MylistActivity {

    private static final int INITIAL_DELAY_MILLIS = 500;
    private boolean mLimited;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.desc_proposal);
        String title = getIntent().getExtras().getString("title");
        String definition = getIntent().getExtras().getString("definition").replaceAll("\\\\n", "\n");
        String requirement = getIntent().getExtras().getString("requirement").replaceAll("\\\\n", "\n");
        String period = getIntent().getExtras().getString("period").replaceAll("\\\\n", "\n");
        String allocation = getIntent().getExtras().getString("allocation").replaceAll("\\\\n","\n");
        String kpi = getIntent().getExtras().getString("kpi").replaceAll("\\\\n","\n");
        String howto = getIntent().getExtras().getString("howto").replaceAll("\\\\n","\n");
        String evaluation = getIntent().getExtras().getString("evaluation").replaceAll("\\\\n","\n");
        TextView t = (TextView) findViewById(R.id.grant_title);
        TextView d = (TextView) findViewById(R.id.definition);
        TextView r = (TextView) findViewById(R.id.requirement);
        TextView p = (TextView) findViewById(R.id.duration);
        TextView a = (TextView) findViewById(R.id.allocation);
        TextView k = (TextView) findViewById(R.id.kpi);
        TextView h = (TextView) findViewById(R.id.howto);
        TextView e = (TextView) findViewById(R.id.evaluation);
        t.setText(title);
        d.setText(definition);
        r.setText(requirement);
        p.setText(period);
        a.setText(allocation);
        k.setText(kpi);
        h.setText(howto);
        e.setText(evaluation);

    }
}
