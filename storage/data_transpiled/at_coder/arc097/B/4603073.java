public static void unite ( int N , int M ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    int x = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    int y = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    int [ ] pls = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) pls [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) - 1 ;
    int [ ] par = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) par [ i ] = i ;
    int [ ] rank = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) rank [ i ] = 1 ;
  }
  {
    int x = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int y = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    if ( x == y ) {
    }
    else {
      if ( rank [ x ] > rank [ y ] ) {
        par [ y ] = x ;
        rank [ x ] += rank [ y ] ;
      }
    }
  }
}
