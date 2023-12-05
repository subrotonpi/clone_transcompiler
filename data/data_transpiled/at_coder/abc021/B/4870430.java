public static void print ( int N ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( P ) ;
  Arrays . sort ( P ) ;
  Arrays . sort ( P ) ;
  if ( new HashSet < > ( Arrays . asList ( P ) ) . size ( ) == K + 2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
