public class Magic {
	public static void main(String[] args) {

    // This little program does a bunch of math witchery to always return the same number no matter what myNumber is
    
    int myNumber = 12;
		int stepOne = (myNumber * myNumber);
		int stepTwo = (stepOne + myNumber);
    int stepThree = (stepTwo / myNumber);
    int stepFour = (stepThree + 17);
    int stepFive = (stepFour - myNumber);
    int stepSix = (stepFive / 6);
     // this code prints out the number 3
    System.out.println(stepSix);
	}
}