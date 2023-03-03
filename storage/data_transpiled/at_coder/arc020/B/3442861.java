static void n ( int c , int ... v ) {
  int [ ] [ ] a = new int [ 11 ] [ 2 ] ;
  int [ ] [ ] b = new int [ 11 ] [ 2 ] ;
  for ( int i = 0 ;
  i < 11 ;
  i ++ ) a [ i ] [ 0 ] = i ;
  for ( int i = 0 ;
  i < 11 ;
  i ++ ) b [ i ] [ 0 ] = i ;
  for ( int t = v . length ;
  t > 2 ;
  t -- ) b [ t ] [ 0 ] = i ;
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
  if ( a [ 0 ] [ 1 ] == b [ 0 ] [ 1 ] ) i = n - max ( a [ 0 ] [ 0 ] + b [ 1 ] [ 0 ] , a [ 1 ] [ 0 ] + b [ 0 ] [ 0 ] ) ;
  else i = n - a [ 0 ] [ 0 ] - b [ 0 ] [ 0 ] ;
  System . out . println ( i * c ) ;
}
