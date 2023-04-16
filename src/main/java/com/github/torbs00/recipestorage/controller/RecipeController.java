package com.github.torbs00.recipestorage.controller;

import com.github.torbs00.recipestorage.api.RecipeAPI;
import com.github.torbs00.recipestorage.repository.entity.RecipeData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RecipeController implements RecipeAPI {

    private Map<Integer, RecipeData> recipes = new HashMap<>();

    @Override
    @PostMapping(value = "/recipe/new", consumes = "application/json")
    public ResponseEntity<Map<String, Integer>> addRecipe(@RequestBody RecipeData recipe) {
        recipes.put(recipe.getId(), recipe);
        return ResponseEntity.ok(Map.of("id", recipe.getId()));
    }

    @Override
    @GetMapping("/recipe/{id}")
    public ResponseEntity<RecipeData> getRecipe(@PathVariable int id) {
        RecipeData recipe = recipes.get(id);
        if(recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(recipe);
    }

}
