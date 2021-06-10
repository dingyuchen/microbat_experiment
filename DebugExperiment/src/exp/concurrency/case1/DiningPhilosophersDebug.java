/**
 * 
 */
package exp.concurrency.case1;

/**
 * @author knightsong
 *
 */
public class DiningPhilosophersDebug {
	public static void main(String[] args) {
		int n = 5;
		int m = 1000;
		if (args.length > 0) {
			n = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
		}
		
		Fork fork = new Fork(n);
		for (int i = 0; i < n; i++) {
			new Philosopher(String.valueOf(i), fork, m).start();
		}
    }
}
