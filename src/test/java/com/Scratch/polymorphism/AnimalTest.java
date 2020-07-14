package com.Scratch.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void voiceTest(){

        Animal animal = new Animal();
        assert animal.shout().contains("Dont");
    }

    @Test
    public void voiceTest2(){

        Animal animal = new Dog();
        assert animal.shout().contains("Bow");
    }




}