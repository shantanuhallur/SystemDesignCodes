public class Test {
    public static class Student {
        static String school = "KHS";

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        
        s2.school = "Abhinav";

        System.out.println(s1.school);
        System.out.println(s2.school);
        System.out.println(s3.school);
        s2.school = "JOG";
        System.out.println(s4.school);
        System.out.println(s5.school);

    }
}