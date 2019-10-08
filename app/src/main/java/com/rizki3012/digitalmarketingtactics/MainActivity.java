package com.rizki3012.digitalmarketingtactics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.rizki3012.digitalmarketingtactics.adapter.ListTacticAdapter;
import com.rizki3012.digitalmarketingtactics.model.Tactic;
import com.rizki3012.digitalmarketingtactics.model.TacticData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    boolean btnBackToExit = false;
    private RecyclerView rvTactic;
    private ArrayList<Tactic> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("12 Digital Marketing Tactics");

        rvTactic =findViewById(R.id.rv_tactics);
        rvTactic.setHasFixedSize(true);

        list.addAll(TacticData.getListData());
        showRecyclerList();

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.info:
                Intent info = new Intent(MainActivity.this, AboutParticipantActivity.class);
                startActivity(info);
                break;
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    private void showRecyclerList() {
        rvTactic.setLayoutManager(new LinearLayoutManager(this));
        ListTacticAdapter listTacticAdapter = new ListTacticAdapter(list);
        rvTactic.setAdapter(listTacticAdapter);
        listTacticAdapter.setOnItemClickCallBack(new ListTacticAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Tactic data) {
                showSelectedTactic(data);
            }
        });
    }

    private void showSelectedTactic(Tactic tactic){
        Intent intentDetail = new Intent(MainActivity.this,DetailsTacticActivity.class);
        intentDetail.putExtra(DetailsTacticActivity.EXTRA_TITLE,tactic.getTitle());
        intentDetail.putExtra(DetailsTacticActivity.EXTRA_DETAIL,tactic.getDetail());
        intentDetail.putExtra(DetailsTacticActivity.EXTRA_IMG,tactic.getPhoto());
        startActivity(intentDetail);
    }

    @Override
    public void onBackPressed() {
        if (btnBackToExit) {
            super.onBackPressed();
            return;
        }

        this.btnBackToExit = true;
        Toast.makeText(this, "Press again to exit the app", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                btnBackToExit = false;
            }
        }, 2000);
    }
}
