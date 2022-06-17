public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        // task1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};
        char[] c = {'a', 'b', 'c'};

        // task2
        System.out.print("Task 2\n");
        int i;
        String com = "";
        for (i = 0; i < a.length; i++) {
            if (i > 0) {
                com = ", ";
            }
            System.out.print(com + a[i]);
        }

        System.out.println();
        com = "";
        for (i = 0; i < b.length; i++) {
            if (i > 0) {
                com = ", ";
            }
            System.out.print(com + b[i]);
        }

        System.out.println();
        com = "";
        for (i = 0; i < c.length; i++) {
            if (i > 0) {
                com = ", ";
            }
            System.out.print(com + c[i]);
        }

        // task3
        System.out.print("\n\nTask 3\n");
        com = "";
        for (i = a.length-1; i >= 0; i--) {
            if (i < a.length-1) {
                com = ", ";
            }
            System.out.print(com + a[i]);
        }

        System.out.println();
        com = "";
        for (i = b.length-1; i >= 0; i--) {
            if (i < b.length-1) {
                com = ", ";
            }
            System.out.print(com + b[i]);
        }

        System.out.println();
        com = "";
        for (i = c.length-1; i >= 0; i--) {
            if (i < c.length-1) {
                com = ", ";
            }
            System.out.print(com + c[i]);
        }

        // task4
        System.out.print("\n\nTask 4\n");
        com = "";
        for (i=0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] += 1;
            }
        }
        for (i = 0; i < a.length; i++) {
            if (i > 0) {
                com = ", ";
            }
            System.out.print(com + a[i]);
        }
    }
}