class Mylist {
    
    private int Size = 100;
    public int[] Array = new  int[100];
    public int n = 0;

    public void changeSize(int newSize){
        Size = newSize;
        int[] newArray = new int[Size];
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
        
    public void add(int a){
        if(n<Size) Array[n++] = a;
    else{
        changeSize(Size*2);
        Array[n++] = a;
    }
}
    public void deleteByIndex(int i){
        if(i>n|| i<0) System.out.println("Out of Bound");
        else{ 
            for(int j = i; j<n-1; j++){
                Array[j] = Array[j+1];
            }
            Size--; n--;
        }
    }
    public void deleteByValue(int value){
        for(int i = 0; i<n; i++){
            if(Array[i] == value) deleteByIndex(i);
        }
    }
    public void retrieve(int i){
        if(i>=Size || i>=n || i<0) System.out.println("Out of Scope");
        else System.out.println("Value = "+ Array[i]);
    }

    public static void main(String[] args) {
        Mylist m = new Mylist();
        m.add(1);
        m.add(2);
        m.add(8);
        m.retrieve(1);
        m.deleteByValue(2);
        m.retrieve(1);
    }
}
