package StringTopic;

public class SegregateAlphaNumberSpecialChar {

	public static void main(String[] args) {
		String st="a2B*C5?d";
		String alpha=" ";
		String num=" ";
		String spe=" ";
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length()-1;i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
			{
				alpha=alpha+ch[i];
			}
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				num=num+ch[i];
			}
			else
			{
				spe=spe+ch[i];
			}
		}
		System.out.println(alpha+" "+num+" "+spe);
	}

}
