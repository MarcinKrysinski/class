package com.trening;

public class Main {

    public static void main(String[] args) {
        Tile.testTile();
        Tile tile = new Tile("X",10);
        Tile tile2 = new Tile("Z",10);
        System.out.println(tile.equals(tile2));
        tile.setLetter("y");
        String letter = tile.getLetter();
        System.out.println(letter);
        Date dateConst = new Date();
        Date date = new Date(1996,8,3);
        System.out.println(dateConst);
        System.out.println(date);


    }
}
