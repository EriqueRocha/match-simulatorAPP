package com.example.matchsimulatorapp.data;

import com.example.matchsimulatorapp.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
// camada de acesso aos dados
public interface MatchesAPI {
    @GET("matches.json") //o nome do meu arquivo .jason no git
    Call<List<Match>> getMatches();
}
