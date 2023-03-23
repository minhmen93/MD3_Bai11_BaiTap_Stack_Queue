package baiTap6_Test_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra : ");
        String inputString = sc.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0 ; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng ");
        else
            System.out.println("Đây không phải là chuỗi đối xứng ");
    }
}
