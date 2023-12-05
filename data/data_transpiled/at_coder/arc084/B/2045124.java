static final int [ ] [ ] dijkstra ( int s ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] j = new int [ k ] [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    j [ i ] = new int [ k ] ;
    j [ i ] [ 0 ] = ( new Tuple [ ] {
      ( i * 10 ) % k , 0 }
      ) ;
      j [ i ] [ 1 ] = ( new Tuple [ ] {
        ( i + 1 ) % k , 1 }
        ) ;
      }
      double [ ] minCost = new double [ k ] ;
      Arrays . fill ( minCost , Double . MAX_VALUE ) ;
      return dijkstra ( s ) ;
    }
    