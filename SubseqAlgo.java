import java.util.*;
public class SubseqAlgo 
{
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="";
		String str2="";
		Scanner scan=new Scanner(System.in);
		str1=scan.readLine();
		str2=scan.readLine();
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		String res="";
		String[] strarr1=str1.split("");
		String[] strarr2=str2.split("");
		//int str1len=strarr1.length;
		for(int l=1;l<strarr1.length;l++)
		{
			String teststr1=strarr1[l];
			int count=1;
			int str2len=strarr2.length;
			int reslen=res.length();
		for(int i=l;i<strarr1.length;i++)
		{
			if(count>1)
			teststr1=teststr1+strarr1[i];
			for(int j=1;j<str2len;j++)
			{
				
				//System.out.println(teststr1);
				String teststr2=strarr2[j];
				//System.out.println(teststr2);
				if(count>1)
				{
					int a=j;
					for(int k=1;k<count;k++)
					{
						//teststr1=teststr1+strarr1[i];
						if(count<strarr2.length)
						{
							teststr2=teststr2+strarr2[++a];
						}
					}
				//System.out.println(teststr1);
				//System.out.println(teststr2);
				}					
					if(teststr1.equals(teststr2))
					{
						if(teststr1.length()>reslen)
						{
						res=teststr1;
						reslen=res.length();
						//System.out.println("Res="+res);
						}
					}
			}
			count++;
			str2len--;
		}
		}
		System.out.println("Result= "+res);
}
}
