public class Q010_CHAR_CH_
{
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		int c=0;
		while(ch1!=ch2)
		{
			if(c==numberPerLine){System.out.println();c=0;}
			c++;
			System.out.print(" "+(char)ch1);
			ch1++;
		}
	}
	public static void main(String[] args)
	{
		char ch1 = '1';
		char ch2 = 'Z';
		int numberPerLine = 10;
	          Q010_CHAR_CH_.printChars(ch1, ch2, numberPerLine);
	}
}
