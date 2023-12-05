static void partition ( ) {
  class Partition {
    int n ;
    int [ ] l = new int [ n ] ;
    {
      this . n = n ;
      l [ 0 ] = - 1 ;
    }
    public int rep ( int i ) {
      if ( l [ i ] < 0 ) {
        return i ;
      }
      else {
        int r = rep ( l [ i ] ) ;
        l [ i ] = r ;
        return r ;
      }
    }
    public void union ( int i , int j ) {
      int ir = rep ( i ) ;
      int jr = rep ( j ) ;
      if ( ir == jr ) return ;
      if ( l [ ir ] < l [ jr ] ) {
        l [ jr ] = ir ;
      }
      else if ( l [ ir ] > l [ jr ] ) {
        l [ ir ] = jr ;
      }
      else {
        l [ ir ] += l [ jr ] ;
        l [ jr ] = ir ;
      }
      n -- ;
    }
    public int size ( ) {
      return n ;
    }
  }
  int [ ] primes = new int [ 2 ] ;
  if ( n == 2 ) return new int [ ] {
    2 }
    ;
    else if ( n < 2 ) return new int [ 2 ] ;
    int [ ] s = new int [ 3 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    double mroot = n * 0.5 ;
    double half = ( n + 1 ) / 2 - 1 ;
    int i = 0 ;
    int m = 3 ;
    while ( m <= mroot ) {
      if ( s [ i ] != 0 ) {
        int j = ( m * m - 3 ) / 2 ;
        s [ j ] = 0 ;
        while ( j < half ) {
          s [ j ] = 0 ;
          j += m ;
        }
      }
      i = i + 1 ;
      m = 2 * i + 3 ;
    }
    if ( n == 2 ) {
      synchronized ( System . in ) {
        System . out . println ( "Case #" + i + ": " + p . size ( ) ) ;
      }
    }
    else {
      System . out . println ( "Case #" + i + ": " + p . size ( ) ) ;
    }
  }
  