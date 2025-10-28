package inheritanceStuff;

    public class Cat  extends Pet {
        private String name;
        private int age;

        //name getter and setter
        public String getName(){ return name;} 
        public void setName(String name){ this.name = name;}

        //age get and set
        public int getAge(){ return age;}
        public void setAge(int age){this.age = age;}

        public void speak(){
            System.out.println("Meow!!");
        }
    }
    


