package com.github.torbs00.recipestorage.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties("id")
public class RecipeData {

    private static int counter = 1;

    @JsonIgnore
    private int id = counter++;

    private String name;
    private String[] description;
    private String[] ingredients;
    private String[] steps;

}
