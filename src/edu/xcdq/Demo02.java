package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/23 9:09
 */
public class Demo02 {
    public static void main(String[] args) {
        final int a = 1;
        final int [] b = {1,2,3};
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        int [] c = new int[3];
        //b = c;
    }
}
