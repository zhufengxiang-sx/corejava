package cp3;

public class Break {
	public static void main(String[] args) {
		label:
		for(int n=0; n<5; n++){
			for(int i=0; i<5; i++){
				System.out.println(i);
				if(n*i == 9){
					break label;
				}
			}
		}
		System.out.println("hello!");
	}
}
