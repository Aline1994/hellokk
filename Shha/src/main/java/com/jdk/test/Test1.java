package com.jdk.test;

public class Test1 {
	/*private static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.print(i);
                }
            } finally {
                System.out.print("e");
            }
        }
    }
 
    public static void main(String[]args) {
        try {
            test(new int[] {0, 1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.print("E");
        }
    }*/
		public static final Test1 t1 = new Test1();
	    public static Test1 t2 = new Test1();
	    {
	        System.out.println("¹¹Ôì¿é");
	    }
	    static
	    {
	        System.out.println("¾²Ì¬¿é");
	    }
	    public static void main(String[] args)
	    {
	        Test1 t = new Test1();
	    }
 
}
