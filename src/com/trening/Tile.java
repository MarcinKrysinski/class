package com.trening;

class Tile {
    private String letter;
    private int value;
    private Tile that;

    Tile(String letter, int value){
        this.letter = letter;
        this.value = value;
    }

    private static void printTile(Tile tile) {
        System.out.println("Letter: " + tile.letter);
        System.out.println("Value: " + tile.value);
    }

    static void testTile(){
        Tile tile = new Tile("Z", 10);
        printTile(tile);
    }

    boolean equals(Tile that){
        return this.value == that.value && this.letter.equals(that.letter);
    }

    void setLetter(String letter){
        this.letter = letter;
    }

    String getLetter(){
        return this.letter;
    }

    void setValue(int value){
        this.value = value;
    }

    int getValue(){
        return this.value;
    }
}
