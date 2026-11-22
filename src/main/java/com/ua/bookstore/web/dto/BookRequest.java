package com.ua.bookstore.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record BookRequest(
        @NotBlank(message = "назва обов'язкова") String title,
        @NotBlank(message = "автор обов'язковий") String author,
        @Positive(message = "ціна має бути додатною") BigDecimal price,
        Integer year,
        String genre,
        String coverUrl,
        String description
) {}
