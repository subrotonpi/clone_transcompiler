public static void do ( int [ ] n ) {
  Map < Integer , Boolean > exists = Maps . newHashMap ( ) ;
  for ( int x = xrange ( 10 ) ;
  x > 0 ;
  x -- ) {
    exists . put ( n [ x ] , Boolean . TRUE ) ;
    if ( n [ x - 1 ] < n [ x ] ) break ;
  }
  else return ;
  for ( int m = xrange ( n [ x - 1 ] + 1 , 10 ) ;
  m > 0 ;
  m -- ) {
    if ( exists . get ( m ) ) break ;
  }
  for ( int p = xrange ( x , n . length ) ;
  p > 0 ;
  p -- ) {
    if ( n [ p ] == m ) {
      n [ p ] = n [ x - 1 ] ;
      break ;
    }
  }
  Arrays . sort ( n , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  return ;
}
int t = Integer . parseInt ( readLine ( ) ) ;
for ( int _t = xrange ( 1 , t + 1 ) ;
_t <= t ;
_t ++ ) {
  n = new int [ n . length ] ;
  for ( n = new int [ n . length - 22 ] ;
  n [ n . length - 22 ] < 21 ;
  n [ n . length - 22 ] ++ ) n [ n . length - 22 ] = Integer . parseInt ( String . valueOf ( do ( n ) ) ) ;
  int k = Integer . parseInt ( String . valueOf ( do ( n ) ) ) ;
  System . out . println ( "Case #" + _t + ": " + k ) ;
}
