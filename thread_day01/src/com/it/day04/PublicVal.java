package com.it.day04;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName PublicVal
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:19
 * @Version 1.0
 */
public class PublicVal {
    public String username = "a";

    public String password = "aa";

    public synchronized void setValue(String username, String password) throws InterruptedException {
        this.username = username;
        Thread.sleep(3000);
        this.password = password;
        System.out.println("setValue method : username =" + username + " password = " + password);
    }

    public void getValue() {
        System.out.println("getValue method : username = " + username + " password = " + password);
    }
}
