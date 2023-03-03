public static int [ ] getNegativeInstances ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int max = Math . max ( a , b ) ;
  int [ ] ans = new int [ max ] ;
  for ( int i = 1 ;
  i <= max ;
  i ++ ) {
    if ( a % i == 0 && b % i == 0 ) {
      ans [ i ] = i ;
    }
  }
  return ans ;
}
