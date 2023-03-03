public static boolean isPrime ( int n ) {
  if ( n < 2 || ( n & 1 ) == 0 ) return false ;
  for ( int i = 3 ;
  i <= ( int ) ( n * ( 1 / 2 ) ) ;
  i ++ ) {
    if ( n % i == 0 ) return false ;
  }
  return true ;
}
