/*remove() method: */

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx6 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shital");
		names.add("Ankita");
		names.add("Sank");
		names.add("Shital");

		//System.out.println(names);
		//System.out.println(names.size());
		//System.out.println(names.get(names.size() - 1));
		
		System.out.println(names.remove(1));
		System.out.println(names.remove("Shital"));
		System.out.println(names);

}
}

