interface Interface {
    public void animalSound();
    public void  sleep();
}
class cat implements Interface{
    public void animalSound(){
        System.out.println("The cat says: mew mew");
    }
    public void sleep() {
        System.out.println("Zzz");
    }


}
class MyMainClass{
    public static void main(String[] args) {
        cat MyCat= new cat();
        MyCat.animalSound();
        MyCat.sleep();
    }
}