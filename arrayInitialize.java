import java.util.Arrays;
import java.util.stream.IntStream;

public class arrayInitialize {
    
    public static void main(String arg[]){
        
        //using IntStream.range
        IntStream arr= IntStream.range(23, 85);
        arr.forEach(System.out::println);
        
        int brr[]= IntStream.range(1, 4).toArray();
        for(int ele:brr) System.out.println(ele);
      
        System.out.println(Arrays.toString(brr));
        //brr.forEach(System.out::println); //not work

        int crr[]= IntStream.rangeClosed(0, 9).toArray();
     //   for(int i=0;i<crr.length;i++)
        System.out.println(Arrays.toString(crr));
        
        int[] crr2=IntStream.of(1,5,8).toArray();
        System.out.println(crr2.length);
    }
}
