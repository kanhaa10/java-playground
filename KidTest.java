import java.util.*;

class Kid {
    String name;
    double[] marks;

    Kid(String n, double[] m) {
        name = n;
        marks = m;
    }

    double avg() {
        double s = 0;
        for (double x : marks) s += x;
        return s / marks.length;
    }

    String grade() {
        double a = avg();
        if (a >= 85) return "A";
        if (a >= 70) return "B";
        if (a >= 50) return "C";
        return "F";
    }

    void show() {
        System.out.println("Name: " + name + " Avg: " + avg() + " Grade: " + grade());
    }
}

public class KidTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Kid[] arr = new Kid[n];
        for (int i = 0; i < n; i++) {
            String nm = sc.next();
            int sub = sc.nextInt();
            double[] m = new double[sub];
            for (int j = 0; j < sub; j++) m[j] = sc.nextDouble();
            arr[i] = new Kid(nm, m);
        }
        Kid top = arr[0];
        for (Kid k : arr) if (k.avg() > top.avg()) top = k;
        for (Kid k : arr) k.show();
        System.out.print("Topper: ");
        top.show();
    }
}
