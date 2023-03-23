package baiTap1_Stack_and_Queue;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuMang_DaoNguocChuoi {
    public static void main(String[] args) {
        System.out.println("*******Stack Number*********\n");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackNumber = new Stack<Integer>();

        System.out.println("Nhập vào độ dài mảng : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Số phần tu mảng " +i+ " là : ");
            stackNumber.push(sc.nextInt());
        }
        System.out.println("Mảng sau khi đảo ngược là : ");
        ArrayList<Integer> newArr= new ArrayList<>();
        while (!stackNumber.isEmpty()){
            newArr.add(stackNumber.pop());
        }
        System.out.println(newArr);
        System.out.println();

        sc.nextLine();
        System.out.println("******String Number*****");
        System.out.println();
        Stack<String> stackString = new Stack<String>();
        System.out.println("Nhập vào 1 chuỗi : ");
        String chuoiString = sc.nextLine();
        for (int i = 0; i < chuoiString.length(); i++) {
            stackString.push(chuoiString.charAt(i)+"");
        }
        System.out.println("Chuỗi sau khi đảo ngược là  : ");
        for (int i = 0; i < chuoiString.length(); i++) {
            System.out.print(stackString.pop());
        }
        System.out.println();
    }
}
