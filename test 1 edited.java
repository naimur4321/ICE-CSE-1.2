class first_test  {
    private String name;
    private int age;

   
    public first_test() {
        this.name = "Nishad";  // Setting default values
        this.age = 25;
    }


    public first_test(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
              first_test person1 = new first_test();  
        first_test person2 = new first_test("Mondol",20 );  


        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}