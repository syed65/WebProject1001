
public class NestedLoop {

	public static void main(String[] args) {
		for( int i=5; i>1;i--)
		{
			for( int j=i; j>=1;j--)
			{
				System.out.print(" P (" + i + ", " +j +")=");
				System.out.print(P(i,j) + "   ");
			}
			System.out.println();
		}
	}
		static long P (int x,int y)
		{
			return F(x)/F(x-y);
		}
			static long F(int z) 
			{
				long f= 1;
				while (z>1)
				{
					f = f*z;
					z--;
				}
				return f;
			}
}
	


