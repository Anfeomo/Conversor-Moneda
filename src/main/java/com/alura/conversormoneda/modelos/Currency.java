package com.alura.conversormoneda.modelos;

import com.alura.conversormoneda.modelos.dto.CurrencyDTO;

public class Currency {
    private String symbol;
    private String name;
    private String symbol_native;
    private int decimal_digits;
    private int rounding;
    private String code;
    private String name_plural;
    private String type;

    public Currency() {
    }

    public Currency(String symbol, String name, String symbol_native, int decimal_digits, int rounding, String code, String name_plural, String type) {
        this.symbol = symbol;
        this.name = name;
        this.symbol_native = symbol_native;
        this.decimal_digits = decimal_digits;
        this.rounding = rounding;
        this.code = code;
        this.name_plural = name_plural;
        this.type = type;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol_native() {
        return symbol_native;
    }

    public int getDecimal_digits() {
        return decimal_digits;
    }

    public int getRounding() {
        return rounding;
    }

    public String getCode() {
        return code;
    }

    public String getName_plural() {
        return name_plural;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", symbol_native='" + symbol_native + '\'' +
                ", decimal_digits=" + decimal_digits +
                ", rounding=" + rounding +
                ", code='" + code + '\'' +
                ", name_plural='" + name_plural + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
