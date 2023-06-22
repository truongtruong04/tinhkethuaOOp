public class Dog extends Animal{
    public int eat ;
    public Dog(String name , int year , int eat ){
        super(name , year );
        this.eat = eat ;
    }
    public void play(){
        System.out.println("chạy bộ ");
    }

}
