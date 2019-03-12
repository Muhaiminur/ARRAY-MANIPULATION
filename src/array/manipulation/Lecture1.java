package array.manipulation;
public class Lecture1{
  public static void main(String[]args){
    //Creating an array
    Object[]a={'m','u','h','a','i','m','i','n','u','r'};
    Object[]b=a;
    //Iterating over the elements of an array
    System.out.println("printng while loop");
    int c=0;
    while(c<a.length){
      System.out.println(a[c]);
      c++;
    }
    System.out.println("printing for loop");
    for(int c1=0;c1<a.length;c1++){
      System.out.println(b[c1]);
    }
    /*System.out.println("printng FOreach/new version");
    for(int value:a){
      System.out.println(value);
    }*/
    //Copying an array
    System.out.println("Copying an array 1st way");
    Object[] copy1=new Object[a.length];
    for(int d=0;d<copy1.length;d++){
      copy1[d]=a[d];
      System.out.println(copy1[d]);
    }
    System.out.println("Copying an array 2nd way");
    Object[] copy2=java.util.Arrays.copyOf(a,a.length);
    for(int d2=0;d2<copy2.length;d2++){
      copy2[d2]=a[d2];
      System.out.println(copy2[d2]);
    }
    //Resizing an array
    System.out.println("Resizing an array");
    Object[]newArray=new Object[14];
    for(int e1=0;e1<a.length;e1++){//copy krtese
      newArray[e1]=a[e1];
    }
    String s="abir";
    int count=0;
    for(int e2=a.length;e2<newArray.length;e2++){//add krtese
      newArray[e2]=s.charAt(count);
      count++;
    }
    for(int e3=0;e3<newArray.length;e3++){//print krtese
      System.out.println(newArray[e3]);
    }
    //Reversing an array
    System.out.println("Reversing an array 1st way");//ata reversse krtese
    Object[]tmpArray = new Object[a.length];
    int f1=0;
    int f2=a.length-1;
    while(f1<a.length){
      tmpArray[f2] =a[f1];
      f1++;
      f2--;
    }
    for(int f3=0;f3<a.length;f3++){
      a[f3]=tmpArray[f3];
      System.out.println(a[f3]);
    }
    System.out.println("Reversing an array 2nd way");//ata abr reverse k ager jaigai nitese
    int f4=0;
    int f5=a.length-1;
    while(f4<f5){
      Object tmp =a[f4];
      a[f4]=a[f5];
      a[f5]=tmp;
      f4++;
      f5--;
    }
    for(int f6=0;f6<a.length;f6++){
      System.out.println(a[f6]);
    }
    //Shifing an array left
    /*System.out.println("Shifing an array left");
    for(int g1=0;g1<a.length-1;g1++){
      a[g1]=a[g1+1];
      System.out.println(a[g1]);
    }
    a[a.length-1]=null;
  }
  //Shifing an array right
  System.out.println("Shifing an array right");
    for(int h=a.length-1;h>0;h--){
      a[h]=a[h-1];
      System.out.println(a[h]);
    }
    a[0]=null;
    for(int h2=0;h2<a.length;h2++){
      System.out.println(a[h2]);
    }
    //Inserting an element into an array
    System.out.println("Inserting an element into an array");
    int count2=5;
    for(int i1=a.length-1;i1>=count2;i1--){
      a[i1]=a[i1-1];
    }
    a[count2]='b';
    for(int i2=0;i2<a.length;i2++){
      System.out.println(a[i2]);
    }
    //Removing an element from an array
    System.out.println("Removing an element from an array");
    int count3=5;
    for(int j1=count3+1;j1<a.length;j1++){
      a[j1-1]=a[j1];
    }
    for(int j2=0;j2<a.length;j2++){
      System.out.println(a[j2]);
    }*/
    //Rotating an array left
    System.out.println("Rotating an array left");
    Object fake=a[0];
    for(int k1=1;k1<a.length;k1++){
      a[k1-1]=a[k1];
    }
    a[a.length-1]=fake;
    for(int k2=0;k2<a.length;k2++){
      System.out.println(a[k2]);
    }
    //Rotating an array right
    System.out.println("Rotating an array right");
    Object lastElement=a[a.length-1];
    for(int l1=a.length-1;l1>0;l1--){
      a[l1]=a[l1-1];
    }
    a[0]=lastElement;
    for(int l2=0;l2<a.length;l2++){
      System.out.println(a[l2]);
    }
  }
}