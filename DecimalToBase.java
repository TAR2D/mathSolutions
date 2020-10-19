//Help you with converting decimal to base. Not for practicing. Just to save some time.
public class DecimalToBase{
	public static void main(String[] args){
		int base = 16;
		int decimalNum = 6923;
		decToBase(decimalNum,base);
	}

	public static void decToBase(int decNumb, int base){
		int remainder = decNumb % base;
		int temp = decNumb/base;
		if(decNumb != 0){
			if(remainder > 9 && remainder < 16){
			char c = (char)(remainder + 55);
			System.out.println(decNumb + " = "+ base + "*" + temp+ " + "+ c);
			}else{ System.out.println(decNumb + " = "+ base + "*" + temp+ " + "+ remainder);
			}
			decNumb = base*temp;
			decToBase(temp,base);
		}
	}
}
