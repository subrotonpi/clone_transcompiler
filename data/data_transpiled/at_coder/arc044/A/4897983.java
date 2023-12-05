@ GwtIncompatible ( "java.util.Scanner" ) public static boolean isPrime ( int n ) {
  if ( n <= 1 ) {
    return false ;
  }
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      return false ;
    }
  }
  return true ;
}
