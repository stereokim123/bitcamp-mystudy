package bitcamp.myapp.command;

import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Board;

public class BoardCommand {

    private static final int MAX_SIZE = 100;
    private static Board[] boards = new Board[MAX_SIZE];
    private static int boardLength = 0;

    public static void executeBoardCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                addBoard();
                break;
            case "조회":
                viewBoard();
                break;
            case "목록":
                listBoard();
                break;
            case "변경":
                updateBoard();
                break;
            case "삭제":
                deleteBoard();
                break;
        }
    }

    private static void addBoard() {
        Board board = new Board();
        board.setPostTitle(Prompt.input("제목?"));
        board.setPostDescription(Prompt.input("내용?"));
        board.setPostDate(Prompt.input("작성일?"));

        boards[boardLength++] = board;
        System.out.println("등록했습니다.");
    }

    private static void listBoard() {
        System.out.println("번호 제목 작성일 조회수");
        for (int i = 0; i < boardLength; i++) {
            Board board = boards[i];
            System.out.printf("%d %s %s %d\n",
                    (i + 1), board.getPostTitle(), board.getPostDate(), board.getPostViews());
        }


    }

    private static void viewBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        Board board = boards[boardNo - 1];
        System.out.printf("제목: %s\n", board.getPostTitle());
        System.out.printf("내용: %s\n", board.getPostDescription());
        System.out.printf("작성일: %s\n", board.getPostDate());
        System.out.printf("조회수: %s\n", board.getPostViews());
        board.increasePostViews();


    }


    private static void updateBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        Board board = boards[boardNo - 1];
        board.setPostTitle(Prompt.input("제목(%s)?", board.getPostTitle()));
        board.setPostDate(Prompt.input("내용(%s)?", board.getPostDescription()));

        System.out.println("변경 했습니다.");
    }

    private static void deleteBoard() {

        int boardNo = Prompt.inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        for (int i = boardNo; i < boardLength; i++) {
            boards[i - 1] = boards[i];
        }
        boards[--boardLength] = null;
        System.out.println("삭제 했습니다.");

    }


}




