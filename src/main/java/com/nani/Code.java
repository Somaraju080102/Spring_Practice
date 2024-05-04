package com.nani;

import org.springframework.stereotype.Component;

@Component
public class Code {

    private int Tc;

    private Thinking Sleep;

    public int getTc() {
        return Tc;
    }

    public void setTc(int Tc) {
        this.Tc = Tc;
    }

    public Thinking getSleep() {
        return Sleep;
    }

    public void setSleep(Thinking Sleep) {
        this.Sleep = Sleep;
    }

    public void exec() {
        System.out.println("Executing Code Class");

    }

}
