package bitcamp.myapp;
//
// 키보드 입력을 다룰 수 있다
// 조건문을 사용하여 실행을 분기할 수 있다
// 반복문을 사용하여 특정 명령문을 반복해서 실행할 수 있다


// 실행 결과

//-------------------------------------
//[팀 프로젝트 관리 시스템]
//
//1. 회원
//2. 팀
//3. 프로젝트
//4. 게시판
//5. 도움말
//6. 종료
//-------------------------------------
// > 1
// 회원
// > 3
// 프로젝트
// > 9
// 메뉴 번호가 옳지 않습니다.
// > 6
// 종료합니다

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {
                "1. 회원",
                "2. 팀",
                "3. 프로젝트",
                "4. 게시판",
                "5. 도움말",
                "6. 종료"
        };

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("[팀 프로젝트 관리 시스템]\n");
            for (String item : menu) {
                System.out.println(item);
            }
            System.out.println("-------------------------------------");
            System.out.print("> ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.println("회원");
                    break;
                case 2:
                    System.out.println("팀");
                    break;
                case 3:
                    System.out.println("프로젝트");
                    break;
                case 4:
                    System.out.println("게시판");
                    break;
                case 5:
                    System.out.println("도움말");
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 번호가 옳지 않습니다.");
                    break;


            }
        }
    }
}