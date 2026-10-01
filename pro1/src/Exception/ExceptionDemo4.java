package Exception;

import java.util.Scanner;

public class ExceptionDemo4 {
	
	public void passcheck(String pass)throws PasswordInvalid{
		String p;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Password");
		p=sc.next();
		if(pass.equals(p)) {
			System.out.println("login successful");
		}
		else {
			throw new PasswordInvalid("Invalid password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo4 e = new ExceptionDemo4();
			e.passcheck("Admin");
		}
		catch (PasswordInvalid e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
