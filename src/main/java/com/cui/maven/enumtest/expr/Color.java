package com.cui.maven.enumtest.expr;

public enum Color {

    RED(255,0,0,"红色"){
        @Override
        public String toString() {
            return "RED("+RED.red+","+RED.greed+","+RED.blue+")"+RED.description;
        }
    },
    Orange(255,128,0,"橙色");

    private final int red;
    private final int greed;
    private final int blue;
    private final String description;
    private Color(int red,int greed,int blue,String description){
        this.red = red;
        this.greed = greed;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "("+this.red+","+this.greed+","+this.blue+")"+this.description;
    }
}
