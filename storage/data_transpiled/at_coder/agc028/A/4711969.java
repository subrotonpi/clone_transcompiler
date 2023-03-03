@ VisibleForTesting static int gcd ( int n , int m ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = input . nextInt ( ) ;
  int t = input . nextInt ( ) ;
  int g = gcd ( n , m ) ;
  for ( int i = 0 ;
  i < g ;
  i ++ ) {
    if ( s [ n / g * i ] != t [ m / g * i ] ) {
      System . out . println ( - 1 ) ;
      break ;
    }
  }
  return n * m / g ;
}
