public static int K = Integer . parseInt ( input ) {
  int [ ] a = {
    1 , 1 }
    ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      a [ 0 ] += a [ a . length - 1 ] ;
      a = a [ 0 ] ;
    }
    return a [ a . length - 1 ] + 1 + a [ 0 ] ;
  }
  