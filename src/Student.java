public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;


    // Default constructor // attr.. -> garbage
    public Student(){
    System.out.println("Student default ctr called");
    }
    //parameterised constructor
    public Student(int id, int age, String name, int nos){
   System.out.println("Student parameterised ctr called");
   this.id = id;
   this.age=age;
   this.name=name;
   this.nos= nos;
  }
  // copy constctr
  public Student(Student srcobj){ // srcjob -> A
      System.out.println("Student copy constructor called");
      this.id = srcobj.id;
      this.age=srcobj.age;
      this.name=srcobj.name;
      this.nos= srcobj.nos;
  }


    // Methods/ Behaviour
    public void study(){
        System.out.println(name+ " Studying");
    }
    public void sleep(){
        System.out.println(name+ " Sleeping");
    }
    public void bunk(){
        System.out.println(name+ " Bunking");
    }
}
