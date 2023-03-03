@ VisibleForTesting static int solve ( ) {
  for ( int j : xrange ( l , h + 1 ) ) {
    boolean good = true ;
    for ( int i : L ) {
      if ( j % i != 0 && i % j != 0 ) {
        good = false ;
        break ;
      }
    }
    if ( good ) {
      return j ;
    }
  }
  return Integer . parseInt ( "NO" ) ;
}
