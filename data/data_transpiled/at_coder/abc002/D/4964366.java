public static int [ ] [ ] createList ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  boolean [ ] [ ] e = new boolean [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    e [ i ] [ 0 ] = i == j ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    e [ x - 1 ] [ y - 1 ] = 1 ;
    e [ y - 1 ] [ x - 1 ] = 1 ;
  }
  int a = 0 ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) {
    int t = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i >> j & 1 ) {
        for ( int k = 0 ;
        k < n ;
        k ++ ) {
          if ( i >> k & 1 ) {
            if ( ! e [ j ] [ k ] ) {
              break ;
            }
          }
        }
      }
      else {
        t ++ ;
        continue ;
      }
      break ;
    }
    a = Math . max ( a , t ) ;
  }
  System . out . println ( a ) ;
  return e ;
}
