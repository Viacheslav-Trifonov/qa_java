package com.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


public class AnimalTest {

    @Test
    public void animalGetFamily() {
        Animal animal = new Animal();
        assertEquals(animal.getFamily(), "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }

    @Test
    public void animalGetFood() {
        try {
            Animal animal = new Animal();
            animal.getFood("Всеядное");
            fail("Исключение");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}
