package com.rizki3012.digitalmarketingtactics;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsTacticActivity extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMG = "extra_img";
    private TextView tv_item_title, tv_item_detail;
    private ImageView img_item_photo;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_tactic);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Tactic");

        int tacticImage = getIntent().getIntExtra(EXTRA_IMG,0);
        String tacticTitle = getIntent().getStringExtra(EXTRA_TITLE);
        String tacticDetail = getIntent().getStringExtra(EXTRA_DETAIL);

        tv_item_title = findViewById(R.id.item_title);
        tv_item_title.setText(tacticTitle);

        tv_item_detail = findViewById(R.id.item_detail);
        tv_item_detail.setText(tacticDetail);

        img_item_photo = findViewById(R.id.item_photo);
        img_item_photo.setImageResource(tacticImage);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
