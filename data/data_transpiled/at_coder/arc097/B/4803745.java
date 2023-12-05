public static void UnionFind ( ) {
  class UnionFind {
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int x ;
    int y ;
    public int find ( int x ) {
      if ( par [ x ] == x ) {
        return x ;
      }
      else {
        par [ x ] = find ( par [ x ] ) ;
        return x ;
      }
    }
    void union ( int x , int y ) {
      x = find ( x ) ;
      y = find ( y ) ;
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
      }
      else {
        par [ y ] = x ;
      }
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
    void sameCheck ( int x , int y ) {
    }
    int N = Integer . parseInt ( input ( ) ) ;
    int M = Integer . parseInt ( input ( ) ) ;
    int [ ] p = new int [ M ] ;
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) {
      p [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    int [ ] [ ] pair = new int [ M ] [ M ] ;
    for ( int i = 0 ;
    i < pair . length ;
    i ++ ) {
      pair [ i ] = pair [ i ] [ 0 ] ;
    }
    UnionFind uf = new UnionFind ( N + 1 ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < pair . length ;
    i ++ ) {
      uf . union ( pair [ i ] [ 0 ] , pair [ i ] [ 1 ] ) ;
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( uf . find ( i ) == uf . find ( p [ i ] ) ) ans ++ ;
    }
    System . out . println ( ans ) ;
  }
  