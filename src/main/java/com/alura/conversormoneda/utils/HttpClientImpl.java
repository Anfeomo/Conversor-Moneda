package com.alura.conversormoneda.utils;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static java.net.http.HttpClient.newHttpClient;

public class HttpClientImpl {
    private static HttpClientImpl instance;
    private HttpClient httpClient;

    public HttpClientImpl() {
        this.httpClient = newHttpClient();
    }

    public static synchronized  HttpClientImpl getInstance(){
        if(instance == null){
            instance =  new HttpClientImpl();
        }
        return instance;
    }
    public HttpRequest getHttpRequest(String url) {
        return HttpRequest.newBuilder().uri(URI.create(url)).build();
    }

    public String sendHttpRequest(HttpRequest httpRequest) throws IOException, InterruptedException {
        return this.httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
    }
}
