package com.javalec.bubble_insertion;

public class Main {

//main
  
  public static void main(String[] args) {

      Sorting myBubble = new Sorting();        //declare a new instance for bubble sort
      Sorting myInsertion = new Sorting();    //declare a new instance for insertion sort
      
      myBubble.BubbleSort(); //bubble sort
      
      myInsertion.InsertionSort(); //insertion sort
  }

}

