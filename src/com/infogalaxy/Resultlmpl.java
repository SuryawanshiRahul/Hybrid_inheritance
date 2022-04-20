package com.infogalaxy;

public class Resultlmpl extends Student implements ISports{
    int perc;
    void setPerc(){
        System.out.println("Enter the percentage :");
        perc = sc.nextInt();
    }
    public void calculate(){
        if (perc < 35 && perc >=30){
            perc =perc + sperc;
        }
    }
    void showResult(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("p :"+perc);
    }
}
