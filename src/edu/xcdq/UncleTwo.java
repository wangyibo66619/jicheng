package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/23 8:12
 */
public class UncleTwo extends Uncle{
    public UncleTwo() {
        super();//隐藏代码super() 调用父类的构造方法
        System.out.println("二舅的构造方法");
    }
    // 独有的方法
    public void chouyan() {
        System.out.println("二舅喜欢抽烟");
    }
}
