package com.github.torbs00.recipestorage.controller;

import com.github.torbs00.recipestorage.api.RecipeAPI;
import com.github.torbs00.recipestorage.repository.entity.RecipeData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RecipeController implements RecipeAPI {

    private RecipeData recipe;

    @Override
    @PostMapping(value = "/recipe", consumes = "application/json")
    public void addRecipe(@RequestBody RecipeData recipe) {
        this.recipe = recipe;
    }

    @Override
    @GetMapping("/recipe")
    public RecipeData getRecipe() {
        return recipe;
    }

}
