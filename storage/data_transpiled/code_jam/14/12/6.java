@ Function public static < T , V > Function < T , V > rl ( Function < T , V > t ) {
  return t . apply ( input -> {
    V [ ] e = new V [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      e [ i ] = new V [ i ] ;
    }
    for ( int a = 0 ;
    a < n ;
    a ++ ) {
      e [ a ] [ i ] = new V ( ) ;
    }
    for ( int b = 0 ;
    b < n ;
    b ++ ) {
      e [ b ] [ i ] = new V ( ) ;
    }
    return t . apply ( i -> {
      V [ ] childs = e [ i ] ;
      for ( int j = 0 ;
      j < childs . length ;
      j ++ ) {
        if ( childs [ j ] != p ) {
          return childs [ j ] ;
        }
      }
      return i ;
    }
    ) ;
  }
  private int f ( int i , V p ) {
    List < V > childs = new ArrayList < V > ( ) ;
    for ( V j : childs ) {
      childs . add ( j ) ;
    }
    Collections . sort ( childs , Collections . reverseOrder ( ) ) ;
    int res = childs . get ( 0 ) + childs . get ( 1 ) + 1 ;
    return res ;
  }
  private int [ ] ds = new int [ n ] ;
  for ( int root = 0 ;
  root < n ;
  root ++ ) {
    ds [ root ] = f ( root , - 1 ) ;
  }
  return n - max ( ds ) ;
}
