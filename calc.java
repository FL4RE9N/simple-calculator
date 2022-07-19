import java.util.Scanner;

public class calc {
    public static void main(String arg[]) {
        String des = "YES";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("choose a operation\n1.add\n2.sub\n3.multi\n4.div\n");
            String operation = sc.nextLine();
            //ez run
            if (operation.equals("add")) {
                System.out.println("enter numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = a + b;
                System.out.println(ans);
            } else if (operation.equals("sub")) {
                System.out.println("enter numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = a - b;
                System.out.println(ans);
            } else if (operation.equals("multi")) {
                System.out.println("enter numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = a * b;
                System.out.println(ans);
            } else if (operation.equals("div")) {
                System.out.println("enter numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = a / b;
                System.out.println(ans);
            } else {
                System.out.println("invalid");
            }
            System.out.println("do u want to continue");
            des = sc.nextLine();
            des = sc.nextLine();
            // run
        } while (des.equals("YES"));

        sc.close();
    }
}