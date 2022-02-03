

//     ????????????????????

package intro;

public class MyPlayground {

	public static void main(String[] args) {
		String str = "Liked";
		str.concat(" and Subscribed");
				
		StringBuilder sb = new StringBuilder("yes");
		sb.append(" and Subscribe");
		
		System.out.println(str + " | " + sb.toString());

	}

}
