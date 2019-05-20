package com.example.per2.leagueproject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RecipePuppyService {
    @GET("{region}.api.riotgames.com/lol/summoner/v4/summoners/by-name/{name}?api_key=RGAPI-9d270209-e896-4595-8128-213fa9cf5ff2")
    Call<Summoner> searchByName(@Path("region") String region, @Path("name") String name);
}
