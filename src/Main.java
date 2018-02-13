
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringProcessing st = new StringProcessing();
		
		String str = " I am going to london tomorrow to go and see the sights ";
		st.PrintMessage2(str);
		int wordcount = st.WordCount(str);
		System.out.println("'" + str + "'" + " has " + (wordcount-2) + " words in it.");
		
		st.FindAndReplace("I am going to london", "london", "Manchester");
	}
}
