public static int N ( int x , int N ) {
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  x = Math . min ( x , N - x ) ;
  int [ ] rem = {
    N - x , x }
    ;
    int len = x ;
    int ans = N ;
    int i = 1 ;
    do {
      i = ( i + 1 ) % 2 ;
      ans += 2 * ( rem [ i ] / len ) * len ;
      rem [ i ] = rem [ i ] % len ;
      if ( rem [ i ] != 0 ) {
        len = rem [ i ] ;
      }
      else {
        break ;
      }
    }
    while ( i < N ) ;
    return ans - len ;
  }
  