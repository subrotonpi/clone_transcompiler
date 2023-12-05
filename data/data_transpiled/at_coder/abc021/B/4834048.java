public static void print ( int N ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( i ) ;
  }
  if ( Sets . newHashSet ( P . toArray ( new Integer [ 0 ] ) + Arrays . asList ( a ) + Arrays . asList ( b ) ) . size ( ) == K + 2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
