@ VisibleForTesting static boolean [ ] [ ] solve ( int [ ] [ ] pos ) {
  Scanner input = new Scanner ( System . in ) ;
  int t = input . nextInt ( ) ;
  for ( int [ ] w : sol ) {
    int c = 0 ;
    for ( int [ ] w2 : sol ) {
      if ( w != w2 ) {
        for ( int u = 0 ;
        u < w . length ;
        u ++ ) {
          if ( w [ u ] == w2 [ u ] == true ) {
            return false ;
          }
        }
      }
      else {
        c ++ ;
      }
    }
    if ( c != Integer . MAX_VALUE ) {
      return false ;
    }
  }
  return true ;
}
