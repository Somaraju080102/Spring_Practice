package com.nani;

public class Code {


    private int Tc;

    private Sleeping Sleep;


    public Sleeping getSleep() {
        return Sleep;
    }
    public void setSleep(Sleeping Sleep) {
        this.Sleep = Sleep;
    }
    public Code()
    {
        System.out.println("Object is created");
    }
    public int  getVal(){
        return Tc;
    }
    public void  setTc(int Tc){
        System.out.println("Setter called");
        this.Tc=Tc;
    }
    public void exec(){
        System.out.println("Executing");
        Sleep.sleeper();
    }


}
