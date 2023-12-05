@ VisibleForTesting static int [ ] [ ] floyd_warshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] s = new double [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) s [ i ] [ 0 ] = ( 0 == i ) ;
  return s ;
}
