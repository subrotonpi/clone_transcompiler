{
  A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    A . add ( new LinkedList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( A . get ( i ) == A . get ( j + 1 ) ) {
      }
    }
  }
  return A ;
}
