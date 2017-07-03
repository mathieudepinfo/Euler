import java.util.ArrayList;

public class Problem26 {

	/**
	 * @param args
	 */
	public static boolean contains(ArrayList<Integer> r,int key){
		for(int k=0;k<r.size();k++){
			if (r.get(k).intValue()==key){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxr=0;
		int maxd=0;
		for (int d=2 ; d<=1000 ; d++){
			int n=1;
			Integer r=new Integer(n%d);
			ArrayList<Integer> restes=new ArrayList<Integer>();
			
			while (contains(restes,(r.intValue()*10)%d)==false){
					n=r.intValue()*10;
					r=new Integer(n%d);
					restes.add(r.intValue());
					
				}
			if (restes.size()>maxr){
				maxr=restes.size();
				maxd=d;
			}
			
			}
			
		System.out.println("L'entier recherche est: "+maxd+" avec un cycle recurrent de "+maxr);
			
		}
	
		

	

}
