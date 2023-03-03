public static int [ ] [ ] count ( int hidari , int kosuu ) {
  if ( kosuu <= r ) return Math . abs ( 400 - hidari ) ;
  else if ( kosuu <= r + g ) return Math . abs ( 500 - hidari ) ;
  else return Math . abs ( 600 - hidari ) ;
  double [ ] [ ] dp = new double [ r + g + b + 1 ] [ 1002 ] ;
  for ( int i = 0 ;
  i < 1002 ;
  i ++ ) dp [ i ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < 1002 ;
  i ++ ) for ( int k = 1 ;
  k <= r + g + b ;
  k ++ ) dp [ i ] [ k ] = Math . min ( dp [ i - 1 ] [ k - 1 ] + count ( i , k ) , dp [ i - 1 ] [ k ] ) ;
  System . out . println ( dp [ dp . length - 1 ] [ dp [ dp . length - 1 ] ] ) ;
  return dp ;
}
