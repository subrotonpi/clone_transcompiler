@ VisibleForTesting static void fractions ( int n , int m ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = input . nextInt ( ) ;
  int t = input . nextInt ( ) ;
  int x = gcd ( n , m ) ;
  int l = n * m / gcd ( n , m ) ;
  for ( int i = 0 ;
  i < x ;
  i ++ ) {
    if ( s [ i * ( n / x ) ] != t [ i * ( m / x ) ] ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( l ) ;
}
