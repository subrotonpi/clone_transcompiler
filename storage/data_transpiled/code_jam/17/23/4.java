public static int [ ] dijkstra ( int n , int [ ] [ ] d , int i ) {
  boolean done [ ] = new boolean [ n ] ;
  int [ ] result = new int [ n ] ;
  Arrays . fill ( result , - 1 ) ;
  result [ i ] = 0 ;
  while ( i >= 0 ) {
    done [ i ] = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( d [ i ] [ j ] > 0 && ( result [ j ] < 0 || result [ i ] + d [ i ] [ j ] < result [ j ] ) ) {
        result [ j ] = result [ i ] + d [ i ] [ j ] ;
      }
    }
    i = - 1 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ! done [ j ] && result [ j ] > 0 && ( i < 0 || result [ j ] < result [ i ] ) ) {
        i = j ;
      }
    }
  }
  for ( int x = 1 ;
  x <= Integer . parseInt ( input ( ) ) ;
  x ++ ) {
    n = Integer . parseInt ( input ( ) ) ;
    int q = Integer . parseInt ( input ( ) ) ;
    int [ ] e = new int [ n ] ;
    int [ ] s = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int e_ = Integer . parseInt ( input ( ) ) ;
      int s_ = Integer . parseInt ( input ( ) ) ;
      e [ j ] = e_ ;
      s [ j ] = s_ ;
    }
    d = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      d [ j ] = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        int [ ] row = dijkstra ( n , d , j ) ;
        d2 [ j ] = 0 < row [ j ] ? new int [ ] {
          entry / s [ j ] }
          : - 1 ;
        }
      }
      int [ ] y = new int [ q ] ;
      for ( int j = 0 ;
      j < q ;
      j ++ ) {
        int u = Integer . parseInt ( input ( ) ) ;
        int v = Integer . parseInt ( input ( ) ) ;
        int [ ] row = dijkstra ( n , d2 , u - 1 ) ;
        y [ j ] = row [ v - 1 ] ;
      }
      System