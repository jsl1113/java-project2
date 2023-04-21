package com.example.javaproject3.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeft(){
        location = location -1;
        System.out.printf("Move Left: %d\n", location);
    }
    public void moveRight(){
        location = location + 1;
        System.out.printf("Move Right: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }
}
