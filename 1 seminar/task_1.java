public class Cat {
    private String name;
    private int age;
    private String ownerName;
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    
    public void greet(){
        Owner ownerName = new Owner();
        System.out.println("Мяу! Меня зовут " + this.name + ", Мне - " + this.age + " лет. Мой хозяин" +  this.ownerName);
    }
}

public class Owner {
    private String name;

    public int getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}


public static void main(String[] args) {
    
    Cat CatInit = new Cat();
    Owner ownerInit = new Owner()
    ownerInit.setName("Igor")
    CatInit.setName("barsik");
    CatInit.setAge(10);
}