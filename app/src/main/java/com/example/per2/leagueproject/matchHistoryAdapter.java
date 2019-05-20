package com.example.per2.leagueproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class matchHistoryAdapter extends ArrayAdapter<History> {

    private Context context;
    private int resource;
    private List<History> listViewHistory;

    public matchHistoryAdapter(@NonNull Context context, int resource, @NonNull List<History> listViewHistory) {
        super(context, resource, listViewHistory);
        this.context = context;
        this.resource = resource;
        this.listViewHistory = listViewHistory;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_match_histry,parent,false);
        }
        TextView textViewOutcome = convertView.findViewById(R.id.textView_outcome);
        TextView textViewKDA = convertView.findViewById(R.id.textView_kda);
        TextView textViewTime = convertView.findViewById(R.id.textView_time);
        ImageView imageViewMainChamp = convertView.findViewById(R.id.imageView_mainchamp);
        ImageView imageViewSpell1 = convertView.findViewById(R.id.imageView_spell1);
        ImageView imageViewSpell2 = convertView.findViewById(R.id.imageView_spell2);
        ImageView imageViewItem1 = convertView.findViewById(R.id.imageView_item1);
        ImageView imageViewItem2 = convertView.findViewById(R.id.imageView_item2);
        ImageView imageViewItem3 = convertView.findViewById(R.id.imageView_item3);
        ImageView imageViewItem4 = convertView.findViewById(R.id.imageView_item4);
        ImageView imageViewItem5 = convertView.findViewById(R.id.imageView_item5);
        ImageView imageViewItem6 = convertView.findViewById(R.id.imageView_item6);
        ImageView imageViewtrinket = convertView.findViewById(R.id.imageView_trinket);
        ImageView imageViewteam1 = convertView.findViewById(R.id.imageView_team1);
        ImageView imageViewteam2 = convertView.findViewById(R.id.imageView_team2);
        ImageView imageViewteam3 = convertView.findViewById(R.id.imageView_team3);
        ImageView imageViewteam4 = convertView.findViewById(R.id.imageView_team4);
        ImageView imageViewteam5 = convertView.findViewById(R.id.imageView_team5);
        ImageView imageViewenemy1 = convertView.findViewById(R.id.imageView_enemy1);
        ImageView imageViewenemy2 = convertView.findViewById(R.id.imageView_enemy2);
        ImageView imageViewenemy3 = convertView.findViewById(R.id.imageView_enemy3);
        ImageView imageViewenemy4 = convertView.findViewById(R.id.imageView_enemy4);
        ImageView imageViewenemy5 = convertView.findViewById(R.id.imageView_enemy5);

        History currentHistory = listViewHistory.get(position);
        textViewOutcome.setText(currentHistory.getOutcome());
        textViewKDA.setText(currentHistory.getKda());
        textViewTime.setText(currentHistory.getTime());
        imageViewMainChamp.setImageResource(currentHistory.getMainchamp());
         return convertView;
        }
    }
