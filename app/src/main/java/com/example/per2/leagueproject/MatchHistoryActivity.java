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
import java.util.List;
public class MatchHistoryActivity extends AppCompatActivity  {

    private ImageView icon;
    private TextView rank;
    private TextView level;
    private ListView listHistory;
    private List<History> listViewHistory;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_match_histry);
    wireWidgets();
    populateListView();

/*    listViewHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            public*/
        }
    private void populateListView() {
        {

            matchHistoryAdapter adapter = new matchHistoryAdapter(
                    MatchHistoryActivity.this,
                    R.layout.activity_match_history_adapter,
                    listViewHistory);
            listHistory.setAdapter(adapter);

        }
    }





    private void wireWidgets() {
    listHistory = findViewById(R.id.listView_history);
    icon = findViewById(R.id.imageView_champion);
    rank = findViewById(R.id.textView_rank);
    level = findViewById(R.id.textView_level);
    }

}
