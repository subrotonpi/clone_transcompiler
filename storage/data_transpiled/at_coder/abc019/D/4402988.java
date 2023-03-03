static final int N = Integer . parseInt ( input ) {
  int dist = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . print ( "? " + ( ++ i ) + " " + ( i + 1 ) ) ;
    int rep = Integer . parseInt ( input ) ;
    if ( rep > dist ) {
      dist = rep ;
    }
  }
  return dist ;
}
