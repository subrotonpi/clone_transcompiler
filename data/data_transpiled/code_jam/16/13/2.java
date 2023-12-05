static final Scanner input = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return 10000 ;
  }
  @ Override public int sol ( int n , int [ ] f ) {
    int [ ] vis = new int [ n ] ;
    int res = 0 ;
    {
      int r ;
      int i = 0 ;
      int l = 0 ;
      {
        if ( vis [ i ] != 0 ) r = l - vis [ i ] ;
        else {
          vis [ i ] = l ;
          r = dfs ( f [ i ] , l + 1 ) ;
        }
        vis [ i ] = 2 * n ;
        return r ;
      }
    }
    @ Override public int dfs ( int i , int l ) {
      if ( ! vis [ i ] ) res = Math . max ( dfs ( i , 1 ) , res ) ;
      return 0 ;
    }
  }
  @ Override public int lc ( int i , int ii ) {
    int [ ] q = new int [ n ] ;
    int [ ] l = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      q [ j ] = i ;
      int [ ] l = new int [ n ] ;
      for ( int x : q ;
      x > 0 ;
      x -- ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( k == x && j != ii ) {
            q [ j ] = j ;
            l [ j ] = l [ x ] + 1 ;
          }
        }
      }
      return Math . max ( l , 0 ) ;
    }
    int np = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int i = j ;
      if ( f [ i ] == j && j < i ) np += lc ( i , j ) + lc ( j , i ) + 2 ;
    }
    return Math . max ( res , np ) ;
  }
}
