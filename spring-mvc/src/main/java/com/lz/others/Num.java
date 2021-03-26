package com.lz.others;

/**
 * @author LY
 */
public class Num {
    private String[] result = new String[100];
    private int[] arr = new int[100];
    private int index;

    private void role1(int num) {
        String value = "";

        if (num % 3 == 0 && num % 5 == 0) {
            value = "FizzBuzz";
        } else if (num % 3 == 0) {
            value = "Fizz";
        } else if (num % 5 == 0) {
            value = "Buzz";
        } else {
            arr[index++] = num;
            value = String.valueOf(num);
        }
        result[num] = value;
    }

    private void role2() {
        int i = 0;
        while (arr[i] != 0) {
            String num = String.valueOf(arr[i]);
            if (num.contains("3")) {
                result[arr[i]] = "Fizz";
            } else if (num.contains("5")) {
                result[arr[i]] = "Buzz";
            }
            i++;
        }
    }

    public void print(int num, boolean role)  {
        num *= 3;
        for (int i = 1; i < num; i++) {
            role1(i);
        }
        if (role) {
            role2();
        }
        int index = 1;
        while (true) {
            System.out.println(index + "---" + result[index++]);
            if (result[index] == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Num num = new Num();
        num.print(33, true);
    }
}
