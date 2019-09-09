package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int lower=1;
        int upper = 100;

        for (int i=lower; i<=upper;i++) {
          //  boolean number = true;
            int fizz;
            int buzz;
            int test;
            fizz = i % 2;
            buzz = i % 3;
            test = i % 5;

            switch (fizz)
            {
                case 0:
                    System.out.print("Fizz");
                    switch (buzz){
                        case 0:
                            System.out.print("Buzz");
                            switch (test){
                                case 0:
                                    System.out.print("Test");
                            }
                    }
                    System.out.println();

            }
            switch (buzz){
                case 0:
                    System.out.println("Buzz");

            }
            switch (test){
                case 0:
                    System.out.println("Test");

                default: System.out.print(i);

            }

        }

    }
}
