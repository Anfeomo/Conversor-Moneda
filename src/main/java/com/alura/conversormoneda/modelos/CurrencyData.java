package com.alura.conversormoneda.modelos;

import com.alura.conversormoneda.modelos.dto.CurrencyDTO;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CurrencyData {
    @SerializedName("data")
    private Map<String, CurrencyDTO> data;

    public Map<String, CurrencyDTO> getData() {
        return data;
    }

    public void setData(Map<String, CurrencyDTO> data) {
        this.data = data;
    }
}
