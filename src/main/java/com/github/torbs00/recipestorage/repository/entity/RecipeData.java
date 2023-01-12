package com.github.torbs00.recipestorage.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecipeData {
    String name;
    String description;
    String ingredients;
    String directions;
}
