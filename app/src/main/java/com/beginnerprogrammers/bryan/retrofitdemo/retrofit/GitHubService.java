package com.beginnerprogrammers.bryan.retrofitdemo.retrofit;

import com.beginnerprogrammers.bryan.retrofitdemo.data.Repo;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by bryan on 12/21/15.
 */
public interface GitHubService {

    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
