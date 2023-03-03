public static int N = Integer . parseInt ( input ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > P = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] counts = new int [ K ] ;
  for ( int i = 0 ;
  i < P . size ( ) ;
  i ++ ) {
    counts [ i ] = P . stream ( ) . mapToInt ( P :: indexOf ) . sum ( ) ;
  }
  if ( P . contains ( a ) || P . contains ( b ) ) {
    System . out . println ( "NO" ) ;
  }
  else if ( max ( counts ) > 1 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return counts [ 0 ] ;
}
