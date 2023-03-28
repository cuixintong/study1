package com.cui.maven.enumtest.apply;

public class SeasonTest2 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.toString());
        System.out.println(Season1.SPRING.name());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}

interface info{
    void info();
}
enum Season1 implements info {

    SPRING("春天","春暖花开"){
        @Override
        public void info() {
            System.out.println("春天的信息");
        }
    },
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");
    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


    @Override
    public void info() {

    }
}
