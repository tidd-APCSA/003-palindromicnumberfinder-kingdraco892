public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int temp = num + 1;
      while(testPalindromicNum(temp) == false){
        temp++;
      }
      return temp-num;
      

    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
       
      if( reverseNum(num).equals(String.valueOf(num))){
        return true;
      }else{
        return false;
      }
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        int reverse = 0;
       
       while(num !=0){
        int temp = num % 10;
        reverse = reverse * 10 + temp;
        num /= 10;
        
      }
      return String.valueOf(reverse); 

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
