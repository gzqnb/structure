package com.gzq.linkedlist;

/**
 * @Auther: gzq
 * @Date: 2021/2/1 - 02 - 01 - 10:55
 * @Description: com.gzq.linkedlist
 */
public class Hero {
    public int heroNo;
    public String heroName;
    public Hero next;

    public Hero(int heroNo, String heroName) {
        this.heroNo = heroNo;
        this.heroName = heroName;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "heroNo=" + heroNo +
                ", heroName='" + heroName + '\'' +
                '}';
    }
}
