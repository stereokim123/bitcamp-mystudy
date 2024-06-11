package bitcamp.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APP3Test {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        String[] menus = new String[] {
                "회원",
                "팀",
                "프로젝트",
                "게시판",
                "도움말",
                "종료"
        };

        // 변경된 부분: 메뉴 출력 루프 및 입력 처리
        while (true) {
            System.out.print("> ");
            String input = keyboardScanner.nextLine().trim(); // 변경된 부분: 문자열 입력 처리

            if (input.equalsIgnoreCase("menu")) { // 변경된 부분: 'menu' 명령어 처리
                System.out.println(boldAnsi + line + resetAnsi);
                System.out.println(boldAnsi + appTitle + resetAnsi);

                for (int i = 0; i < menus.length; i++) {
                    if (menus[i].equals("종료")) { // 변경된 부분: 문자열 비교
                        System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
                    } else {
                        System.out.printf("%d. %s\n", (i + 1), menus[i]);
                    }
                }

                System.out.println(boldAnsi + line + resetAnsi);
            } else {
                try {
                    int menuNo = Integer.parseInt(input); // 변경된 부분: 문자열을 정수로 변환

                    if (menuNo >= 1 && menuNo <= menus.length) {
                        if (menus[menuNo - 1].equals("종료")) { // 변경된 부분: 문자열 비교
                            break;
                        }
                        System.out.println(menus[menuNo - 1]);
                    } else {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    }
                } catch (NumberFormatException ex) { // 변경된 부분: 예외 처리
                    System.out.println("유효하지 않은 명령어입니다. 'menu'를 입력하여 메뉴를 확인하세요.");
                }
            }
        }

        System.out.println("종료합니다.");
        keyboardScanner.close();
    }
}
