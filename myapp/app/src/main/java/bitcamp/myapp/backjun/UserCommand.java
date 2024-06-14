//package bitcamp.myapp.backjun;
//
//import bitcamp.myapp.Prompt;
//import bitcamp.myapp.User;
//
//public class UserCommand {
//    static final int MAX_SIZE = 100;
//    static User[] users = new User[MAX_SIZE];
//    static int userLength = 0;
//
//    public static void executeUserCommand(String command) {
//        System.out.printf("[%s]\n", command);
//        int userNo = 0;
//
//        switch (command) {
//            case "등록":
//                addUser();
//                break;
//            case "조회":
//                viewUser();
//
//                break;
//            case "목록":
//                listUser();
//
//                break;
//            case "변경":
//                updateUser();
//                break;
//            case "삭제":
//                deleteUser();
//                break;
//            // 다음 값을 앞으로 당긴다.
//        }
//    }
//
//    static void addUser() {
//        User user = new User();
//        user.name = prompt.prompt("이름?");
//        user.email = prompt.prompt("이메일?");
//        user.password = prompt.prompt("암호?");
//        user.tel = prompt.prompt("연락처?");
//        users[userLength] = user;
//
//
//    }
//
//    static void listUser() {
//
//        System.out.println("번호 이름 이메일");
//        for (int i = 0; i < memberlength; i++) {
//            System.out.printf("%d %s %s\n", (i + 1), name[i], email[i]);
//        }
//    }
//
//
//    static void viewUser() {
//        int userNo = Integer.parseInt(Prompt.prompt("회원번호?"));
//        if ((userNo) < 1 || userNo > memberlength) {
//            System.out.println("없는 회원입니다.");
//            return;
//        }
//
//
//        System.out.printf("이름: %s\n", name[userNo - 1]);
//        System.out.printf("이메일: %s\n", email[userNo - 1]);
//        System.out.printf("연락처: %s\n", tel[userNo - 1]);
//    }
//
//
//    static void updateUser() {
//
//        int userNo = Integer.parseInt(Prompt.prompt("회원번호?"));
//        if ((userNo) < 1 || userNo > memberlength) {
//            System.out.println("없는 회원입니다.");
//            return;
//        }
//        name[userNo - 1] = Prompt.prompt(String.format("이름(%s)?", name[userNo - 1]));
//        email[userNo - 1] = Prompt.prompt(String.format("이메일(%s)?", name[userNo - 1]));
//        password[userNo - 1] = Prompt.prompt("암호?");
//        tel[userNo - 1] = Prompt.prompt(String.format("연락처(%s)?", name[userNo - 1]));
//        System.out.println("변경했습니다.");
//
//
//    }
//
//
//    static void deleteUser() {
//
//        int userNo = Integer.parseInt(Prompt.prompt("회원번호?"));
//        if ((userNo) < 1 || userNo > memberlength) {
//            System.out.println("없는 회원입니다.");
//            return;
//        }
//        for (int i = userNo; i < memberlength; ) {
//            name[i - 1] = name[i];
//            email[i - 1] = email[i];
//            password[i - 1] = password[i];
//            tel[i - 1] = tel[i];
//
//        }
//        memberlength--;
//        name[memberlength] = null;
//        email[memberlength] = null;
//        password[memberlength] = null;
//        tel[memberlength] = null;
//
//    }
//}
//
