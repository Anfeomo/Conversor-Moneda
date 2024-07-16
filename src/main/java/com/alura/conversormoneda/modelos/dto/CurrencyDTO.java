package com.alura.conversormoneda.modelos.dto;

public record CurrencyDTO(String symbol,
                          String name,
                          String symbol_native,
                          int decimal_digits,
                          int rounding,
                          String code,
                          String name_plural,
                          String type) {
}
