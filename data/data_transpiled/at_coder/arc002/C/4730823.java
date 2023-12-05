public static int calc ( int n ) {
  int [ ] C = new int [ n ] ;
  String Lis = "ABXY" ;
  /* calc(int[] L, int[] R) */
  int [ ] dp = {
    0 , 1 }
    ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( C [ i - 1 ] == L [ 0 ] && C [ i ] == L [ 1 ] && dp [ i ] != dp [ i - 1 ] ) {
        dp [ i ] = dp [ i ] ;
      }
      else if ( C [ i - 1 ] == R [ 0 ] && C [ i ] == R [ 1 ] && dp [ i ] != dp [ i - 1 ] ) {
        dp [ i ] = dp [ i ] ;
      }
      else {
        dp [ i ] = dp [ i ] + 1 ;
      }
    }
    int cou = n ;
    for ( int a = 0 ;
    a < n ;
    a ++ ) {
      for ( int b = 0 ;
      b < n ;
      b ++ ) {
        for ( int c = 0 ;
        c < n ;
        c ++ ) {
          for ( int d = 0 ;
          d < n ;
          d ++ ) {
            if ( a == c && b == d ) {
              continue ;
            }
            int L = a + b ;
            int R = c + d ;
            int re = calc ( L , R ) ;
            cou = Math . min ( re , cou ) ;
          }
        }
      }
    }
    System . out . println ( cou ) ;
    return cou ;
  }
  