package bitcamp.myapp;

import java.util.Scanner;

public class App {

    static String[] menus = new String[]{
            "회원",
            "팀",
            "프로젝트",
            "게시판",
            "도움말",
            "종료"
    };

    static String[] subMenus = new String[]{
            "등록",
            "조회",
            "변경",
            "삭제",
            "이전"
    };

    static Scanner keyboardScanner = new Scanner(System.in);

    public static void main(String[] args) {

        printMenu();

        String command;
        while (true) {
            try {
                command = prompt();

                if (command.equals("menu")) {
                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo);
                    printSubMenu();
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                        break;
                    } else {
                        System.out.println(menuTitle);
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요");

            }
        }
        System.out.println("종료합니다.");
        keyboardScanner.close();
    }

    static String prompt() {
        System.out.println("> ");
        return keyboardScanner.nextLine();

    }

    static String getMenuTitle(int menuNo) {

        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;

    }

    static boolean isValidateMenu(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }

    static void printSubMenu() {
        for (int i = 0; i < subMenus.length; i++) {
            if (subMenus[i] == "이전") {
                printMenu();
            } else {
                System.out.printf("%d, %s\n", (i + 1), subMenus[i]);
            }
        }
    }

    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i] == "종료") {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i],
                        resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }
        System.out.println(boldAnsi + line + resetAnsi);


    }


}