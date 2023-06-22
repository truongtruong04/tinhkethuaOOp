public class Cat {
    public static void main(String [] args ){
        Dog dog = new Dog("bully", 3 , 5 );
        System.out.println("name is "+dog.name);
        System.out.println("how old  "+dog.year);
        System.out.println("how much to eat "+dog.eat);
        dog.play();
        dog.sleep();
    }
}
