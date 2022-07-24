import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BackBone {

	private Queue<String> list1 = new LinkedList<>();
	private Queue<String> list2 = new LinkedList<>();
	private Queue<String> list3 = new LinkedList<>();
	private Queue<String> list4 = new LinkedList<>();
	private Queue<String> list5 = new LinkedList<>();

	private ArrayList<Queue<String>> bone = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void feedBack(int feedback, String word, int listType) {
		switch (feedback) {
		case 0:
			break;
		case -1:
			break;
		case 1:
			break;
		default:

		}
	}

	public String nextWord() {
		Random random = new Random();
		String returnValue = new String();
		int x = random.nextInt(100);
		if (x >= 39) {
			returnValue = list1.peek();
		} else if (x >= 59) {
			returnValue = list2.peek();
		} else if (x >= 79) {
			returnValue = list3.peek();
		} else if (x >= 89) {
			returnValue = list4.peek();
		} else {
			returnValue = list5.peek();
		}
		return returnValue;
	}

	public static void pickList() {
		boolean s = true;
	}

}
