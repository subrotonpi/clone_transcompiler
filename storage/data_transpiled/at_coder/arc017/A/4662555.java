static boolean isPrime ( int n ) {
  final int n2 = ( int ) Math . sqrt ( n ) + 1 ;
  boolean w = true ;
  for ( int i = 2 ;
  i < n2 ;
  i ++ ) {
    if ( n % i == 0 ) {
      w = false ;
      break ;
    }
  }
  return w ;
}
