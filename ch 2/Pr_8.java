
/*
    Question 8
*/
// import java.util.*;

interface Exam {
    boolean pass(int marks);
}

interface Classify {
    String division(int average);
}

class Result implements Exam, Classify {
    public boolean pass(int marks) {
        if (marks >= 35) {
            return true;
        } else {
            return false;
        }
    }

    public String division(int average) {
        String str;
        if (average >= 60) {
            return str = "first";
        } else if (average >= 50 && average < 60) {
            return str = "second";
        } else if (average < 50) {
            return str = "No division";
        }
        return str = null;
    }
}

public class Pr_8 {
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.pass(40));
        System.out.println(r.division(58));
    }
}
