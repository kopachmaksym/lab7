package com.test;

import com.food.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WholeFoodTest {

    private List<Food> foods = new ArrayList<>();

    @Test
    void vegList() {
        foods.add(new Vegetable("Tomato",17.7));
        assertEquals("\n" +
                "\t1.\n" +
                "\t\tVegetable: Tomato\n" +
                "\t\tCalorie: 17,7 kcal/100g\n" +
                "\t\tType: Vegetable\n" +
                "\n" +
                "\n", WholeFood.VegList(foods));

    }

    @Test
    void addFood() {
        foods.add(new Vegetable("Tomato",17.7));
        foods.add(new Vegetable("Onion",32.8));

        assertEquals("\n" +
                "\t1.\n" +
                "\t\tVegetable: Tomato\n" +
                "\t\tCalorie: 17,7 kcal/100g\n" +
                "\t\tType: Vegetable\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t2.\n" +
                "\t\tVegetable: Onion\n" +
                "\t\tCalorie: 32,8 kcal/100g\n" +
                "\t\tType: Vegetable\n" +
                "\n" +
                "\n", WholeFood.VegList(foods));
    }
}