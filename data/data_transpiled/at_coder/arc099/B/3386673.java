public static int K = Integer . parseInt ( input ) {
  ArrayList < Integer > al = new ArrayList < Integer > ( ) ;
  /* sums the number of digits in the range of 0 */
  int s = 0 ;
  int old = i ;
  while ( i > 0 ) {
    s += i % 10 ;
    i = i / 10 ;
  }
  /* sums the number of digits in the range of 0 */
  for ( int i = 1 ;
  i <= 1000 ;
  i ++ ) {
    al . add ( i ) ;
  }
  for ( int j = 4 ;
  j <= 16 ;
  j ++ ) {
    for ( int k = 100 ;
    k <= 1000 ;
    k ++ ) {
      al . add ( i * ( 10 * ( 10 * ( j - 3 ) ) + 10 * ( j - 3 ) - 1 ) ) ;
    }
  }
  ArrayList < Integer > ansList = new ArrayList < Integer > ( ) ;
  Collections . reverse ( al ) ;
  int maxs = 0 , maxi = 0 ;
  for ( int j = 0 ;
  j < al . size ( ) ;
  j ++ ) {
    if ( maxs * al . get ( j ) . intValue ( ) <= maxi * al . get ( j ) . intValue ( ) ) {
      ansList . add ( al . get ( j ) . intValue ( ) ) ;
      maxs = al . get ( j ) . intValue ( ) ;
      maxi = al . get ( j ) . intValue ( ) ;
    }
  }
  Collections . reverse ( ansList ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    System . out . println ( ansList . get ( i ) ) ;
  }
  return K ;
}
