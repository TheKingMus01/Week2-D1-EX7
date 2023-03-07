package com.codurance.isp;

import com.codurance.isp.interfaces.Fl;
import com.codurance.isp.interfaces.Rn;

public class Bird implements Fl, Rn {

    public void run() {
        System.out.print("Bird is running");
    }
    public void fly() {
        System.out.print("Bird is flying");
    }
}