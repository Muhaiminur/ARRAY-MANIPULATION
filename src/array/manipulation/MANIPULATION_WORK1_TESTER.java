/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.manipulation;

/**
 *
 * @author ITCLANBD
 */
public class MANIPULATION_WORK1_TESTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MANIPULATION_WORK1 work=new MANIPULATION_WORK1();
        Object[] a={7,8,10,44,2,11,23,3};
        System.out.println("Array before");
        work.print(a);
        System.out.println("");
        //shift array
        System.out.println("New array after 2 Left shifting");
        work.shiftLeft(a,a.length,2);
        work.print(a);
        System.out.println("");
        // k-position left rotate (linear array)
        System.out.println("New array after Left rotate");
        work.Leftrotate(a,3);
        work.print(a);
        System.out.println("");
        // k-position right rotate (linear array)
        System.out.println("New array after 3 Right rotate");
        work.Rightrotate(a,3);
        work.print(a);
        System.out.println("");
        //public static void insertUnique(Object[] a, int size, Object elem, int idx)
        System.out.println("New array after Insert Unique in array");
        work.insertUnique(a, 4, 9, 2);
        work.print(a);
        System.out.println("");
        //Print Reverse
        System.out.println("Printing Reverse");
        work.printReverse(a,5);
        System.out.println("");
        //searching in array
        System.out.println("Search In array");
        System.out.println(work.search(a,8,99));
        System.err.println("");
    }
    
}
