package exercises;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        Double lengthOfRectangle = input.nextDouble();
        System.out.println("What is the width?");
        Double widthOfRectangle = input.nextDouble();

        Double area = lengthOfRectangle * widthOfRectangle;
        System.out.println("The area of your rectangle is " + area);

    }
}
