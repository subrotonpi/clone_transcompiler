public static boolean isPrime ( int n ) {
  if ( n % 2 == 0 && n != 2 ) {
    return false ;
  }
  for ( int divisor = 2 ;
  divisor < n / 2 ;
  divisor ++ ) {
    if ( n % divisor == 0 ) {
      return false ;
    }
  }
  return true ;
}
if ( getClass ( ) . isEnum ( ) ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( isPrime ( N ) ? "YES" : "NO" ) ;
}
