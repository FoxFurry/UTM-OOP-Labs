package com.oop.lab2;

import javax.lang.model.type.TypeVariable;

public class Main {
    public static void main(String[] args) {

        Box b1 = new Box(4.5, 3.2, 2.5);

        System.out.println("Surface of b1 is: " + b1.getSurf() + "\nVolume of b1 is: " + b1.getVolume());

        Queue   q1 = new Queue(),
                q2 = new Queue(4);

        for(int i = 0; i < 10; i++){
            q1.push(i);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(q1.pop());
        }
        System.out.print('\n');
        for(int i = 0; i < 6; i++){
            if(!q2.push(i))System.out.print("I am sorry mister Johnathan, but array is already full...\n");
        }
        for(int i = 0; i < 6; i++){
            Object pop_buffer = q2.pop();
            if(pop_buffer != null)System.out.println(pop_buffer);
            else System.out.print("Yo man! Your queue is empty!\n");
        }
    }
}
