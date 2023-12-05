@ SafeVarargs public static < T > boolean check ( T ... input ) {
  int [ ] [ ] rm = new int [ input . length ] [ input . length ] ;
  int [ ] cm = new int [ input . length ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    rm [ i ] = Math . max ( b [ i ] . length , rm [ i ] ) ;
    cm [ i ] = Math . max ( b [ i ] . length , cm [ i ] ) ;
  }
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < b [ 0 ] . length ;
    j ++ ) {
      if ( b [ i ] [ j ] < rm [ i ] && b [ i ] [ j ] < cm [ j ] ) {
        return false ;
      }
    }
  }
  return true ;
}
