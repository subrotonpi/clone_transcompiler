public static int N = Integer . parseInt ( input ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    P . add ( i ) ;
  }
  P . add ( a ) ;
  P . add ( b ) ;
  if ( P . size ( ) == Collections . disjoint ( P ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return P . size ( ) ;
}
