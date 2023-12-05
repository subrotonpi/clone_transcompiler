private static int [ ] primeTable ( int n ) {
  boolean [ ] list = new boolean [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list [ i ] = true ;
  }
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( list [ i ] ) {
      int j = i * 2 ;
      while ( j <= n ) {
        list [ j ] = false ;
        j += i ;
      }
    }
  }
  int [ ] table = primeTable ( 55555 ) ;
  int [ ] table_ = new int [ N ] ;
  for ( int i = 0 ;
  i < table . length ;
  i ++ ) {
    if ( table [ i ] % 5 == 1 ) {
      table_ [ i ] = table [ i ] ;
    }
  }
  System . out . println ( "" ) ;
  return table ;
}
