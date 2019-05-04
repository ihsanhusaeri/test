import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.print("masukan lebar/tinggi gambar: ");
		int lebar = input.nextInt();
		boolean ganjil = (lebar % 2) != 0;
		if(ganjil){
			cetakGambar(lebar);
		}else{
			System.out.println("lebar/tinggi harus ganjil");
		}
    }
	private static void cetakGambar(int lebar){
		for(int i=0; i < lebar; i++){
			boolean tengah = i == (lebar/2);
			if(tengah){
				for(int j=1; j <= lebar; j++){
					if(j ==1){
						System.out.print("* ");
					}else if(j == lebar){
						System.out.print(" *");
					}else{
						System.out.print(" * ");
					}
				}
				System.out.println();
			}else{
				for(int j=1; j <= lebar; j++){
					if(j == 1){
						System.out.print("* ");
					}else if(j == lebar){
						System.out.print(" *");
					}else{
						System.out.print(" = ");
					}	
				
				}
				System.out.println();
			}
			
		}
	}
}