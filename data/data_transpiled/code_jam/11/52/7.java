static boolean check ( int [ ] c , int m ) {
  int T = 10002 ;
  for ( int x : xrange ( T ) ) {
    if ( ! c [ x ] ) continue ;
    for ( int i : xrange ( m ) ) {
      if ( x + i >= T || ! c [ x + i ] ) return false ;
      c [ x + i ] -- ;
    }
  }
  {
    int [ ] a = ArrayUtil . newIntArray ( Integer . parseInt ( readLine ( ) ) ) ;
    int n = a [ 0 ] ;
    a = a [ 1 ] ;
    int l = 0 , r = n + 1 ;
    int [ ] b = new int [ T ] ;
    for ( int x : a ) b [ x ] ++ ;
    int [ ] q = new int [ T ] ;
    if ( n == 0 ) return false ;
    int m = 10 * 10 ;
    for ( int i : xrange ( 1 , T ) ) for ( int j : xrange ( b [ i - 1 ] - b [ i ] ) ) m = Math . min ( m , i - q . pop ( ) ) ;
    for ( int j : xrange ( b [ i ] - b [ i - 1 ] ) ) q [ j ] = i ;
    return m == 0 ;
  }
  int t = input ( ) ;
  for ( int i : xrange ( t ) ) System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  return true ;
}
