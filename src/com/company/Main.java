package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int lower=1;
        int upper = 100;

        for (int i=lower; i<=upper;i++) {
            int fizz;
            int buzz;
            int test;
            fizz = i % 2;
            buzz = i % 3;
            test = i % 5;
// boolean number- needed to print or not the number itself
            boolean number = true;
            if (fizz==0 && buzz==0 && test==0) {

                System.out.println("FizzBuzzTest");
                number=false;
                continue;
// continue!!! helps to get out of the loop when the word is printed and we don't want to repeat it
            }
            if (fizz==0 && buzz==0) {

                System.out.println("FizzBuzz");
                number=false;
                continue;

            }

            if (fizz==0 && test==0) {

                System.out.println("FizzTest");
                number=false;
                continue;
            }
            if (buzz==0 && test==0) {

                System.out.println("BuzzTest");
                number=false;
               continue;
            }
// the switch can be replaced by if- it doesn't play any special role.

            switch (fizz)
            {
                case 0:
                    System.out.println("Fizz");
                    number=false;

            }
            switch (buzz){
                case 0:
                    System.out.println("Buzz");
                    number=false;

            }
            switch (test){
                case 0:
                    System.out.println("Test");
                    number=false;
                    //System.out.println();

                }

            if (number) {
                    System.out.println(i);
            }
        }

    }
}
