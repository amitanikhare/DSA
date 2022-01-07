//find lcm among two number.
class Lcm {
    public static void main(String[] args) {
        int n1 =4;
        int n2= 6;
        int max;
        if(n1>n2){
            max = n1;
        }else{
            max= n2;
        }
        while(true) {
      if( max % n1 == 0 && max % n2 == 0 ) {
        System.out.printf("The LCM is = "+max);
        break;
      }
      max++;
    }
  }
}
