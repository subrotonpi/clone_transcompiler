* t , T = Integer . parseInt , V = Integer . parseInt ( input . readLine ( ) ) ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] x = new int [ n ] , y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    y [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  /* Distance between the x and y */
  double ans = ( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) ) * ( 1 / 2 ) ;
  /* Distance between the x and y */
  double d = distance ( t [ 0 ] , t [ 1 ] , t [ 2 ] , t [ 3 ] ) ;
  int i = 0 ;
  while ( i < n ) {
    if ( distance ( t [ 0 ] , t [ 1 ] , x [ i ] , y [ i ] ) + distance ( t [ 2 ] , t [ 3 ] , x [ i ] , y [ i ] ) <= T * V ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    else {
      i ++ ;
    }
  }
  if ( i == n ) System . out . println ( "NO" ) ;
  return x [ i ] ;
}
