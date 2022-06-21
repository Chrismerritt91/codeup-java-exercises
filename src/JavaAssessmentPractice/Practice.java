package JavaAssessmentPractice;

import java.util.ArrayList;

public class Practice {

    public static int subtractTen(int num){
        return num - 10;
    }

    public static double average(int[] list){
        int total = 0;
        for(int num: list){
            total += num;
        }
        return (double)total / list.length;
    }

    public static ArrayList<Integer> multiplyAll(int num, ArrayList<Integer> nums){
        ArrayList<Integer> newList = new ArrayList<>();
        for(int digit: nums){
            newList.add(digit * num);
        }
        return newList;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(20));
        System.out.println(average(new int[]{1,3,5,7}));
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(5);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(7);
        System.out.println(multiplyAll(4, Numbers));

    }
}
