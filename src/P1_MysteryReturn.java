/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  // We had no idea where to start with guessing, so we ended up running the program and working backwards through the problem.
   * 
  //Notes on how to do it for future use: on each line of code, the vars in the () up top are actually assigned in the same order that they are shown but at the bottom,
   * so on the first line, z = mystery (x,z,y) is actually having x=z, z=x, and y=y in the bottom function.
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 We were not correct because we did not have an educated guess as to what to do.
 
 */
public class P1_MysteryReturn {
	public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }

}
