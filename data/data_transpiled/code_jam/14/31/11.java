@ VisibleForTesting static String possible ( int q ) {
  for ( int i = 0 ;
  i < 41 ;
  i ++ ) {
    if ( q == 2 * i ) {
      return true ;
    }
  }
  return false ;
}
