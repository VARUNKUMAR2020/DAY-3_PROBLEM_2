package Line_Comparison;
import java.util.*;
public class lineComparison 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Line Comparison Computation Program" );
        System.out.println("Enter the first co-ordinate");
   	    Scanner sc = new Scanner(System.in);
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        System.out.println("Enter the second co-ordinate");
        int X2=sc.nextInt();
        int Y2=sc.nextInt();
        System.out.println("The first co-ordinate is (" +X1 +","+Y1+") ");
        System.out.println("The second co-ordinate is (" +X2 +","+Y2+") ");
        double length1=0;
        double length2=0;
        int p3=(X2-X1)*(X2-X1);
        int p4=(Y2-Y1)*(Y2-Y1);
        length2=Math.sqrt(p3+p4);
        System.out.println("length of the line is "+length2);
        Double L1new= length1;
        Double L2new= length2;
        boolean chk=L1new.equals(L2new);
	    if(chk==true) {
		System.out.println("These two lines are equal");
	    }
   	    else {
		System.out.println("These two lines are NOT equal");
   	    }
   }

}

