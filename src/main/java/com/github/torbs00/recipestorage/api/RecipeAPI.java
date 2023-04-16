package com.github.torbs00.recipestorage.api;

import com.github.torbs00.recipestorage.repository.entity.RecipeData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface RecipeAPI {

    ResponseEntity<Map<String, Integer>> addRecipe(@RequestBody RecipeData recipe);

    ResponseEntity<RecipeData> getRecipe(@PathVariable int id);

}
