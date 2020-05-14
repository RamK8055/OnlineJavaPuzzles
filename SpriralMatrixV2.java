public class SpriralMatrixV2 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		int count = 0;
		for(int i =0;i< a.length; i++)
			for(int j =0;j<a[0].length;j++)
				a[i][j] = ++count;
		
		System.out.println("Given Matrix: ");
		for(int i =0;i< a.length; i++){
			for(int j =0;j<a[0].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Spiral Matrix: ");
		int is = 0, ie = a.length-1;
		int js = 0, je = a[0].length-1;
		while(true){
			// Right traverse on Top
			for(int j = js; j <= je; j++)
				System.out.print(a[is][j]+" ");
			is++; 
			if(je < js) break;
			
			
			// Down traverse on Last
			for(int i = is; i <= ie; i++)
				System.out.print(a[i][je]+" ");
			je--; 
			if(ie < is) break;
			

			// Left traverse on Bottom
			for(int j = je; j >= js; j--)
				System.out.print(a[ie][j]+" ");
			ie--; 
			if(je < js) break;
			

			// Up traverse on Front
			for(int i = ie; i >= is; i--)
				System.out.print(a[i][js]+" ");
			js++; 
			if(ie < is) break;
		}
	}
}

/*
	Tested scenarios -> int[][] a = new int[3][3];
	1x1, 2x2, 3x3, 4x4, 5x5
	1x5, 2x5, 3x5, 4x5
	1x4, 2x4, 3x4
	5x1, 5x2, 5x3, 5x4
	4x1, 4x2, 4x3
*/
