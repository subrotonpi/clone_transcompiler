public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] hoge = new int [ n ] [ n ] ;
  int [ ] [ ] huga = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) hoge [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) huga [ i ] = new int [ n ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 1 + n - m ;
  i ++ ) {
    for ( int j = 0 ;
    j < 1 + n - m ;
    j ++ ) {
      int flag = 0 ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        for ( int l = 0 ;
        l < m ;
        l ++ ) {
          if ( ( hoge [ i + k ] [ j + l ] != huga [ k ] [ l ] ) ) flag ++ ;
        }
      }
      if ( ( flag == 0 ) && ( ans == 0 ) ) ans ++ ;
    }
  }
  if ( ( ans == 0 ) && ( hoge [ 0 ] [ 0 ] != hoge [ 0 ] [ 0 ] ) && ( hoge [ 0 ] [ 0 ] != huga [ 0 ] [ 0 ] ) ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
}
