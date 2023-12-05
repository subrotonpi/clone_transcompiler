public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int left = K - 1 ;
  int right = N - K ;
  int num1 = left * right * 6 ;
  int num2 = ( left + right ) * 3 ;
  int num3 = 1 ;
  int ans = ( num1 + num2 + num3 ) / Math . pow ( N , 3 ) ;
  System . out . println ( ans ) ;
  return ans ;
}
