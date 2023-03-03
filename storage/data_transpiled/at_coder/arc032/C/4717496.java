public static void solve ( int n , List < Integer > list ) {
  int [ ] tl = new int [ n ] ;
  Collections . sort ( list ) ;
  int p = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int a = list . get ( i ) ;
    int b = list . get ( i ) ;
    int j = list . get ( j ) ;
    if ( p == 0 || b <= p ) {
      tl [ i ] = a ;
      p = a ;
    }
  }
  int [ ] ans = new int [ tl . length ] ;
  Arrays . fill ( ans , INF ) ;
  int k = tl . length - 1 ;
  p = 0 ;
  int ta = tl [ k ] ;
  int tb = 0 < k ? tl [ k - 1 ] : MAX_T ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = list . get ( i ) ;
    int b = list . get ( i ) ;
    int j = list . get ( j ) ;
    if ( ta < a ) {
      k -- ;
      ta = tl [ k ] ;
      tb = 0 < k ? tl [ k - 1 ] : MAX_T ;
      p = np ;
    }
    if ( p == 0 || p <= a ) {
      if ( b <= tb ) {
        if ( j < ans [ k ] ) {
          ans [ k ] = j ;
          np = b ;
        }
      }
    }
  }
  Collections . reverse ( ans ) ;
  System . out . println ( ans . length ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
}
