static void print ( int n , int k , int q ) {
  int [ ] a = ( int [ ] ) input . split ( " " ) ;
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int [ ] p = new int [ n ] , s = 0 , f = 1 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( a [ j ] >= i && f > 0 ) {
        s = j ;
        f = 0 ;
      }
      else if ( a [ j ] < i && f - 1 ) {
        if ( j - s >= k ) {
          for ( int j2 = Arrays . copyOfRange ( a , s , j ) ;
          j2 < j - s - k + 1 ;
          j2 ++ ) p [ j2 ] = j ;
        }
        f = 1 ;
      }
    }
    if ( f - 1 && n - s >= k ) {
      for ( int j2 = Arrays . copyOfRange ( a , s , n ) ;
      j2 < n - s - k + 1 ;
      j2 ++ ) p [ j2 ] = j ;
    }
    if ( p . length >= q ) ans = Math . min ( ans , new Integer ( p [ q - 1 ] - i ) ) ;
  }
  System . out . println ( ans ) ;
}
