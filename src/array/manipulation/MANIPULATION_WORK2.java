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
public class MANIPULATION_WORK2 {
    Object[]a;
  MANIPULATION_WORK2(){
  }
  //Creating an array
  public void Creatingarray(int size){
    System.out.println("============Creating for loop=========)");
    a=new Object[size];
    /*Now a refers to an array of 100 integer references
     array doesn't actually contain the objects but rather hold the references to the objects*/
    Object[]x=a;
    /*here x refer the array addreess of a*/
    System.out.println("Array creating done");
  }
  //Iterating over the elements of an array
  public void Iterating(){
    System.out.println("============Printing while loop=========)");
    int c=0;
    while(c<a.length){
      System.out.print(a[c]+" , ");
      c++;
    }
    System.out.println("============Printing for loop=========)");
    for(int d=0;d<a.length;d++){
      System.out.print(a[d]+" , ");
    }
      System.out.println("");
  }
  //Copying an array(normal way)
  public static Object[]copyArray1(Object[]source){
    System.out.println("============Copying an array(normal way)=========)");
    //we cannot write copyarray=source cause it copy onlu reference
    Object[]copyArray1=new Object[source.length];
    for(int c=0;c<copyArray1.length;c++){
      copyArray1[c]=source[c];
    }
    return copyArray1;
  }
  //Copying an array(second way) bulit in method
  public static Object[]copyArray2(Object[]source){
    Object[]copy=java.util.Arrays.copyOf(source, source.length);
    return copy;
  }
  //Resizing an array
  public static Object[]resize(Object[]oldArray,int newCapacity){
    System.out.println("============Array resizing=========)");
    Object[]newArray=new Object[newCapacity];
    for(int c=0;c<oldArray.length;c++){
      newArray[c]=oldArray[c];
    }
    return newArray;
  }
  //Reversing an array
  public static void reverse(Object[]array){
    System.out.println("============Array reverse=========)");
    for(int c=0,d=array.length-1;c<d;c++,d--){
      Object temp=array[c];
      array[c]=array[d];
      array[d]=temp;
    }
  }
  //Shifing an array left
  public static void shiftLeft(Object[]array){
    System.out.println("============Array shiftLeft=========)");
    for(int c=1;c<array.length;c++){
      array[c-1]=array[c];
    }
    array[array.length-1]=null;//helping garbage colletore forremove
  }
  //Shifing an array right
  public static void shiftRight(Object[]array){
    System.out.println("============Array shiftRight=========)");
    for(int c=array.length-1;c>0;c--){
      array[c]=array[c-1];
    }
    array[0]=null;
  }
  //Inserting an element into an array
  public static void insert(Object[]array,int size,Object elem,int index){
    System.out.println("============Inserting=========)");
    if(size==array.length){
      throw new RuntimeException("no space left");
    }else{
      for(int c=size;c>=index;c--){
        array[c+1]=array[c];
      }
      array[index]=elem;
    }
  }
  //Removing an element from an array
  public static void remove(Object[]array,int size,int index){
    System.out.println("============remove=========)");
    for(int c=index+1;c<size;c++){
      array[c-1]=array[c];
    }
    array[size-1]=null;
  }
  //Rotating an array left
  public static void rotateLeft(Object[]array){
    System.out.println("============rotateLeft=========)");
    Object temp=array[0];
    for(int c=1;c<array.length;c++){
      array[c-1]=array[c];
    }
    array[array.length-1]=temp;
  }
  //Rotating an array right
  public static void rotateRight(Object[]array){
    System.out.println("============rotateRight=========)");
    Object temp=array[array.length-1];
    for(int c=array.length-1;c>0;c--){
      array[c]=array[c-1];
    }
    array[0]=temp;
  }
    
        
      
  //thisss is for print
  public void print(Object[]p){
    for(int c=0;c<p.length;c++){
      System.out.print(p[c]+" , ");
    }
      System.out.println("");
  }
}
