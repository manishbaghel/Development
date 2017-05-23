package com.design.pattern.creational.builder;

import com.design.pattern.creational.builder.NutritionFacts.Builder;

/**
 * Created by manish on 5/14/17.
 */
public class EffectiveJavaExmp {

    NutritionFacts cola = new NutritionFacts.Builder(4,6).calories(3).build();

//    NutritionFacts nutritionFacts =
}

// Builder Pattern
class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
// Optional parameters - initialized to default values

        private int calories = 0;
        private int fat = 0;
        private int carbohydrate =0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings
                    = servings;
        }
        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val)
        { carbohydrate = val;
        return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings
                = builder.servings;
        calories
                = builder.calories;
        fat
                = builder.fat;
        sodium
                = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}