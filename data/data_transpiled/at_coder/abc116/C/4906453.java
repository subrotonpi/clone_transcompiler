static void solve ( int N , @ Nonnull List < Integer > h ) {
  int cost = 0 ;
  int [ ] CUR = new int [ h . size ( ) ] ;
  for ( int i = 0 ;
  i < CUR . length ;
  i ++ ) {
    CUR [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < CUR . length ;
  i ++ ) {
    while ( CUR [ i ] != h . get ( i ) ) {
      int l = i ;
      int r = i ;
      for ( int j = i ;
      j < CUR . length ;
      j ++ ) {
        if ( CUR [ i ] >= h . get ( j ) ) {
          break ;
        }
        r ++ ;
      }
      int grow = 10 * 16 ;
      for ( int j = l ;
      j < r ;
      j ++ ) {
        grow = Math . min ( grow , h . get ( j ) - CUR [ j ] ) ;
      }
      for ( int j = l ;
      j < r ;
      j ++ ) {
        CUR [ j ] += grow ;
      }
      cost += grow ;
    }
  }
  System . out . println ( cost ) ;
  return ;
}
