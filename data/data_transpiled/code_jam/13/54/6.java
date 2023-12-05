@ Sys public static double getans ( String conf ) {
  if ( cost . containsKey ( conf ) ) return cost . get ( conf ) ;
  double ret = 0.0 ;
  for ( int i : xrange ( conf . length ( ) ) ) {
    int j = 0 ;
    while ( conf . charAt ( ( i + j ) % N ) == 'X' ) j ++ ;
    int p = ( i + j ) % N ;
    ret += 1.0 / conf . length ( ) * ( ( conf . length ( ) - j ) + getans ( conf , 0 , p ) + 'X' + conf . substring ( p + 1 ) ) ;
  }
  cost . put ( conf , ret ) ;
  return ret ;
}
