package com.tnsif.Day16.VectorClass;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	 public static void main(String[] args)
	    {
	        Queue<Integer> q
	            = new LinkedList<>();
	 
	        
	        for (int i = 0; i < 5; i++)
	            q.add(i);
	 
	       
	        System.out.println("Elements of queue "
	                           + q);
	 
	        int removedele = q.remove();
	        System.out.println("removed element-"
	                           + removedele);
	 
	        System.out.println(q);
	 
	        // To view the head of queue
	        int head = q.peek();
	        System.out.println("head of queue-"
	                           + head);
	 
	        // Rest all methods of collection
	        // interface like size and contains
	        // can be used with this
	        // implementation.
	        int size = q.size();
	        System.out.println("Size of queue-"
	                           + size);
	    }

}

