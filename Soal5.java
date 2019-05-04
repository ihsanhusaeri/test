import java.util.Scanner;
public class Soal5{
	private static final String ABJAD_ANGKA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input jumlah baris: ");
		int jumlahBaris = input.nextInt();
		
		String[] string = new String[jumlahBaris];
		cetak(jumlahBaris, string);
	}
	private static void cetak(int baris, String[] s){
		int index=0;
		String[] string = s;
		boolean adaStringSama = false;
		while(index < baris){
			string[index] = generateString();
			for(int i=0;i<index;i++){
				for(int j=i+1;j<index;j++){
					if (string[i].equals(string[j])) {
						adaStringSama=true;
					}
				}
			}
			if(adaStringSama == false){
				System.out.println(string[index]);
				index++;
			}
		}
	}
	private static String generateString(){
		StringBuilder string = new StringBuilder();
		for(int j=0; j < 32; j++){
			int character = (int)(Math.random()*ABJAD_ANGKA.length());
			string.append(ABJAD_ANGKA.charAt(character));
				
		}
		return string.toString();
	}
	
}
