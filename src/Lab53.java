public class Lab53 {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        int m1=0, m2=0, m3=0;

        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * 5);
            m1 = m1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.print("///");
        double mid1 = m1 / 5.0;
        System.out.println(mid1);
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) (Math.random() * 5);
            m2 = m2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.print("///");
        double mid2 = m2 / 5.0;
        System.out.println(mid2);
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) (Math.random() * 5);
            m3 = m3 + array3[i];
            System.out.print(array3[i] + " ");
        }
        System.out.print("///");
        double mid3 = (m3 / 5.0);
        System.out.println(mid3);
        if (mid1 >= mid2 && mid1 >= mid3) {
            System.out.println("Перше значення найбільше");
        } else if (mid2 >= mid1 && mid2 >= mid3) {
            System.out.println("Друге значення найбільше");
        } else if (mid1 == mid2 && mid1 == mid3) {
            System.out.println(" Всі значення рівні");
        } else  {System.out.println("Друге значення найбільше");
        }

    }
}
