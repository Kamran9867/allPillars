public class Object {
    public static void main(String[] args) {

//        Student A =new Student();
//        A.id = 1;
//        A.age = 14;
//        A.name= "Ranu";
//        A.nos=5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//
//        A.bunk();
//        A.sleep();
//        A.study();
        // parameterised cotor
        Student A = new Student(1, 16, "Rahul", 5);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);


        A.bunk();
        A.sleep();
        A.study();

        //Making Multiple objects in an easy way
        Student C = new Student(2, 18, "Kamran", 6);
        Student D = new Student(3, 20, "Taufik", 4);
        Student E = new Student(4, 22, "Vishnu", 8);




//        //copy constructor ka Object
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.study();
//        B.sleep();
//        B.bunk();

    }
}
