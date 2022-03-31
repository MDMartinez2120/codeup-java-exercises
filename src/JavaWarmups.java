public class JavaWarmups {
    public static void main(String[] args) {

    }
    public static char returnFirstCapitalLetter(String s){
        for (int i = 0; i < s.length(); i += 1){
            if (s.charAt(i) == Character.toUpperCase(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

//    Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.
//
//        Examples...
//
//        returnFirstCapitalLetter("hellO") // returns 'O'
//        returnFirstCapitalLetter("hello") // returns ' '
//        returnFirstCapitalLetter("hEllo") // returns 'E'
//        returnFirstCapitalLetter("hELlO") // returns 'E'
//        returnFirstCapitalLetter("H") // returns 'H'

