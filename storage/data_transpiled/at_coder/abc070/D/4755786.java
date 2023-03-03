@ Nonnull public static int [ ] distances ( @ Nonnull int [ ] [ ] tree , int treeSize , int root ) {
  int [ ] dists = new int [ treeSize ] ;
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( new Integer ( root ) ) ;
  q . add ( new Integer ( - 1 ) ) ;
  q . add ( new Integer ( 0 ) ) ;
  while ( ! q . isEmpty ( ) ) {
    int v = q . poll ( ) ;
    int prev = q . poll ( ) ;
    int d2v = q . poll ( ) ;
    dists [ v ] = d2v ;
    for ( int i = 0 ;
    i < tree [ v ] . length ;
    i ++ ) {
      int u = tree [ v ] [ i ] ;
      int dv2u = tree [ v ] [ i ] ;
      if ( prev == u ) continue ;
      q . add ( new Integer ( u ) ) ;
      int d = distances ( tree , N , K - 1 ) ;
      return Arrays . copyOf ( d , d ) ;
    }
  }
  return new int [ ] {
  }
  ;
}
