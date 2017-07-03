import java.util.TreeSet;


public class Problem29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Double> x= new TreeSet<Double>();
			for(int a=2;a<=100;a++){
				for(int b=2;b<=100;b++){
					x.add((double)Math.pow(a,b));
					System.out.println(a+" "+b);
				
					
				}
			}
		System.out.println(x.size());
		
	}

}
