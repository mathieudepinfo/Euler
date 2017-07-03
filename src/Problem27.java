
public class Problem27 {

	/**
	 * @param args
	 */
	public static boolean estpremier(int p){
		int ap=Math.abs(p);
		
		for(int i=2;i<Math.sqrt(ap);i++){
			if(ap%i==0){
				return false;
			}
		
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nmax=0;
		int ares=0;
		int bres=0;
		
		for (int a=-999;a<1000;a+=2){
			for (int b=-999;b<1000;b+=2){
				int n=0;
			
				while(estpremier(n*n+a*n+b)){
					n+=1;
				}
				if(n>nmax){
					nmax=n;
					ares=a;
					bres=b;
					System.out.println(n+" "+ares+" "+bres);
				
				}
			}
		}
		System.out.println(ares*bres);
	}

}
