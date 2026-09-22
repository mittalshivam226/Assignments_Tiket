import java.util.*;

class Employee {
    public String id;
    public String name;
    public int age;
    public Date doj;

    public Employee(String id, String name, int age, Date doj) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doj = doj;
    }
    public static void main(String[] args) {

        Mylist<Employee> m = new Mylist<>();
        Employee e1 = new Employee("101", "Shivam", 21, new Date());

        Employee e2 = new Employee("102", "Pranav",21, new Date());

        Employee e3 = new Employee("103", "Adarsh", 29, new Date());

        m.add(e1);
        m.add(e2);
        m.add(e3);
        m.retrieve(0);
        m.deleteByIndex(1);
        m.retrieve(1);
    }
    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Age: " + age + " DOJ: " + doj;
    }

}

class Mylist<T> {

    public int Size = 100;
    public Object[] Array = new Object[100];
    public int n = 0;

    public void changeSize(int newSize){
        Size = newSize;
        Object[] newArray = new Object[Size];

        for(int i = 0; i<n; i++){
            newArray[i] = Array[i];
        }

        Array = newArray;
    }

    public void sizeCheck(){
        if(n<=Size/2){
            changeSize(Size/2);
            System.out.println("Size Decreased by half");
        }
        else if (n>=Size){
            changeSize(Size*2);
            System.out.println("Size Increased by 100%");
        }
    }

    public void add(T a){
        if(n<Size) Array[n++] = a;
        else{
            changeSize(Size*2);
            Array[n++] = a;
        }
    }

    public void deleteByIndex(int i){
        if(i>n || i<0) System.out.println("Out of Bound");
        else{
            for(int j = i; j<n-1; j++){
                Array[j] = Array[j+1];
            }
            Size--; n--;
        }
    }

    public void deleteByValue(T value){
        for(int i = 0; i<n; i++){
            if(Array[i].equals(value)) deleteByIndex(i);
        }
    }

    public void retrieve(int i){
        if(i>=Size || i>=n || i<0) System.out.println("Out of Scope");
        else System.out.println((T)Array[i]);
    }


}
