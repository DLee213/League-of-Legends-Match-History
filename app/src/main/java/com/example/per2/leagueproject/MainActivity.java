package com.example.per2.leagueproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private Button search;
    private Spinner region;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchSummoner();
            }
        });
    }

    private void searchSummoner() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RecipePuppyService service = retrofit.create(RecipePuppyService.class);
        Call<Summoner> lyricResponseCall = service.searchByName(region.getSelectedItem().toString(),name.getText().toString());

        lyricResponseCall.enqueue(new Callback<Summoner>() {
            @Override
            public void onResponse(Call<Summoner> call, Response<Summoner> response) {

                if (response.body() != null && !response.body().getId().isEmpty()) {
//                    String lyrics = response.body().getLyrics().toString();
//                    Intent Lyrics = new Intent(MainActivity.this,
//                            displayLyrics.class);
//
//                    Lyrics.putExtra(LYRICS, lyrics);
//                    startActivity(Lyrics);
                    Toast.makeText(MainActivity.this, "work", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "That name doesn't exist", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Summoner> call, Throwable t) {
                Log.d("ENQUEUE", "onFailure: " + t.getMessage());
            }
        });
    }

    private void wireWidgets() {
        region = findViewById(R.id.spinner_MainActivity_region);
        name = findViewById(R.id.editText_MainActivity_Summoner);
        search = findViewById(R.id.button_MainActivity_Search);
    }
}
