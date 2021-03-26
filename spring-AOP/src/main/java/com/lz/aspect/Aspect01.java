package com.lz.aspect;

/**
 * 这是一个切面对象
 *
 * @author LY
 */
public class Aspect01 {
    public void before(){
        System.out.println("我想让他在目标之前执行");
    }
    public void after(){
        //int a=1/0;
        System.out.println("我想让它在目标之后执行");
    }
    public void exception(){
        System.out.println("出异常了就执行这个");
    }
}
