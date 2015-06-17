package my.utm.rmc.p2eer.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import my.utm.rmc.p2eer.R;

/**
 * Created by rahmatnaim on 6/10/15.
 */
public class Description extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_detail);

//        String pos = getIntent().getExtras().getString("title");
//        System.out.println("%%%%%%%%%%%%%%%% "+pos);
        System.out.println("################"+getIntent().getExtras().getString("title"));
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
}
