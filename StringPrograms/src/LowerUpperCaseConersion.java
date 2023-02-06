
public class LowerUpperCaseConersion {

	public static void main(String[] args) {
		String s1="ineuron";
		String s2="";
		String s3="";
		
		System.out.print("upper case conversion of ineuron is: ");
		for(int i=0;i<s1.length();i++)
		{
			s2+=(char)(s1.charAt(i)-32);
		}
         System.out.print(s2);
         
         System.out.println();
           
         System.out.print("lower case conversion of INEURON is: ");
 		for(int i=0;i<s2.length();i++)
 		{
 			s3+=(char)(s2.charAt(i)+32);
 		}
          System.out.print(s3);
	}

}
