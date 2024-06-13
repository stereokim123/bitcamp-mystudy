package bitcamp.myapp;

import java.util.Scanner;

public class APP6 {
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

    // 서브 메뉴 배열
    static String[] subMenu = {
            "[회원]\n1. 등록\n2. 목록\n3. 조회\n4. 변경\n5. 삭제\n9. 이전",
            "[팀]\n1. 등록\n2. 목록\n3. 조회\n4. 변경\n5. 삭제\n9. 이전",
            "[프로젝트]\n1. 등록\n2. 목록\n3. 조회\n4. 변경\n5. 삭제\n9. 이전",
            "[게시판]\n1. 등록\n2. 목록\n3. 조회\n4. 변경\n5. 삭제\n9. 이전",
            "[도움말]\n도움말",
            "[이전]"
    };

    // 현재 선택된 메뉴를 저장할 변수
    static int currentMenu = -1;

    public static void main(String[] args) {
        // 프로그램이 시작될 때 메뉴를 출력합니다.
        printMenu();

        String command;
        while (true) {
            // 사용자에게 명령을 입력받습니다.
            command = prompt();

            // 사용자 입력에 따라 분기 처리를 합니다.
            if (command.equals("menu") || command.equals("9")) {
                // "menu" 또는 "9" 입력 시 메뉴를 다시 출력합니다.
                printMenu();
            } else {
                try {
                    // 숫자로 입력된 명령을 메뉴 번호로 변환합니다.
                    int menuNo = Integer.parseInt(command);
                    if (isValidMenuNumber(menuNo)) {
                        // 유효한 메뉴 번호인지 확인하고 처리합니다.
                        if (menus[menuNo - 1].equals("종료")) {
                            // "종료" 메뉴를 선택하면 반복문을 종료하고 프로그램을 종료합니다.
                            break;
                        }
                        // 선택된 메뉴에 해당하는 서브 메뉴를 출력합니다.
                        currentMenu = menuNo - 1;
                        System.out.println(subMenu[currentMenu]);

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
        // ANSI 코드를 사용하여 텍스트 스타일을 설정합니다.
        String boldAnsi = "\033[1m"; // 글씨를 굵게 설정
        String redAnsi = "\033[31m"; // 글씨 색상을 빨간색으로 설정
        String resetAnsi = "\033[0m"; // 글씨 스타일을 초기화

        String appTitle = "[팀 프로젝트 관리 시스템]"; // 애플리케이션 제목
        String line = "----------------------------------"; // 구분선

        // 화면에 메뉴를 출력합니다.
        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                // 종료 메뉴는 빨간색으로 출력합니다.
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                // 나머지 메뉴는 그냥 출력합니다.
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }

        System.out.println(boldAnsi + line + resetAnsi);
    }

    // 사용자에게 입력을 받는 메서드입니다.
    static String prompt() {
        if (currentMenu == -1) {
            // 초기 메인 메뉴 출력 시 프롬프트를 출력합니다.
            System.out.print("메인> ");
        } else {
            // 서브 메뉴 출력 시 해당 메뉴에 대한 프롬프트를 출력합니다.
            System.out.printf("메인/%s> ", menus[currentMenu]);
        }
        return keyboardScanner.nextLine();
    }

    // 입력된 메뉴 번호가 유효한지 확인하는 메서드입니다.
    static boolean isValidMenuNumber(int menuNo) {
        // 메뉴 번호가 1부터 메뉴 배열의 길이 사이에 있는지 확인합니다.
        return menuNo >= 1 && menuNo <= menus.length;
    }
}
