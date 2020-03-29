package l09;

public class Cat {
    protected int age;
    protected String color;
    protected String name;

    public Cat (int age , String color , String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public static void main (String[] args) {
        Task5.analyzeTransaction(Cat.class);
    }

    @Transaction
    public void sayMeow () {
        System.out.println("Meow!");
    }
}
