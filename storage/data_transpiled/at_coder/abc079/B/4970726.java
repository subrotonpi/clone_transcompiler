public static int N = Integer . parseInt ( input ) {
  int [ ] ryukasu = {
    2 , 1 }
    ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      ryukasu [ i ] = ryukasu [ i - 1 ] + ryukasu [ i - 2 ] ;
    }
    System . out . println ( ryukasu [ ryukasu . length - 1 ] ) ;
    return ryukasu [ ryukasu . length - 1 ] ;
  }
  