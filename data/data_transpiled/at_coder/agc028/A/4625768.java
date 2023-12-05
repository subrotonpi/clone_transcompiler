public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  @ SuppressWarnings ( "unused" ) int LEN = N * M / gcd ( N , M ) ;
  int p = LEN / N ;
  int q = LEN / M ;
  int lcm = p * q / M ;
  for ( int i = 0 ;
  i <= LEN / lcm ;
  i ++ ) {
    if ( S [ i * q ] != T [ i * p ] ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( LEN ) ;
  return LEN ;
}
