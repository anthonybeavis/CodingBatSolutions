public class Recursion1 {
	
	public static int factorial(int n) {
		 if(n==0){ 
		   return 1;
		 }
		 return n*(factorial(n-1));
	}
	
	public int bunnyEars(int bunnies) {
		 if(bunnies==0){
		    return 0; 
		  }
		    return 2+bunnyEars(bunnies-1); // Each bunny has two ears, and must be added to the next bunny in the list
	}
	
	public int fibonacci(int n) {
		 if(n==0){
		   return 0;
		 } 
		 else if(n==1){
		   return 1;
		 }
		 return fibonacci(n-1)+fibonacci(n-2); // return the sum of the previous two values. 
	}
	
	public int bunnyEars2(int bunnies) {
		 if(bunnies==0){
		   return 0;
		 }
		 else if(bunnies%2==0){
		   return 3+bunnyEars2(bunnies-1); // if an even bunny, count 3 ears
		 }
		 else{
		   return 2+bunnyEars2(bunnies-1); // otherwise count 3 ears
		 }
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
