package com.example.javaproject3.week4.day15;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveRight();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
    }
}
