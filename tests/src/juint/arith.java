package juint;

public class arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public int somme (int a, int b) {
	return a+b;
}
public int difference (int a, int b) {
	return a-b;
}
public int multiplication (int a, int b) {
	return a*b;
}
public int incrementer (int a) {
	return a+1;
}
public int decrementer (int a) {
	return a-1;
}
public boolean comparer(int a, int b) {
	if (a>=b) return true;
	else return false;
}
public boolean pair (int a) {
	if(a%2==0) return true;
	else return false;
}

}
