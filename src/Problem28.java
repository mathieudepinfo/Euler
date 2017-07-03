
public class Probleme28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u0=1;
		int v0=1;
		int sum=u0;
		for(int i=1;i<1001 ;i++){
			u0=u0+2*i;
			if(i%2==0){
				v0=v0+2*i;
		
			}
			else{
				v0+=4*(i+1)/2;
			}
			System.out.println(u0+" "+v0);
			sum+=(v0+u0);
		}
		
		System.out.println(sum);
	}

}
