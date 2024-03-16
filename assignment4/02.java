class Vehicle{
   void car(){
        System.out.println("a car");
   }

   void car(String company){
        System.out.println("car brand: "+company);
   }

   void car(String type, String modelName){
        System.out.println("car type: "+type);
        System.out.println("car model: "+modelName);
   }
}

class Demo1{
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.car();
        v1.car("mercedes");
        v1.car("Suv","G Wagon");        
    }
}