import java.util.Arrays;


class ThirdHomework {
    
    public static void main (String[] args) {
        zeroAndOne();
        oneHundred ();
        sixMultiplyByTwo();
        twoDimensions();
        System.out.println (Arrays.toString(twoArguments (5, 3)));
        maxAndMin ();
        int [] forSeventhThing = {4, 3, 5, 6, 3, 3};
        System.out.println(checkBalance(forSeventhThing));
}

    static void zeroAndOne () {
        System.out.println ("First_task");
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println (Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
            arr[i]=0;
            }
            else {
            arr[i]=1;
            }
        } 
        System.out.println (Arrays.toString(arr));
    }
    
    static void oneHundred () {
        System.out.println ("Second_task");
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println (Arrays.toString(arr));
    }
    
    static void sixMultiplyByTwo () {
        System.out.println ("Third_task");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] *=2;
            }
        }
        System.out.println (Arrays.toString(arr));
    }
    
    static void twoDimensions () {
        System.out.println ("Forth_task");
        int [][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            System.out.println (Arrays.toString(arr[i]));
        }
    }
    
    //До fill додумался, к сожалению, не сам
    static int[] twoArguments (int len, int InitionalValue) {
        System.out.println ("Fifth_task");
        int [] arr = new int [len];
        Arrays.fill(arr, InitionalValue);
        return arr;
    }
    
    static void maxAndMin () {
        System.out.println ("Sixth_task");
        int [] arr = {10, 4, 6, 11, 23, 14};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println ("Max value - " + max);
        System.out.println ("Min value - " + min);   
    }
    
    //Писал и додумывал сам, но с подсказками 
    //Знакомый рассказал про такой вид for. По сути цикл, в котором мы не учитываем индексикацию, а просто берем все элементы, что нам и требовалось - посчитать все элементы и потом справа и слева, убавить и прибавить, соответсвенно 
    static boolean checkBalance (int[] arr) {
        System.out.println ("Seventh_task");
        int left = 0; 
        int right = 0;
        for (int i : arr) {
            right += i;
        }
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            right -= arr[i];
            if (left == right) {
                return true;
            }
        }
        return false;
    }
}

