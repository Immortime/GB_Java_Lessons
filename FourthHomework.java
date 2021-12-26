import java.util.Scanner;
import java.util.Random;

class FourthHomework {
    
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;
    
    public static void main(String [] args) {
        new FourthHomework().game();
    }
    
    FourthHomework() {
        table = new char [3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            humanTurn();
            if (Win(SIGN_X)) {
                System.out.println("WIN!");
                break;
            }
            if (Full_Table()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printTable();
            if (Win(SIGN_O)) {
                System.out.println("LOST!");
                break;
            }
            if (Full_Table()) {
                System.out.println("Draw");
                break;
            }
        }
        printTable();
    }
    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }
    
    void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Enter x y [1-3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
        
    }
    
    void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }
    
    boolean isCellValid (int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    
    boolean Win (char ch) { // Такой способ может работать и для 5x5 только надо поменять размер массива
        int right, left; //Diagonals 
        int hor, ver;  // Obvious 
        for (int y = 0; y < table.length; y++) {
            hor = 0;
            ver = 0;
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == ch) {  
                    hor++;
                }
                if (table[x][y] == ch) { 
                    ver++;
                }
            }
            if (hor == table.length || ver == table.length) { 
                return true; 
            }
        }
        right = 0;
        left = 0;
        for (int x = 0; x < table.length; x++) { 
            if (table[x][x] == ch) {
                left++;
            }
            if (table[x][table.length - x - 1] == ch) {
                right++;
            }
        }
        if (left == table.length || right == table.length) {
            return true;
        }
        return false;
    }   
    
    boolean Full_Table() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
    