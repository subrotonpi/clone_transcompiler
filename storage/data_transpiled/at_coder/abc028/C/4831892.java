public static List < Integer > convert ( ) {
  A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < 5 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < 5 ;
      k ++ ) {
        l . add ( A . get ( i ) + A . get ( j ) + A . get ( k ) ) ;
      }
    }
  }
  Collections . sort ( l ) ;
  return l . get ( l . size ( ) - 3 ) ;
}
