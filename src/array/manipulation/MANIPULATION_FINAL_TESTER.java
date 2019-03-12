package array.manipulation;

import java.util.Scanner;

public class MANIPULATION_FINAL_TESTER {

    public static void main(String[] args) {
        Scanner abir = new Scanner(System.in);
        try {

            MANIPULATION_FINAL abir1 = new MANIPULATION_FINAL();
            Object[] a = {5, 3, 9, 13, 2};
            Object[] a1 = new Object[10];
            a1[0] = 7;
            a1[1] = 13;
            a1[2] = 5;
            a1[3] = 20;
            a1[4] = 19;
            //Creating an array
            System.out.println("============Creating ARRAY=========)");
            a1 = abir1.CreatingArray();
            abir1.IteratingArray(a1);
            //Iterating over the elements of an arrayir1.
            System.out.println("============Printing ARRAY=========)");
            abir1.IteratingArray(a);
            //Copying an array
            System.out.println("============Copying an array=========)");
            Object[] copy = abir1.CopyArray(a);
            abir1.IteratingArray(copy);
            //Resizing an array
            System.out.println("============Array resizing=========)");
            Object[] resize = abir1.ResizeArray(a, 8);
            abir1.IteratingArray(resize);
            //Reversing an array
            System.out.println("============Array Reverse 1=========)");
            Object[] Revers = abir1.ReversArray1(a);
            abir1.IteratingArray(Revers);
            System.out.println("============Array reverse 2=========)");
            Revers = abir1.ReversArray2(a);
            abir1.IteratingArray(Revers);
            //Shifing an array left
            //old is  [5, 3, 9, 13, 2] 
            // after will [3, 9, 13, 2, -]
            System.out.println("============Array shiftLeft=========)");
            Object[] Left_Shift = abir1.ShiftArrayLeft(a);
            abir1.IteratingArray(Left_Shift);
            //Shifing an array right
            //Before [5, 3, 9, 13, 2]
            //after [-, 5, 3, 9, 13]
            System.out.println("============Array shiftRight=========)");
            Object[] Right_Shift = abir1.ShiftArrayRight(a);
            abir1.IteratingArray(Right_Shift);
            //Inserting an element into an array
            System.out.println("============Inserting=========)");
            //public static void insertUnique(Object[] a, int size, Object elem, int idx)
            Object[] insert = abir1.InsertElement(a1, a1.length - 1, 55, 0);
            abir1.IteratingArray(insert);
            //Removing an element from an array
            System.out.println("============remove=========)");
            Object[] remove = abir1.RemoveElement(a, 5, 3);
            abir1.IteratingArray(remove);
            //Rotating an array left
            System.out.println("============RotateLeft=========)");
            //before [5, 3, 9, 13, 2] 
            //after [3, 9, 13, 2, 5]
            Object[] Left_rotate = abir1.RotateArrayLeft(a);
            abir1.IteratingArray(Left_rotate);
            //Rotating an array right
            System.out.println("============rotateRight=========)");
            //Before  [5, 3, 9, 13, 2]
            //after [2, 5, 3, 9, 13]
            Object[] Right_rotate = abir1.RotateArrayRight(a);
            abir1.IteratingArray(Right_rotate);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
