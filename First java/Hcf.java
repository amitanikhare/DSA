//find HCF/GCD among two number
class Hcf{
  public static void main (String[]args){
    int n1 = 65;
    int n2 = 10;
    int hcf = 0;
    for (int i = 1; i <= n1 || i <= n2; i++){
        if (n1 % i == 0 && n2 % i == 0){
            hcf = i;
        }
    }
    System.out.println ("HCF of given two numbers is ::" + hcf);
  }
}
