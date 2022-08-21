
class Main {
 
  public static void main(String[] args) {
    int array[] = {16, 8, 24, 4};
    int result = array[0];
 
    //Loop through the array and find GCD
    //by combining the GCD of previous numbers 
    for(int i=1; i<array.length; i++){
      result = findGCD(array[i], result);
    }
    System.out.print("GCD: "+result);
  }
 
  //function to find GCD of two numbers
  public static int findGCD(int a, int b){
    if(b == 0)
      return a;
    return findGCD(b, a%b);
  }

}
