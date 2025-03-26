package studio7;

public class Die {
 private int sides;
 
 public Die(int insides) {
	 this.sides=insides;
 }
 public int randomnum() {
	 return (int)(Math.random()*sides)+1;
 }
	public static void main(String[] args) {
		Die A=new Die(6);
		System.out.print(A.randomnum());
		// TODO Auto-generated method stub

	}

}
