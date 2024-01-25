class Test4
{
    public static void main(String[] args) {
        int [] arr ={10,20,0,40,50};
        for(int i=0;i<8;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

/*output 
10   
20   
0    
40
50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Test4.main(Test4.java:7)
 */