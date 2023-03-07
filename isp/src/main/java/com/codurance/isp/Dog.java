package com.codurance.isp;

import com.codurance.isp.interfaces.Bar;

public class Dog implements Bar {


    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}
