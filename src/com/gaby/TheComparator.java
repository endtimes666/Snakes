package com.gaby;

static class TheComparator implements Comparator<Snake> {
	 
    @Override
    public static int compare(Snake s1, Snake s2) {
        if(s1.getVenom() < s2.getVenom()){
            return 1;
        } else {
            return -1;
        }
    }
}

/*
	Rattlesnake, venom = 4
	Sea Snake, venom = 9
	Green Mamba, venom = 9
	Cobra, venom = 5
	Boa Constrictor, venom = 0
	Problem 2a: What if there is a tie between snakes with equal venom? 
	Please modify your program to sort snakes with equal venom 
	in alphabetical order, so Green Mamba is ahead of Sea Snake.
*/


	String species;
	double venomRating;
	
	public Snake(String s, double v){
		this.species = s;
		this.venomRating = v;
	}
	
public double getVenom() {
	return venomRating;
}

public String getSpecies() {
	return species;
}
	public static Snake addSnake(String s, double v) {
		//Snake snake = new Snake("Rattlesnake", 4.0);
		Snake rattler = new Snake(s, v);
		System.out.println(rattler.toString());
		return rattler;
	}

}