public static int N ( ) {
  int [ ] dp = new int [ 100001 ] ;
  dp [ 0 ] = Double . MAX_VALUE ;
  dp [ 1 ] = 0 ;
  int [ ] L = {
    1 , 6 , 36 , 216 , 1296 , 7776 , 46656 , 9 , 81 , 729 , 6561 , 59049 }
    ;
    for ( int i = 2 ;
    i < 100001 ;
    i ++ ) {
      for ( int j = 0 ;
      j < L . length ;
      j ++ ) {
        if ( i - L [ j ] >= 0 ) {
          dp [ i ] = Math . min ( dp [ i - L [ j ] ] + 1 , dp [ i ] ) ;
        }
      }
    }
    System . out . println ( dp [ N ] ) ;
    return N ;
  }
  