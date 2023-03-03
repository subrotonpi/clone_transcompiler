private static int [ ] readLine ( ) {
  return Arrays . stream ( new Scanner ( System . in ) . nextLine ( ) . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* prod the l */
  double m = 1 ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) m *= l [ i ] ;
  /* print the line */
  int r = readInt ( ) ;
  int n = readInt ( ) ;
  int m = readInt ( ) ;
  int k = readInt ( ) ;
  int [ ] [ ] xs = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xs = new int [ n ] ;
  for ( int j = 2 ;
  j <= m ;
  j ++ ) for ( int y = 0 ;
  y < xs [ 0 ] . length ;
  y ++ ) xs [ j ] = ys [ j ] = xs [ j ] + 1 ;
  ks = new int [ m ] ;
  kxs = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) kxs [ i ] = new int [ m ] ;
  j = 0 ;
  for ( int i = 0 ;
  i < xs . length ;
  i ++ ) {
    int [ ] [ ] vals = new int [ xs [ i ] . length ] ;
    for ( int j = 0 ;
    j < xs [ i ] . length ;
    j ++ ) vals [ j ] = xs [ i ] [ j ] + vals [ i ] ;
    for ( int j = 0 ;
    j < vals . length ;
    j ++ ) {
      int k = prod ( vals [ j ] ) ;
      if ( ks [ k ] > 0 ) ks [ k ] ++ ;
      else ks [ k ] = 1 ;
      if ( kxs [ j ] [ k ] > 0 ) kxs [ j ] [ k ] ++ ;
      else kxs [ j ] [ k ] = 1 ;
    }
    j ++ ;
  }
  System . out . println ( "Case #1:" ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    double [ ] prob = new double [ xs . length ] ;
    int [ ] given = readInt ( ) ;
    for ( int k = 0 ;
    k < given . length ;
    k ++ ) {
      for ( int j = 0 ;
      j < xs . length ;
      j ++ ) {
        prob [ k ] *=