@ GwtIncompatible ( "java.util.Arrays" ) private static int [ ] [ ] sh0 ( int [ ] a ) {
  int i ;
  int p ;
  for ( i = xrange ( a . length ) ;
  i >= 0 ;
  i -- ) {
    p = nextInt ( i , a . length - 1 ) ;
    a [ i ] = a [ p ] ;
  }
  /* sh */
  for ( i = xrange ( a . length ) ;
  i >= 0 ;
  i -- ) {
    p = nextInt ( a . length - 1 ) ;
    a [ i ] = a [ p ] ;
  }
  /* sh */
  for ( i = xrange ( a . length ) ;
  i >= 0 ;
  i -- ) {
    p = nextInt ( a . length - 1 ) ;
    a [ i ] = a [ p ] ;
  }
  /* sh */
  int N = 1000 ;
  int [ ] [ ] CNT = new int [ N ] [ N ] ;
  for ( i = xrange ( N ) ;
  i >= 0 ;
  i -- ) CNT [ i ] = new int [ N ] ;
  for ( i = xrange ( N ) ;
  i >= 0 ;
  i -- ) for ( i = xrange ( N ) ;
  i >= 0 ;
  i -- ) CNT [ i ] [ i ] ++ ;
  if ( i % 100 == 99 ) System . out . println ( >> System . err ) ;
  System . out . println ( i + " " ) ;
  for ( i = xrange ( N ) ;
  i >= 0 ;
  i -- ) System . out . println ( Arrays . toString ( CNT [ i ] ) ) ;
  return null ;
}
