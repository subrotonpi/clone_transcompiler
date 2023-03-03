public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] L = new int [ N ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    int cnt = 0 ;
    for ( int j = 0 ;
    j < L . length ;
    j ++ ) {
      if ( i != j ) {
        if ( L [ i ] % L [ j ] == 0 ) {
          cnt ++ ;
        }
      }
    }
    if ( cnt % 2 == 1 ) {
      ans += 1 / 2 ;
    }
    else {
      ans += ( cnt + 2 ) / ( 2 * cnt + 2 ) ;
    }
  }
  System . out . println ( ans ) ;
}
