
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String username = input.nextLine();
        System.out.print("Masukan password: ");
        String password = input.nextLine();
		boolean usernameValid = isUsernameValid(username);
        boolean passwordValid= isPasswordValid(password);
		if(usernameValid == true && passwordValid == true){
            System.out.println("username dan password valid");
        }else{
            //System.out.println("Password invalid!\nPassword harus memiliki minimal 8 karakter dan  mengandung karakter spesial, angka, huruf kapital, dan huruf kecil");
			System.out.println("username dan password invalid!");
        }
		
    }
	private static boolean isUsernameValid(String username){
		boolean adaKapital = !username.equals(username.toLowerCase());
        boolean adaHurufKecil = !username.equals(username.toUpperCase());
		boolean adaKarakter = !username.matches("[A-Za-z0-9 ]*");
		boolean adaAngka = !username.matches(".*\\d+.*");
		
		if(username.length() != 8){
			return false;
		}
		if(adaKapital){
			return false;
		}
		if(adaKarakter){
			return false;
		}
		if(!adaAngka){
			return false;
		}
		return true;
	}
    private static boolean isPasswordValid(String password){
        
        boolean adaKapital = !password.equals(password.toLowerCase());
        boolean adaHurufKecil = !password.equals(password.toUpperCase()); 
        boolean adaKarakter   = !password.matches("[A-Za-z0-9 ]*");
		boolean adaAngka = !password.matches(".*\\d+.*");
        if(password.length()<8){
            return false;
        }
        if(!adaKapital){
           // System.out.println("Password harus memiliki minimal satu huruf kapital");
            return false;
        }
        if(!adaHurufKecil){
            //System.out.println("Passoword harus memiliki minimal satu huruf kecil");
            return false;
        }
        if(!adaKarakter){
           // System.out.println("Password harus memiliki satu karakter spesial");
            return false;
        }
        if(adaAngka){
            //System.out.println("Password harus memiliki satu karakter angka");
            return false;
        }
        return true;
    }
}