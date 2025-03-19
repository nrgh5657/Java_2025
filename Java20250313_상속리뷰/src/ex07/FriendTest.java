package ex07;

public class FriendTest {

	public static void main(String[] args) {

		Friend f [] = new Friend[5];
		f[0] = new Friend("xxx","010-0000-0000","qwer123@gmail.com");
		f[1] = new Friend("qqq","010-0000-0000","asdf123@gmail.com");
		f[2] = new Friend("ttt","010-0000-0000","zxcv123@gmail.com");
		f[3] = new Friend("zzz","010-0000-0000","wasd123@gmail.com");
		f[4] = new Friend("www","010-0000-0000","zxc123@gmail.com");
		
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i].getInfo());
		}
	}

}
