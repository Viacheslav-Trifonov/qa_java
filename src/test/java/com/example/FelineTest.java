package com.example;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class FelineTest {

    @Test
    public void felineGetEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyFeline() {
        Feline feline  = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void felineGetKittensInt() {
        Feline feline  = new Feline();
        assertEquals(feline.getKittens(2), 2);
    }

    @Test
    public void felineGetKittens() {
        Feline feline  = new Feline();
        assertEquals(feline.getKittens(), 1);
    }
}
