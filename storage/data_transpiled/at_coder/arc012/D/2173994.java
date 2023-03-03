public static int N ( int N , int T , int mod ) {
  int [ ] P = new int [ T + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    x = Math . abs ( x ) ;
    y = Math . abs ( y ) ;
    if ( T < x + y || ( T - x - y ) % 2 == 1 ) {
      System . out . println ( 0 ) ;
      exit ( 0 ) ;
    }
    int m = ( T - x - y ) / 2 ;
    P [ 1 ] -= 2 ;
    P [ x + m + 1 ] ++ ;
    P [ T - ( x + m ) + 1 ] ++ ;
    P [ m + 1 ] ++ ;
    P [ T - m + 1 ] ++ ;
    P [ T + 1 ] -= 2 ;
  }
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    P [ i ] += P [ i - 1 ] ;
  }
  P [ 1 ] = 0 ;
  for ( int x = 2 ;
  x <= T ;
  x ++ ) {
    int y = x ;
    int i = 2 ;
    while ( i * i <= y ) {
      if ( y % i == 0 ) {
        int cnt = 0 ;
        while ( y % i == 0 ) {
          y /= i ;
          cnt ++ ;
        }
        P [ i ] += P [ x ] * cnt ;
      }
      i ++ ;
    }
    if ( 1 < y && y < x ) {
      P [ y ] += P [ x ] ;
    }
    if ( y < x ) {
      P [ x ] = 0 ;
    }
  }
  int ans = 1 ;
  for ( int x = 2 ;
  x <= T ;
  x ++ ) {
    if ( P [ x ] > 0 ) {
      ans = ( ans * Math . pow ( x , P [ x ] , mod ) ) % mod ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
