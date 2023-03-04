public class ArmstrongNumber{
	public static void main(String args[]){
		int a=0,b,temp; 
		int n=153; temp=n;
		while(n>0){ 
			b=n%10;
            n=n/10;
            a=a+(b*b*b); 
            }
		if(temp==a) 
			System.out.println(temp+"is Armstrong number");
		else 
			System.out.println(temp+"is not a Armstrong number");
		}    
	}

