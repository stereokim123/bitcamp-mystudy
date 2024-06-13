package bitcamp.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APP5 {
    // 스캐너를 static으로 선언하여 모든 메서드에서 접근 가능하도록 합니다.
    static Scanner keyboardScanner = new Scanner(System.in);

    // 메뉴 배열을 static으로 선언하여 모든 메서드에서 접근 가능하도록 합니다.
    static String[] menus = {
            "회원",
            "팀",
            "프로젝트",
            "게시판",
            "도움말",
            "종료"
    };

    public static void main(String[] args) {
        // 프로그램이 시작될 때 메뉴를 출력합니다.
        printMenu();

        String command;
        while (true) {
            // 사용자에게 명령을 입력받습니다.
            command = prompt();

            // "menu" 명령을 입력받으면 메뉴를 다시 출력합니다.
            if (command.equals("menu")) {
                printMenu();
            } else {
                try {
                    // 숫자로 입력된 명령을 메뉴 번호로 변환합니다.
                    int menuNo = Integer.parseInt(command);
                    if (isValidMenuNumber(menuNo)) {
                        // "종료" 메뉴를 선택하면 반복문을 종료하고 프로그램을 종료합니다.
                        if (menus[menuNo - 1].equals("종료")) {
                            break;
                        }
                        // 선택된 메뉴를 출력합니다.
                        System.out.println(menus[menuNo - 1]);
                    } else {
                        // 유효하지 않은 메뉴 번호를 입력한 경우 메시지를 출력합니다.
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    }
                } catch (NumberFormatException ex) {
                    // 숫자가 아닌 값을 입력한 경우 메시지를 출력합니다.
                    System.out.println("숫자로 메뉴 번호를 입력하세요.");
                }
            }
        }

        // 프로그램 종료 메시지를 출력합니다.
        System.out.println("종료합니다.");
        // 스캐너를 닫아줍니다.
        keyboardScanner.close();
    }

    // 메뉴를 출력하는 메서드입니다.
    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }

        System.out.println(boldAnsi + line + resetAnsi);
    }

    // 사용자에게 입력을 받는 메서드입니다.
    static String prompt() {
        System.out.print("> ");
        return keyboardScanner.nextLine();
    }

    // 입력된 메뉴 번호가 유효한지 확인하는 메서드입니다.
    static boolean isValidMenuNumber(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }
}
