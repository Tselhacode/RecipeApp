package com.example.recipeapp;

import android.os.Handler;
import android.os.Looper;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NetworkingService {
    //checked JSON
    String recipeURL = "https://api.spoonacular.com/recipes/complexSearch?";
    String apiKey = "apiKey=c896c1207ccf465da33cd952861700f9";
    String gluten = "glutenFree=true";
    String recipeInfo ="&addRecipeInformation=true";

    //create a model class with the specified parameters

    //create a connection

    //ExecutorService interface created
    public static final ExecutorService networkingExecutor = Executors.newFixedThreadPool(4);
    //handler is needed to return the result from connection (which returns void) to the Main thread
    static Handler networkHandler = new Handler(Looper.getMainLooper());

    private void connection(String url){
        //it is uncertain how long this connection can take therefore need delegation to another an independent thread, apply Executor
        networkingExecutor.execute(new Runnable(){
        String jsonString = "";
        @Override
            public void run(){
            HttpURLConnection httpURLConnection = null;
            try {
                URL urlObject = new URL(url);
                httpURLConnection = (httpURLConnection).urlObject.openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("Content-Type","application/JSON");
                int status = httpURLConnection.getResponseCode();

                if ((status >= 200) && (status <= 299)){
                    InputStream in = httpURLConnection.getInputStream();
                    InputStreamReader

                }
            }
        }
    }



}
