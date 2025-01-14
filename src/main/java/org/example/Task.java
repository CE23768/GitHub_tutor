package org.example;

//ToDo: Write a method that will return the factorial of the input number

public class Task {
    public int factorial(int input) {
        //write your solution here
        if (input==0){
            fac=1;
        }//if
        if (input<0) fac =1;
        if (input >=1){
            int fac = 1;
            for(int 1=1; i<=input; i++){
            fac=fac*i;
            }//for
        }//if
        return fac;
    }//factorial
}
