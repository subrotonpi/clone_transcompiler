public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int a = 0 ;
  int k = l [ 0 ] ;
  if ( l [ 0 ] >= S && l [ 0 ] <= T ) {
    a ++ ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( k + l [ i + 1 ] >= S && k + l [ i + 1 ] <= T ) {
      a ++ ;
    }
    k += l [ i + 1 ] ;
  }
  return a ;
}
