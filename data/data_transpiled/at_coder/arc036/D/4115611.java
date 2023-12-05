static final String print ( int n ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private int [ ] p = new int [ n ] ;
    private int [ ] r = new int [ n ] ;
    @ Override public int root ( int x ) {
      if ( p [ x ] == x ) {
        return x ;
      }
      else {
        p [ x ] = root ( p [ x ] ) ;
        return p [ x ] ;
      }
    }
    @ Override public int uni ( int x , int y ) {
      int x = root ( x ) ;
      int y = root ( y ) ;
      if ( ( x == y ) || ( x == y ) ) {
        return x ;
      }
      if ( r [ x ] < r [ y ] ) {
        p [ x ] = y ;
      }
      else {
        p [ y ] = x ;
        if ( r [ x ] == r [ y ] ) {
          r [ x ] ++ ;
        }
      }
      return x ;
    }
    @ Override public boolean same ( int x , int y ) {
      return root ( x ) == root ( y ) ;
    }
  }
  ) ;
  n = Integer . parseInt ( input ( ) ) ;
  int q = Integer . parseInt ( input ( ) ) ;
  UnionFind uf = new UnionFind ( 2 * n ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int w = Integer . parseInt ( input ( ) ) ;
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    int z = Integer . parseInt ( input ( ) ) ;
    if ( w == 1 ) {
      if ( z % 2 == 0 ) {
        uf . uni ( x - 1 , y - 1 ) ;
        uf . uni ( x - 1 + n , y - 1 + n ) ;
      }
      else {
        uf . uni ( x - 1 , y - 1 + n ) ;
        uf . uni ( x - 1 + n , y - 1 + n ) ;
      }
    }
    else {
      System . out . println ( uf . same ( x - 1 , y - 1 ) ? "YES" : "NO" ) ;
    }
  }
  return uf . same ( x - 1 , y - 1 ) ? "YES" : "NO" ;
}
