
public class Reverse_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " kamabalapalli sudha Reddy ";
		
		 String[] word = str.split(" ");
		 
		 for(int i = word.length-1;i>0;i--)
		 
		 {
			 System.out.print(word[i]+" ");
			
		 }
       
		// Reverse Charecter 
		 
		 String s = " kambala reddy sudha";
		 
		 String temp = " ";
		 
		 for(int i = s.length()-1;i>0;i--)
			 
	     temp = temp+ s.charAt(i);
		 
		 System.out.println(temp);
			 
	}

}
