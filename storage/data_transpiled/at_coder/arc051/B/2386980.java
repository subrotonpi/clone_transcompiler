public static int k ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] fibs = {
    1 , 1 }
    ;
    for ( int i = 0 ;
    i < k - 1 ;
    i ++ ) {
      fibs [ i ] = fibs [ i ] + fibs [ i + 1 ] ;
    }
    return fibs [ fibs . length - 2 ] + fibs [ fibs . length - 1 ] ;
  }
  