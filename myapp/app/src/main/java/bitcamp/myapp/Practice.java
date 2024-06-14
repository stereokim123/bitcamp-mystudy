package bitcamp.myapp;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("무슨 커피를 드릴까요?");
        String order = scanner.next();
        int price = 0;
        switch (order) {
            case "에스프레소":
            case "아메리카노":
            case "카페라떼":
                price = 3000;
                break;
            case "카푸치노":
                price = 5000;
                break;
            default:
                System.out.println("메뉴에 없습니다.");


        }
        if (price != 0)
            System.out.print(order + "는 " + price + "원입니다");


        scanner.close();
    }
}
