package leetcodeProblems;

public class ZigzagConversion {
	
	public String convert(String s, int numRows) {
		int length = s.length();
        
        if(numRows > length || numRows <= 1){
            return s;
        }
        
        char[] zigzag = new char[length];
        int count=0;
        int interval = 2*numRows - 2;
        for(int i=0;i<numRows;i++){
            int step = interval - 2*i;
            for(int j=i;j<length;j+=interval){
                zigzag[count] = s.charAt(j);
                count++;
                
                if(step>0 && step<interval && j+step<length){
                    zigzag[count] = s.charAt(j+step);
                    count++;
                }
            }
        }
        return new String(zigzag);
    }
	
	public static void main(String[] args) {
		String s1 = "PAYPALISHIRING"; 
		int numRows1 = 3;
		String s2 = "PAYPALISHIRING";
		int numRows2 = 4;
		String s3 = "A";
		int numRows3 = 1;
		ZigzagConversion zc = new ZigzagConversion();
		System.out.print(zc.convert(s1, numRows1));
	}
	
}
