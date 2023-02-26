package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionCheckSex() {
        try {
            Lion lion = new Lion("Гермафродит", feline);
            lion.doesHaveMane();
            fail("Исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void lionGetKitensInt() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.when(feline.getKittens(20)).thenReturn(20);
        assertEquals(feline.getKittens(20), 20);
    }

    @Test
    public void lionGetFoodPredator() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
