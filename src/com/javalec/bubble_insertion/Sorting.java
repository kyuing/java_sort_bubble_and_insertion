package com.javalec.bubble_insertion;

//sort class

import java.util.Arrays;

public class Sorting {

  private int[] myArray = new int[5];    //a test array
  private int i;    //let's use i as a class level
  
  public Sorting() {
      //default constructor
      
      for(i=0;i<myArray.length;i++) {
      
          //assume the worst case
          myArray[i] = 5-i;    //store in descending order for ascending sort 
//          myArray[i] = i+1;    //store in ascending order for descending sort
      
      }        
  }
  
  public void BubbleSort() {
      
      int inner, outer, temp;

      System.out.println("The array stored is : " + Arrays.toString(myArray));
      System.out.println("\nBubble sort result");
      
      /*The OUTER loop is the counter for the number of times the INNER loop is executed.
      stop at the 2nd last item, because by default the last item must be sorted*/
      for (outer=0;outer<myArray.length-1;outer++) {
          
          for (inner=0; inner<myArray.length-outer-1;inner++) {
              /* myArray.length-1: its result is the same as myArray.length-outer-1. 
                 But its process can be unnecessary as its process checks the index that is already sorted*/
              
              //myArray.length-outer-1: stops when getting to the piece that is already sorted which is more efficient than myArray.length-1 
              
              //swap  if in the wrong order
              if ( myArray[inner] > myArray[inner+1]) {// ASCENDING order
//                  ( myArray[inner] < myArray[inner+1]) {// DESCENDING order
                  
                  temp=myArray[inner];
                  myArray[inner]=myArray[inner+1];
                  myArray[inner+1] = temp;                        
              }
          }
          //print the result
          System.out.println(outer+1 + " pass: " + Arrays.toString(myArray));
      }
      
  } //end the bubble sort method
  
  
  public void InsertionSort() {
      
      int i,j;
      int curr; //the current item you are looking at
      
      System.out.println("\n\nThe array stored is : " + Arrays.toString(myArray));
      System.out.println("\nIntertion sorting result");
      
      // go through the array element by element 
      for (i=1; i<myArray.length; i++) {
          
          //i start from 1 assuming that all the left itmes are sorted
          //current item is just to the right of the sorted area
          curr = myArray[i];
          j = i-1; // the size of the sorted part
          
          
          /* while the current one is smaller than each of the elements in the sorted part, 
             move the sorted bits to the right. Then when we stop, stick the current item in*/
          while (j>=0 && myArray[j] > curr) {     //ASCENDING order
//          while (j>=0 && myArray[j] < curr) {     //DESCENDING order
              
              
              myArray[j+1] = myArray[j]; // move the sorted bits out of the way           
              j = j-1; // keep looking at the previous one and moving it out of the way too, if needed   
          }
          
          myArray[j+1] = curr; // stick in the 'unsorted' one; insert the current item into the right place
          System.out.println(i + " pass: " + Arrays.toString(myArray));    
      }
      
  } // end the insertion sort method
}
