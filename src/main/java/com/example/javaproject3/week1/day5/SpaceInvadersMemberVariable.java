package com.example.javaproject3.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeftAndPrint(){
        location = location -1;
        System.out.printf("Move Left: %d\n", location);
    }
    public void moveRightAndPrint(){
        location = location + 1;
        System.out.printf("Move Right: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeftAndPrint();
        simv.moveRightAndPrint();
        simv.moveRightAndPrint();
        simv.moveRightAndPrint();
        simv.moveRightAndPrint();

        System.out.printf("최종 위치 : %d\n", simv.location);
        simv.moveRightAndPrint();
        System.out.printf("최종 위치 : %d\n", simv.location);
    }
}
