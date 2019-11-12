package exercises;


import java.util.*;

public class ArrayListPractice {
    public static int evenNumberSum(ArrayList<Double> args){
        int evenSum = 0;
        for(Double number : args){
            if (number % 2 == 0){
                evenSum += number;
            }
        }

        return evenSum;
    }

    public static void printFiveLetterWords(ArrayList<String> args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many letter would you like each word: ");
        int wordLength = input.nextInt();
        for (String word : args){
            if (word.length() == wordLength){
                System.out.println(word);
            }
        }
    }

    public static void gradeBook(){
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        Integer currentStudentID;
        String currentStudentName;

        System.out.print("Enter student ID's and names. Enter 0 to exit. \n");

        do {
            System.out.print("Student ID: ");
            currentStudentID = input.nextInt();

            if (currentStudentID != 0){
                System.out.print("Student Name: ");
                currentStudentName = input.next();
                students.put(currentStudentID, currentStudentName);

                input.nextLine();

            }

        } while (currentStudentID != 0);

        System.out.print("Class Roster: \n");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }

    public static void main(String[] args){
    ArrayList<Double> arrList = new ArrayList<Double>();
    ArrayList<String> randomWords = new ArrayList<String>(Arrays.asList("help", "signal", "signs", "stop", "apple", "pears", "peach"));

    for (int i = 0; i < 11; i++){
        arrList.add((double) i);
    }

    System.out.println(evenNumberSum(arrList));
    printFiveLetterWords(randomWords);
    gradeBook();

    }


}
