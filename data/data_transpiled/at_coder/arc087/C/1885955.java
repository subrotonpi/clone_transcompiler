@ VisibleForTesting static int solve ( int l , List < List < String >> ss ) {
  int xor = 0 ;
  for ( int d = Math . min ( ss . size ( ) , l + 1 ) ;
  d <= l ;
  d ++ ) {
    List < String > sl = ss . get ( d ) ;
    Collections . sort ( sl ) ;
    while ( sl . size ( ) > 0 ) {
      String s = sl . remove ( sl . size ( ) - 1 ) ;
      String ps = s . substring ( 0 , s . length ( ) - 1 ) ;
      ss . get ( d + 1 ) . add ( ps ) ;
      if ( s . charAt ( s . length ( ) - 1 ) == '1' && sl . isEmpty ( ) && sl . isEmpty ( ) ) {
        sl . remove ( sl . size ( ) - 1 ) ;
      }
      else {
        xor ^= d & - d ;
      }
    }
  }
  return xor ;
}
