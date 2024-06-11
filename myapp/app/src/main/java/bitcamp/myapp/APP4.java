package bitcamp.myapp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class APP4 {

    static Scanner keyboardScanner = new Scanner(System.in);

    static String[] menus = new String[] {
            "회원",
            "팀",
            "프로젝트",
            "게시판",
            "도움말",
            "종료"
    };
    public static void main(String[] args) {

        printMenu(); // 메서드를 실행한다. "메서드 호출(call)"

        String command;
        while (true) {
            try {
                command = prompt();


                if (command.equals("menu")) {
                    printMenu();
                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo); // 설명하는 변수
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                        break;
                    } else {
                        System.out.println(menuTitle);
                    }
                    if (menuTitle != null) { // 사용자가 입력한 메뉴 번호가 유효한 지 검사
                        if (menuTitle.equals("종료")) { // 문자열을 비교할 때는 항상 .equals 쓸 것
                            break;
                        } else {
                            System.out.println(getMenuTitle(menuNo));

                        }


                    }
                }

            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");

            }
        }

        System.out.println("종료합니다.");

        keyboardScanner.close();
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
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }

        System.out.println(boldAnsi + line + resetAnsi);
    }

    static String prompt() {
        System.out.print("> ");
        return keyboardScanner.nextLine();

    }

    static boolean isValidateMenu(int menuNo) {
        return (menuNo >= 1 && menuNo <= menus.length);
    }

    static String getMenuTitle(int menuNo) {
        // if (isValidateMenu(menuNo)) {
        //    return menus[menuNo - 1];
        //}
        //return null;

        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;


    }

}


// 학습 목표
// 스태틱 메서드를 정의하고 사용할 수 있다
// 스태틱 필드(변수)를 정의하고 사용할 수 있다
// import 명령문을 사용할 수 있다

// 요구 사항
// 중복 코드를 메서드로 분리
// 효과 : 기능 변경이 쉽다
// 기능 단위로 명령어를 묶어 메서드로 분리
// 효과 : 코드의 기능을 이해하기 쉽다 = (가독성이 좋다)
// 이를 통해 코드의 재사용성을 강화
// 효과 : 재작성 없이 다른 프로젝트에서도 재작성하지 않고 사용할 수 있다.

// 작업
// 1. 메뉴를 출력하는 코드를 printMenu() 메서드로 묶어 사용한다
// 2. 사용자로부터 명령을 입력 받는 코드를 prompt()로 메서드로 묶어 사용한다
// 3. 메뉴 번호의 유효성을 검증하는 코드를 isValidateMenu()  메서드로 묶어 사용한다
// 4. 메뉴 타이틀을 알아내는 코드를 getMenuTitle() 메서드로 묶어 사용한다
// 5. 메뉴를 처리하는 조건문 (유효한 번호, 유효하지 않은 번호, 
