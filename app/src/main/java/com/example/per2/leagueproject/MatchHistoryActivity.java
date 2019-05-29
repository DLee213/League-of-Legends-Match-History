package com.example.per2.leagueproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MatchHistoryActivity extends AppCompatActivity  {

    private ImageView icon;
    private TextView rank;
    private TextView level;
    private ListView listHistory;
    public List<History> listViewHistory;
    public String icon1;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_match_history_adapter);
    wireWidgets();
    populateListView();

/*    listViewHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            public*/

        }
    private void populateListView() {
        {
            listViewHistory = new ArrayList<>();
            matchHistoryAdapter adapter = new matchHistoryAdapter(
                    MatchHistoryActivity.this,
                    R.layout.activity_match_histry,
                    listViewHistory);
            listHistory.setAdapter(adapter);
            Picasso.get().load(icon1).into(icon);
        }
    }





    private void wireWidgets() {
    listHistory = findViewById(R.id.listView_history);
    icon = findViewById(R.id.imageView_champion);
    rank = findViewById(R.id.textView_rank);
    level = findViewById(R.id.textView_level);
    }

}
