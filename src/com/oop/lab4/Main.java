package com.oop.lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/static/lab4_1.txt";
        File read_file = new File(path);
        Scanner scan_file = new Scanner(read_file);

        while(scan_file.hasNextLine()){
            Checker check_line = new Checker(scan_file.nextLine());
            if(!check_line.checkExpr()){
                System.out.println("Incorrect expression");
            }
            else{

                Evaluate eval_line = new Evaluate(check_line.getExpression());
                System.out.println(eval_line.eval());
            }
        }
    }
}
