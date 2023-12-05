@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( ) {
  final LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  final int [ ] c = new int [ map . size ( ) ] ;
  final int [ ] d = new int [ map . size ( ) ] ;
  map . put ( 0 , 0 ) ;
  map . put ( 1 , 1 ) ;
  map . put ( 2 , 2 ) ;
  map . put ( 3 , 3 ) ;
  map . put ( 4 , 4 ) ;
  map . put ( 5 , 5 ) ;
  map . put ( 6 , 6 ) ;
  map . put ( 7 , 7 ) ;
  map . put ( 8 , 8 ) ;
  map . put ( 9 , 9 ) ;
  map . put ( 10 , 11 ) ;
  map . put ( 11 , 11 ) ;
  map . put ( 12 , 11 ) ;
  map . put ( 13 , 11 ) ;
  map . put ( 14 , 11 ) ;
  map . put ( 15 , 11 ) ;
  map . put ( 16 , 11 ) ;
  map . put ( 17 , 11 ) ;
  map . put ( 17 , 11 ) ;
  map . put ( 18 , 11 ) ;
  map . put ( 19 , 11 ) ;
  map . put ( 19 , 11 ) ;
  map . put ( 19 , 11 ) ;
  map . put ( 19 , 11 ) ;
  map . put ( 20 , 11 ) ;
  final int n = map . size ( ) , k = map . size ( ) ;
  final int [ ] s = map . keySet ( ) . toArray ( ) ;
  final int [ ] t = new int [ n ] ;
  final int l = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = map . get ( i ) ;
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    c [ s [ i ] ] ++ ;
    d [ s [ i ] ] ++ ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ s [ i ] ] -- ;
    for ( int j = 0 ;
    j < l ;
    j ++ ) {
      if ( d [ j ] > 0 ) {
        d [ j ] -- ;
        final int sc = score ( n - i - 1 ) ;
        if ( k >= sc ) {
          if ( s [ i ] == j ) {
            t [ i ] = j ;
            break ;
          }
          else if ( k > sc ) {
            k -- ;
            t [ i ]