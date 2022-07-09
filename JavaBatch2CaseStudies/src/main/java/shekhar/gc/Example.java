package shekhar.gc;

public class Example {
    public static void main(String[] args) { 
        new Example(); 
        System.gc(); 
    } 
 
    @Override
    protected void finalize() { 
        System.out.println("Garbage collector called."); 
    } 
}