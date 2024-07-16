package com.alura.conversormoneda;


import com.alura.conversormoneda.modelos.Currency;
import com.alura.conversormoneda.modelos.CurrencyData;
import com.alura.conversormoneda.modelos.dto.CurrencyDTO;
import com.alura.conversormoneda.utils.HttpClientImpl;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        String token = "fca_live_IfejUV5VkGNR1mFcgIDSu37f020JE3aGoVmgg2jn";
        String url = "https://api.freecurrencyapi.com/v1/currencies?apikey=" + token;


        try {
            HttpClientImpl client = HttpClientImpl.getInstance();
            String response = client.sendHttpRequest(client.getHttpRequest(url));

           // System.out.println("response = " + response);
            Type currencyDataType  =  new TypeToken<CurrencyData>(){}.getType();
            CurrencyData currencyData = gson.fromJson(response, currencyDataType);
            List<CurrencyDTO> listcurrency = new ArrayList<>(currencyData.getData().values());

            listcurrency.forEach(System.out::println);


           // System.out.println("currencyDTO = " + currencyDTO);


        } catch (IOException | InterruptedException e) {

        }

    }
}