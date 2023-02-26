package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParametrizedTest {

    String animalKind;
    List<String> result;

    public AnimalParametrizedTest(String animalKind, List<String> result) {
        this.animalKind = animalKind;
        this.result = result;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void animalGetFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(animal.getFood(animalKind), result);
    }
}
