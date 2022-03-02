package com.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        String s = "Alex";
        int sum = 0;
        int[] nums = {126,32, 230,21,200};
        //sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
        //System.out.println("Percentage is: "+sum/100);
        for (int i =0;i< nums.length; i++)
        {
            sum = sum + nums[i];
            System.out.println(nums[i]);
        }
        System.out.println("Total is:"+sum);
        System.out.println("Percentage is:"+sum/100);

        //Boolean b = false;
        //Integer i = 10;
        //System.out.println(b);


        boolean b1 = true;
        System.out.println(b1);
    }
}
