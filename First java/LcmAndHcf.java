//find lcm and hcf in b/w two number
public class LcmAndHcf{
	public static void main(String[] args) {
    int n1 = 65;
    int n2 = 10;
    int hcf = 0;
    int lcm;
    for (int i = 1; i <= n1 || i <= n2; i++){
        if (n1 % i == 0 && n2 % i == 0){
            hcf = i;
        }
    }
    System.out.println ("HCF of given two numbers is ::" + hcf);
		
		lcm = (n1*n2)/hcf;
		System.out.println ("LCM of given two numbers is ::" + lcm);
	}
}
