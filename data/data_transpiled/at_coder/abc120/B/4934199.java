public static int [ ] getDigits ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ 200 ] ;
  for ( int i = 1 ;
  i <= 200 ;
  i ++ ) {
    if ( a % i == 0 && b % i == 0 ) {
      ans [ k ] = i ;
    }
  }
  return ans ;
}
