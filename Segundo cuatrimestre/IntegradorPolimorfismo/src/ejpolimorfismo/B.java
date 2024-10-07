package ejpolimorfismo;

public class B extends A{
    @Override
    public int m1() {
        return m2();
    }
    
    @Override
    public int m2() {
        return 2;
    }
    
    @Override
    public int m3() {
        return super.m2();
    }
}
