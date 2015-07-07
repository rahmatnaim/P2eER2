package my.utm.rmc.p2eer.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/10/15.
 */
public class Description extends MylistActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);
//        String title = getIntent().getExtras().getString("title");
//        if (title.equals("MYLAB")){
//            FrameLayout fm = (FrameLayout)findViewById(R.id.frameactivity);
//            fm.setVisibility(View.GONE);
//        }

//        String pos = getIntent().getExtras().getString("title");
//        System.out.println("%%%%%%%%%%%%%%%% "+pos);
//        System.out.println("################"+getIntent().getExtras().getString("title"));
////        TextView textView = (TextView) findViewById(R.id.label);
////        textView.setText(pos);

    }

    public void onPanduanClicked(final View view) {
        Intent intent = new Intent(this, Panduan.class);
        intent.putExtra("pid", getIntent().getExtras().getInt("pid"));
        intent.putExtra("title", getIntent().getExtras().getString("title"));
        intent.putExtra("definition", getIntent().getExtras().getString("definition"));
        intent.putExtra("requirement", getIntent().getExtras().getString("requirement"));
        intent.putExtra("period", getIntent().getExtras().getString("period"));
        intent.putExtra("allocation", getIntent().getExtras().getString("allocation"));
        intent.putExtra("kpi", getIntent().getExtras().getString("kpi"));
        intent.putExtra("howto", getIntent().getExtras().getString("howto"));
        intent.putExtra("evaluation", getIntent().getExtras().getString("evaluation"));
        intent.putExtra("category", getIntent().getExtras().getString("category"));
        intent.putExtra("thumbnail", getIntent().getExtras().getString("thumbnail"));

        startActivity(intent);
    }

    public void onAktivityClicked(View view) {
        Intent intent = new Intent(this, PanduanAktiviti.class);
        intent.putExtra("pid", getIntent().getExtras().getInt("pid"));
        intent.putExtra("title", getIntent().getExtras().getString("title"));
        intent.putExtra("activityUmum", getIntent().getExtras().getString("activityUmum"));
        intent.putExtra("bengkelOs", getIntent().getExtras().getString("bengkelOs"));
        intent.putExtra("meetingOs", getIntent().getExtras().getString("meetingOs"));
        intent.putExtra("bengkelLocal", getIntent().getExtras().getString("bengkelLocal"));
        intent.putExtra("meetingLocal", getIntent().getExtras().getString("meetingLocal"));
        intent.putExtra("activityFunding", getIntent().getExtras().getString("activityFunding"));
        intent.putExtra("activitySource", getIntent().getExtras().getString("activitySource"));

        startActivity(intent);
    }

    public void onPemantauanClicked(View view) {
        Intent intent = new Intent(this, PanduanPemantauan.class);
        intent.putExtra("title", getIntent().getExtras().getString("title"));
        intent.putExtra("category", getIntent().getExtras().getString("category"));

        startActivity(intent);
    }

    public void onPerlantikanClicked(View view) {
        Intent intent = new Intent(this, PanduanPerlantikan.class);
        intent.putExtra("title", getIntent().getExtras().getString("title"));
        intent.putExtra("category", getIntent().getExtras().getString("category"));
        intent.putExtra("permantauan_umum", getIntent().getExtras().getString("permantauan_umum"));
        intent.putExtra("lantikan", getIntent().getExtras().getString("lantikan"));
        intent.putExtra("kadar", getIntent().getExtras().getString("kadar"));
        intent.putExtra("sumber", getIntent().getExtras().getString("sumber"));
        intent.putExtra("rujukan", getIntent().getExtras().getString("rujukan"));

        startActivity(intent);
    }
}