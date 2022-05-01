package com.ocheejeh.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {
    @Test
    void shouldAddItemToArray() {
        MyArray<Integer> integerMyArray = new MyArray<>(10);
        integerMyArray.add(30);
        assertEquals(1, integerMyArray.size());
        integerMyArray.add(10);
        assertEquals(2, integerMyArray.size());
        integerMyArray.add(13);
        assertEquals(3, integerMyArray.size());
    }

    @Test
    void shouldReturnCorrectItemIndex(){
        MyArray<String> cloths = new MyArray<>();
        cloths.add("TShirt");
        cloths.add("Hood");
        cloths.add("Coverall");
        assertEquals(0, cloths.indexOf("TShirt"));
    }

    @Test
    void shouldReturnItemGivenAnIndex(){
        MyArray<String> cloths = new MyArray<>();
        cloths.add("TShirt");
        cloths.add("Hood");
        cloths.add("Coverall");

        assertEquals("TShirt", cloths.get(0));
    }

    @Test
    void shouldCheckIfArrayContainsGivenItem(){
        MyArray<Integer> array = new MyArray<>();
        array.add(50);
        array.add(15);

        assertTrue(array.contains(15));
    }

    @Test
    void shouldRemoveItemGivenItsIndex(){
        MyArray<Integer> array = new MyArray<>();
        array.add(50);
        array.add(15);
        Integer actual =  array.remove(0);
        assertEquals(50, actual);
        assertEquals( 1, array.size());
        assertEquals(15, array.get(0));
        array.remove(0); //remove the only element left
        assertEquals(0, array.size());
    }
}