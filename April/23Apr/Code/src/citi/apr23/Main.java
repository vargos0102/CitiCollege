package citi.apr23;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // you declare an array by [] brackets

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda","ABC"};

        //How to get the total count
        System.out.println(cars.length);

        //How to update the value
        cars[4] = "Benz";

        //How to get individual values
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);


        //Second example
        int[] employeeId = {1002, 1003, 1004, 1005, 9999};

        employeeId[4] = 1006;

        System.out.println(employeeId[0]);
        System.out.println(employeeId[1]);
        System.out.println(employeeId[2]);
        System.out.println(employeeId[3]);
        System.out.println(employeeId[4]);

        // length of an array.
        System.out.println(employeeId.length);

        //Multidimensional Array
        /*int[][] numbers = { {1,2,3}, {5,6,7,8} };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }*/

    }
}
