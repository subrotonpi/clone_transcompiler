static final int [ ] getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private int [ ] p = new int [ n ] ;
    private int [ ] r = new int [ n ] ;
    private int [ ] d = new int [ n ] ;
    @ Override public int root ( int x ) {
      if ( p [ x ] == x ) {
        return x ;
      }
      else {
        int tmp = root ( p [ x ] ) ;
        d [ x ] += d [ p [ x ] ] ;
        p [ x ] = tmp ;
        return p [ x ] ;
      }
    }
    @ Override public int weight ( int x ) {
      root ( x ) ;
      return d [ x ] ;
    }
    @ Override public int diff ( int x , int y ) {
      return weight ( y ) - weight ( x ) ;
    }
    @ Override public boolean uni ( int x , int y , int w ) {
      if ( same ( x , y ) && diff ( x , y ) != w ) return false ;
      w += weight ( x ) ;
      w -= weight ( y ) ;
      int x = root ( x ) ;
      int y = root ( y ) ;
      if ( ( x == y ) || ( x == y ) ) return false ;
      if ( r [ x ] < r [ y ] ) {
        p [ x ] = y ;
        d [ x ] = - w ;
      }
      else {
        p [ y ] = x ;
        d [ y ] = w ;
        if ( r [ x ] == r [ y ] ) r [ x ] ++ ;
      }
      return true ;
    }
    @ Override public boolean same ( int x , int y ) {
      return root ( x ) == root ( y ) ;
    }
  }
  ) ;
  n = Integer . parseInt ( input ( ) ) ;
  m = Integer . parseInt ( input ( ) ) ;
  P_UnionFind uf = new P_UnionFind ( n ) ;
  d = new int [ n ] ;
  d [ 0 ] = - 1 ;
  int [ ] data = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    if ( uf . uni ( a - 1 , b - 1 , c ) == false ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
  