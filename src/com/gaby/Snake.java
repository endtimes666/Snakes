package com.gaby;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Snake {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		LinkedList<Snake> snakeList = new LinkedList<Snake>();
		Snake rattler = Snake.addSnake("Rattlesnake", 4.0);
		snakeList.push(rattler);
		Snake seaSnake = Snake.addSnake("Sea Snake", 9.0);
		snakeList.push(seaSnake);
		Snake greenMamba = Snake.addSnake("Green Mamba", 9.0);
		snakeList.push(greenMamba);
		Snake cobra = Snake.addSnake("Cobra", 5.0);
		snakeList.push(cobra);
		Snake boa = Snake.addSnake("Boa Constrictor", 0.0);
		snakeList.push(boa);
		
		TheComparator comp = new TheComparator();
		Collections.sort(snakeList, comp);
		
		for(Snake s : snakeList)
		    {
		    	System.out.println(s);
		    }
	}