package codingal.SecondSetOfClasses.classTwentyOne;

import java.util.ArrayList;
import java.util.Scanner;

class project {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.print("Enter how many classes you have: ");
        int n = scn.nextInt();
        System.out.println("Enter the marks of each class: ");
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        System.out.print("The average of all your classes is: " + average(al));
        scn.close();
    }
    static double average(ArrayList<Integer> al){
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum/al.size();
    }
}
