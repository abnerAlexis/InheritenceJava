public class MySuperClass {
    String superStr = "Super class string";
    
    public MySuperClass(String constructorStr) {
        System.out.println("super class constructor");
        System.out.println(constructorStr);
    }
    
    public void superClassMethod(){
        System.out.println("Super class method.");
    }
}
