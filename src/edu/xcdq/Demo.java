package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/23 8:12
 */
public class Demo {
    public static void main(String[] args) {
        UncleOne uncleOne = new UncleOne();
        uncleOne.faHongBao();// 复写后的方法
        uncleOne.hejiu();

        UncleTwo uncleTwo = new UncleTwo();
        uncleTwo.faHongBao();// 继承的方法
        uncleTwo.chouyan();

        uncleTwoSon uncleTwoSon = new uncleTwoSon();
        uncleTwoSon.chouyan();
    }
}
