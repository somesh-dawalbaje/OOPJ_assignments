class Student{
    private String name;
    private int id;
    private char div;
    
    Student(String name, int id, char div){
        this.name=name;
        this.id=id;
        this.div=div;
    }

    public void studentInfo(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("div: "+div);
    }
}

class Demo{
    public static void main(String[] args) {
        Student obj1=new Student("anil", 1542, 'A');
        obj1.studentInfo();
    }
}