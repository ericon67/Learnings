when making a child class by inheriting, if need to change one of or few methods, it can be override. 
  
  class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
  
class Child extends Parent {

    private void m1()
    {
        System.out.println("From child m1()");
    }
  

    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
}

class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();        output   -   From parent m2()
        obj1.m2();
        Parent obj2 = new Child();         output   -   From child m2()
        obj2.m2();
    }
}

output
From parent m2()
From child m2()
