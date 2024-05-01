package com.nani;

public class Code {


    private int Tc;

    private Sleeping Sleep;

     
    
    public Code(int Tc, Sleeping Sleep) {
        this.Tc = Tc;
        this.Sleep = Sleep;
    }



    public void exec(){
        System.out.println("Executing");
        Sleep.sleeper();
    }


}
