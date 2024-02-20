package com.whl.aspectj.demo;

import com.whl.aspectj.demo.model.Account;

public class App {

    public static void testCompileTime() {
        Account account = new Account();
        System.out.println("==================");
        account.pay(10);
        account.pay(50);
        System.out.println("==================");
    }

    public static void main(String[] args) {
        testCompileTime();
    }

}
