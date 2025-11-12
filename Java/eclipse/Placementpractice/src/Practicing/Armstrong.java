package Practicing;

public class Armstrong {

	public static void main(String[] args) {
		
				int a = 153;
				int sum =0;
				String b =a+"";
				int c = b.length();
				for(char d:b.toCharArray()) {
					int e = Integer.parseInt(d+"");
					int z =(int)Math.pow(e, c);
					sum = sum+z;
				}
				if(sum==(a))
				{
					System.out.println("Armstrong");
				}
				else {
					System.out.println("not armstrong");
				}
				
			}

		}