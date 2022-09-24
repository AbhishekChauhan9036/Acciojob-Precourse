//Gilad Oved
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Scanner lineScanner = new Scanner(in.nextLine()); //create a separate scanner for this line to get the two variables on the first line
		int n = lineScanner.nextInt();
		int k = lineScanner.nextInt();
		//allocate an array of integers since we now know the amount of scores we are storing
		int scores[] = new int[n];
		
		//add each new score to the array
		lineScanner = new Scanner(in.nextLine());
		for (int i = 0; i < n; i++) {
			scores[i] = lineScanner.nextInt();
		}
		
		//print the result of the method which will return how many people advance to the next round
		System.out.println(getNumberOfNextRounds(n, k, scores));
	}

	//returns the number of people that made it to the next round based on the rule that their score is positive and greater than the k-th place finisher's score
	public static int getNumberOfNextRounds(int n, int k, int[] scores)  {	
		int count = 0; //this will keep track of how many people will be advancing
		for (int i = 0; i < n; i++) { //iterate through every score in the contest
			if (scores[i] >= scores[k-1] && scores[i] > 0) { //if the score is >= the score of the k-th place finisher (the range of k is 1 to n, but we need it to be 0 to n-1 so that it is compatible with our array) and it is positive, add one.
				count++;
			}
		}
		
		return count;
	}
	
}