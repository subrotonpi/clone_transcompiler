public static boolean isPrime ( int n ) {
  final boolean w ;
  if ( n == 1 ) {
    w = false ;
  }
  else {
    final int n2 = ( int ) Math . sqrt ( n ) + 1 ;
    w = true ;
    for ( int i = 2 ;
    i < n2 ;
    i ++ ) {
      if ( n % i == 0 ) {
        w = false ;
      }
    }
  }
  return w ;
}
