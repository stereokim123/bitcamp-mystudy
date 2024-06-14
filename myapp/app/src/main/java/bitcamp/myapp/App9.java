package bitcamp.myapp;

public class App9 {
    public static void main(String[] args) {

//        String separator = "-------------------------------------";
//        String title = "[팀 프로젝트 관리 시스템]";
//        String list = "1. 회원\n2. 팀\n3. 프로젝트\n4. 게시판\n5. 도움말\n6. 종료";
//
//        System.out.println(separator);
//        System.out.println(title);
//        System.out.println();  // 공백 줄 추가
//        System.out.println(list);
//        System.out.println(separator);
//
//        String line = "-------------------------------------";
//        String appTitle = "[팀 프로젝트 관리 시스템]";
//        String menu1 = "1. 회원";
//        String menu2 = "2. 팀";
//        String menu3 = "3. 프로젝트";
//        String menu4 = "4. 게시판";
//        String menu5 = "5. 도움말";
//        String menu6 = "6. 종료";
//
//        System.out.println(line);
//        System.out.println(appTitle);
//        System.out.println();  // 공백 줄 추가
//        System.out.println(menu1);
//        System.out.println(menu2);
//        System.out.println(menu3);
//        System.out.println(menu4);
//        System.out.println(menu5);
//        System.out.println(menu6);
//        System.out.println(separator);

        // ANSI escape codes for styling
        String bold = "\033[1m";
        String red = "\033[31m";
        String reset = "\033[0m";

        String line = bold + "-------------------------------------" + reset;
        String appTitle = bold + "[팀 프로젝트 관리 시스템]" + reset;
        String menu1 = "1. 회원";
        String menu2 = "2. 팀";
        String menu3 = "3. 프로젝트";
        String menu4 = "4. 게시판";
        String menu5 = "5. 도움말";
        String menu6 = red + bold + "6. 종료" + reset;

        System.out.println(line);
        System.out.println(appTitle);
        System.out.println();  // 공백 줄 추가
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(menu5);
        System.out.println(menu6);
        System.out.println(line);

    }
}
