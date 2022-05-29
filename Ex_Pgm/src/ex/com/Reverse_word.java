package ex.com;

public class Reverse_word {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		//str.substring("i", ".");
		String[] str2 = str.split("\\.");
		String rev =str2[str2.length-1];
		for(int i=str2.length-2;i>=0;i--) {
			rev = rev+"."+str2[i];
		}
		
		System.out.println(str2.length);
		System.out.println(rev);
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);
//		System.out.println(sb.reverse());
	}

}
