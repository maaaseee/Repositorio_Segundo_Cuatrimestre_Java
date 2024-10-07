package ejpolimorfismo;

public class A {
    public int m1() {
        return 1;
    }
    
    public int m2() {
        return m1();
    }
    
    public int m3() {
        return this.m1();
    }
}
