package bt4_ChuyenTuSoNguyenDuong_Sang_NhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhập vào 1 số nguyên dương bất kỳ : ");
        int x = sc.nextInt();
        while(x>0){
          int soDu = x%2;
            System.out.println("In ra so du " +soDu);
            stackSoDu.push(soDu);
            x = x/2;
        }
        System.out.print("Số nhị phân là : ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stackSoDu.pop());
        }
    }
}
