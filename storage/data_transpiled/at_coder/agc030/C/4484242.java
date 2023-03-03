public static void run ( int K ) {
  int nMax = 500 ;
  int n = 0 ;
  int [ ] [ ] trouts = new int [ K ] [ ] ;
  if ( K <= nMax ) {
    n = K ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) trouts [ i ] = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) trouts [ i ] [ i ] = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) trouts [ i ] [ i ] = new int [ K ] ;
    for ( int i = 1 ;
    i <= nMax ;
    i ++ ) c1 [ i ] = i ;
    int [ ] c2 = new int [ nMax + 1 ] ;
    for ( int i = 2 ;
    i <= change ;
    i ++ ) c2 [ i ] = i ;
    for ( int i = nMax + 1 ;
    i <= nMax * 2 ;
    i ++ - change ) if ( change > 0 ) c2 [ i ] += 1 ;
    for ( int i = 0 ;
    i < nMax ;
    i ++ ) {
      int shift = ( i / 2 ) * 2 ;
      if ( i % 2 == 0 ) trouts [ i ] [ 0 ] = c1 [ shift ] + c1 [ 0 ] ;
      else trouts [ i ] [ 1 ] = c2 [ shift ] + c2 [ 0 ] ;
    }
  }
  /* main code */
  K = Integer . parseInt ( input ( ) ) ;
  n = run ( K ) ;
  trouts = new int [ n ] [ ] ;
  System . out . println ( n ) ;
  for ( int i = 0 ;
  i < trouts . length ;
  i ++ ) System . out . println ( Arrays . toString ( trouts [ i ] ) ) ;
}
