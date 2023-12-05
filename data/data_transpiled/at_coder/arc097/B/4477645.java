public static int [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Integer . parseInt ( input ) - 1 ) ;
  }
  int [ ] rank = new int [ N ] ;
  int [ ] parent = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    parent [ i ] = i ;
  }
  /* find the first element */
  if ( parent [ N ] == parent [ N ] ) {
    return parent ;
  }
  /* same the first element */
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x == y ) return parent ;
  if ( rank [ x ] > rank [ y ] ) {
    rank [ y ] ++ ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    x = Integer . parseInt ( input ) ;
    y = Integer . parseInt ( input ) ;
  }
  int num = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    num += same ( i , P . get ( i ) ) ;
  }
  System . out . println ( num ) ;
  return P . toArray ( ) ;
}
