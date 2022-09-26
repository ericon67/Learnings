#Generic class
A class that can refer to any type is known as a generic class. Here, we are using the T type parameter to create the generic class of specific type.

#Creating a generic class:
class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}  
 
  #Using generic class:
  class TestGenerics3{  
public static void main(String args[]){  
MyGen<Integer> m=new MyGen<Integer>();  
m.add(2);  
//m.add("vivek");//Compile time error  
System.out.println(m.get());  
}}  
  
#  Generic Method
Like the generic class, we can create a generic method that can accept any type of arguments.
  
  public class TestGenerics4{  
  
   public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
    public static void main( String args[] ) {  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        System.out.println( "Printing Integer Array" );  
        printArray( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        printArray( charArray );   
    }   
}  
