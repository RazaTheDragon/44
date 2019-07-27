package com.example.faizan;

import java.util.Scanner;

public class Main {

            public static void main(String args[]){
                Scanner binary = new Scanner(System.in);
                String binaryString = binary.nextLine();
               // String [] name = new String[] [5];
                //name [5] = binaryString;
                if (binaryString.length()<=8){
                    int decimal=Integer.parseInt(binaryString,2);
                    System.out.println(decimal);
               }else {System.out.println("Sorry the entered has more then 8 digits.");

                }
            }
        }
//}
