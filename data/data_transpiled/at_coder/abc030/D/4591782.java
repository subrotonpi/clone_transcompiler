public static int solve ( String input , int N ) {
  int k , a ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  Arrays . sort ( b ) ;
  int [ ] [ ] rb = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rb [ i ] [ 0 ] = i ;
  }
  Arrays . sort ( rb ) ;
  int [ ] cmp = new int [ N ] ;
  int [ ] [ ] g = new int [ N ] [ N ] ;
  boolean [ ] used = new boolean [ N ] ;
  int [ ] li = new int [ N ] ;
  {
    dfs ( i ) ;
    used [ i ] = true ;
    int t = b [ i ] [ 0 ] ;
    if ( ! used [ t ] ) {
      dfs ( t ) ;
    }
    li [ i ] = i ;
  }
  {
    dfs ( i ) ;
    used [ i ] = true ;
    cmp [ i ] = c ;
    g [ -- i ] [ 0 ] = i ;
    for ( int t : rb [ i ] ) {
      if ( ! used [ t ] ) {
        rdfs ( t , c ) ;
      }
    }
  }
  {
    scc ( ) ;
    used = new boolean [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ! used [ i ] ) {
        dfs ( i ) ;
      }
    }
    used [ i ] = false ;
    int c = 0 ;
    for ( int i = li . length ;
    i -- > 0 ;
    ) {
      if ( ! used [ li [ i ] ] ) {
        g [ i ] = new int [ N ] ;
        rdfs ( li [ i ] , c ) ;
        g [ -- i ] = g [ i ] [ 0 ] ;
        c ++ ;
      }
    }
    return c ;
  }
  {
    if ( used [ s ] || k == 0 ) {
      int p = cmp [ s ] ;
      return g [ p ] [ ( k + g [ p ] . indexOf ( s ) ) % g [ p ] . length ] ;
    }
    used [ s ] = true ;
    return solve ( b [ s ] , k - 1 ) ;
  }
}
