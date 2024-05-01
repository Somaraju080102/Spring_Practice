package com.nani;

public class Code {


    private int Tc;

    private Studying Sleep;

     
    
    public Code(int Tc, Studying Sleep) {
        this.Tc = Tc;
        this.Sleep = Sleep;
    }



    public void exec(){
        System.out.println("Executing");
        Sleep.sleeper();
    }


}
