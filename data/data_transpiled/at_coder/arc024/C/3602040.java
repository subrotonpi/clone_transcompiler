static void print ( int n , int k ) {
  String s = input . substring ( 0 , n ) ;
  if ( n < k * 2 ) System . out . println ( "NO" ) ;
  else {
    int [ ] [ ] x = new int [ 26 ] [ n ] , t = new int [ k ] ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) t [ ( s . charAt ( i ) - 97 ) ] ++ ;
    x [ k ] = new int [ ] {
      t [ k - 1 ] }
      ;
      for ( int i = k ;
      i < n ;
      i ++ ) {
        t [ ( s . charAt ( i - k ) - 97 ) ] -- ;
        t [ ( s . charAt ( i ) - 97 ) ] ++ ;
        x [ k ] [ i ] = new int [ ] {
          t [ k ] , i }
          ;
        }
        Arrays . sort ( x ) ;
        int i = 0 , f = 0 ;
        while ( i < n - k ) {
          for ( int j = i + 1 ;
          j <= n - k ;
          j ++ ) {
            if ( x [ i ] [ 0 ] != x [ j ] [ 0 ] ) {
              i = j ;
              break ;
            }
            else if ( x [ j ] [ 1 ] - x [ i ] [ 1 ] >= k ) {
              f = 1 ;
              break ;
            }
            else if ( j == n - k ) i = n - k ;
          }
          if ( f ) break ;
        }
        if ( f ) System . out . println ( "YES" ) ;
        else System . out . println ( "NO" ) ;
      }
    }
    