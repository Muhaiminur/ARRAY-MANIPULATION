package array.manipulation;
import java.util.Scanner;
public class MANIPULATION_WORK2_TESTER{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    MANIPULATION_WORK2 abir1=new MANIPULATION_WORK2();
    //Creating an array
    System.out.println("enter your array size");
    int c=abir.nextInt();
    abir1.Creatingarray(c);
    //Iterating over the elements of an array
    abir1.Iterating();
    //Copying an array
    Object[]a={5,4,6,3,7,null,null};
    //abir1.copyArray1(a);
    abir1.print(abir1.copyArray1(a));
    System.out.println("This is the second way");
    //abir1.copyArray2(a);
    abir1.print(abir1.copyArray2(a));
    //Resizing an array
    abir1.print(abir1.resize(a,8));
    //Reversing an array
    abir1.reverse(a);
    abir1.print(a);
    //Shifing an array left
    abir1.shiftLeft(a);
    abir1.print(a);
    //Shifing an array right
    abir1.shiftRight(a);
    abir1.print(a);
    //Inserting an element into an array
    abir1.insert(a,5,77,3);
    abir1.print(a);
    //Removing an element from an array
    abir1.remove(a,6,2);
    abir1.print(a);
    //Rotating an array left
    abir1.rotateLeft(a);
    abir1.print(a);
    //Rotating an array right
    abir1.print(a);
    abir1.rotateRight(a);
    abir1.print(a);
  }
}