package com.github.torbs00.recipestorage.api;

import com.github.torbs00.recipestorage.repository.entity.RecipeData;
import org.springframework.web.bind.annotation.RequestBody;

public interface RecipeAPI {

    void addRecipe(@RequestBody RecipeData recipe);

    RecipeData getRecipe();

}
