package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;import static java.lang.System.out;
public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passTry=input.nextInt();
        if (passTry==PASSWORD) {
            out.print("Hello, Agent");
        }
        else {
            out.print("Access denied");
        }
    }
}
