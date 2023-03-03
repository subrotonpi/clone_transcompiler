public static int nnext ( String u ) {
  u = u . toString ( ) ;
  int [ ] l = new int [ u . length ( ) ] ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( u . substring ( i , i + 1 ) ) ;
  }
  for ( int i = 1 ;
  i < l . length ;
  i ++ ) {
    l [ i ] = Math . max ( l [ i ] , l [ i - 1 ] ) ;
  }
  return Integer . parseInt ( Arrays . toString ( l ) ) ;
  /* search for number of numbers */
  if ( nnext ( n ) == n ) return n ;
  int lo = 1 ;
  int hi = n ;
  lo = 1 ;
  while ( hi - lo > 1 ) {
    int mi = ( lo + hi ) / 2 ;
    if ( nnext ( mi ) > n ) hi = mi ;
    else lo = mi ;
  }
  assert ( nnext ( lo ) < n && nnext ( nnext ( lo ) + 1 ) > n ) ;
  /* search for number of numbers */
  int t = Integer . parseInt ( input ( ) ) ;
  for ( int tc = 1 ;
  tc <= t ;
  tc ++ ) {
    System . out . print ( "Case #" + tc + ": " ) ;
    int n = Integer . parseInt ( input ( ) ) ;
    System . out . println ( search ( n ) ) ;
  }
  return t ;
}
