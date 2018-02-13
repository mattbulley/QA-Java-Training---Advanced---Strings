
public class StringProcessing {
	public void PrintMessage1(String msg) {
		int i;
		for(i = 0; i < msg.length(); i++) {
			System.out.println(msg.substring(i, i+1));
		}
		
	}
	
	public int WordCount(String msg) {
		int i;
		int count = 0;
		for(i = 0; i <msg.length(); i++) {
			if(msg.substring(i, i+1).equals(" "))
				count++;	
		}
		
		count++;
		return count;
		
	}
	
	public void PrintMessage2(String msg) {
		int i;
		int count = 0;
		int[] indexes = new int[WordCount(msg)];

		for(i = 0; i < msg.length(); i++) {
			if(msg.substring(i, i+1).equals(" "))
			{
				count++;
				indexes[count] = i;
			}
		}
	
		for(i = 0; i < WordCount(msg) - 1; i++) {
			
			System.out.println(msg.substring(indexes[i], indexes[i+1]));
		}
		
		System.out.println();
		
		for(i = WordCount(msg) - 2; i >= 0; i--) {
			
			System.out.println(msg.substring(indexes[i], indexes[i+1]));
		}

	}
	
	public void FindAndReplace(String msg, String find, String replace) {
		char[] msgArray = msg.toCharArray();
		char[] findArray = find.toCharArray();
		int counter = 0;
		int index = 0;
		int indexEnd = 0;
		boolean match = false;
		int ltemp = 0;
		int temp = 0;
		
		for(int i = 0; i < msgArray.length; i++) {
			for(int j = temp; j < findArray.length; j++) {
				if(msgArray[i] == (findArray[j])) {
					if(counter == 0)
						index = i;
					match = true;
					
					//System.out.print(msgArray[i]); System.out.print(findArray[j]); System.out.println(counter); 
					counter++;
					
					
				} else {
					
					//System.out.print(msgArray[i]); System.out.print(findArray[j]);  System.out.println(counter);
					counter = 0;
					match = false;
					temp = 0;
				}
				
				
				
				if(match) {
					
					temp++;;
					break;
				}
			}
			
			if(counter == findArray.length) {
				System.out.println("Match found at: " + index);
				String replacedStr = msg.replaceAll(find, replace);
				System.out.println(replacedStr);
				break;
			}
		}
		
		
	}
	
	public void DrawGraph(String str1, String str2) {
		System.out.println("  S U B L I M E");
		System.out.println("L * * * 3 * * *");
		System.out.println("I * * * * 4 * *");
		System.out.println("M * * * * * 5 *");
		System.out.println("M * * * * * * 6");
	}
}
