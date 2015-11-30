/*You’d like to store Snake objects in a list, most venomous first. 
Please modify Snake so that you can use Collection.sort on a LinkedList of Snake objects. 
You should be able to add Snakes to the list in any order,
but the list will sort them in the desired order.
Write a program to test your code. Here’s some snake data to test with:
Rattlesnake, venom = 4
Sea Snake, venom = 9
Green Mamba, venom = 9
Cobra, venom = 5
Boa Constrictor, venom = 0
Problem 2a: What if there is a tie between snakes with equal venom? 
Please modify your program to sort snakes with equal venom 
in alphabetical order, so Green Mamba is ahead of Sea Snake.*/

package com.gaby;

class Snake {
String species;
double venomRating;
public Snake(String s, double v){
this.species = s;
this.venomRating = v;
}
}

