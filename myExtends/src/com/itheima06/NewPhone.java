package com.itheima06;

public class NewPhone extends Phone {
    @Override//检查方法重写
    public void call(String name) {
        System.out.println("开启视频");
        super.call(name);
    }

}
