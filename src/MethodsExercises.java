public class MethodsExercises {
    public static void main(String[] args) {
        addNums(3, 3);
        subNums(10, 5);
        mulNums(8,4);
        divNums(20, 5);
        multiLoop(4,3);
    }
    public static void addNums(int num1, int num2){
        int i = num1 + num2;
        System.out.println(i);
    }

    public static void subNums(int num1, int num2){
        int i = num1 - num2;
        System.out.println(i);
    }

    public static void mulNums(int num1, int num2){
        int i = num1 * num2;
        System.out.println(i);
    }

    public static void divNums(int num1, int num2){
        int i = num1 / num2;
        System.out.println(i);
    }

    public static void multiLoop(int n1, int n2){
        int result = 0;
        for (int i = 0; i < n1; i++){
            result += n2;
        }
        System.out.println(result);
    }


};








