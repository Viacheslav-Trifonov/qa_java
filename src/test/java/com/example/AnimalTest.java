package com.example;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertThrows;


public class AnimalTest {
    
    final String typeFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void animalGetFamily() {
        Animal animal = new Animal();
        assertEquals(animal.getFamily(), typeFamily);
    }

    @Test
    public void animalGetFood(){
        Animal animal = new Animal();
        assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
    }
}

