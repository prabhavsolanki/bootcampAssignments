package assignment5.Ans8;

// Parent 1
interface Father {
    default void skill(){
        System.out.println("Father: 'I like exception handling'");
    }
}

// Parent 2
interface Mother {
    default void skill(){
        System.out.println("Mother: 'I like Polymorphism'");
    }
}

// Child implementing both parents i.e. Multiple inheritance
public class Child implements Father, Mother {

    // Overriding the method common in both parents
    @Override
    public void skill() {
        Father.super.skill();
        Mother.super.skill();
        System.out.println("Child: 'I like both the above and streams'");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.skill();
    }
}
