public static void print ( int N ) {
  int [ ] P = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    A [ i ] = 45678 * i ;
  }
  int [ ] B = A . clone ( ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    A [ p - 1 ] += P [ i ] ;
    B [ p - 1 ] += P [ i ] ;
  }
  System . out . println ( * A ) ;
  System . out . println ( * B ) ;
}
