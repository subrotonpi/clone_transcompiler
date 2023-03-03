public static void print ( int n ) {
  int [ ] li = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) li [ i ] = input . nextInt ( ) ;
  int [ ] march = {
    0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( li [ i ] == 'M' ) march [ 0 ] ++ ;
      if ( li [ i ] == 'A' ) march [ 1 ] ++ ;
      if ( li [ i ] == 'R' ) march [ 2 ] ++ ;
      if ( li [ i ] == 'C' ) march [ 3 ] ++ ;
      if ( li [ i ] == 'H' ) march [ 4 ] ++ ;
    }
    int cnt = 0 ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < 4 ;
      k ++ ) {
        for ( int l = k + 1 ;
        l < 5 ;
        l ++ ) {
          cnt += march [ j ] * march [ k ] * march [ l ] ;
        }
      }
    }
    System . out . println ( cnt ) ;
  }
  