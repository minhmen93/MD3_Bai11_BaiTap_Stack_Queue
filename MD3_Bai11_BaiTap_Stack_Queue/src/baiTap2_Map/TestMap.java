package baiTap2_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
     // Map (key : value )
        System.out.println("Nhập vào 1 chuỗi : ");
        Map<String,Integer> treeMap = new TreeMap<>();
        String string = new Scanner(System.in).nextLine();
        // string = Chương trình sử dụng 1 treeMap để lưu trữ
        String[] arrString = string.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            //Duyệt mảng các từ rồi thêm vào treeMap
            if (treeMap.containsKey(arrString[i])){
                int value = treeMap.get(arrString[i]);
                treeMap.put(arrString[i],value+1);
            }else {
                treeMap.put(arrString[i],1);
            }

        }
        Set<String> listKey = treeMap.keySet();
        for (String word : listKey){
            System.out.printf("Từ %s xuất hiện %d lần \n", word,treeMap.get(word));
        }
    }
}
