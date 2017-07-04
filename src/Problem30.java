
public class Problem30 {
	
	
	public static void main(String[] args){
		
		for(int i=2;i<1000000;i++){
			
			String j=""+i;
			int sum=0;
			for(int k=0;k<j.length();k++){
				
				sum+=Math.pow(Character.getNumericValue(j.charAt(k)),5);
				
				
			}
			if (sum==i){
				System.out.println(Integer.parseInt(j));
				
			
			}
			
		}
	}
}
