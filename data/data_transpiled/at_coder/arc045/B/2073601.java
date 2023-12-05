public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] s = new int [ M ] ;
  int [ ] t = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    t [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] imos = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    imos [ s [ i ] ] ++ ;
    imos [ t [ i ] + 1 ] -- ;
  }
  for ( int i = 1 ;
  i <= N + 2 ;
  i ++ ) {
    imos [ i ] += imos [ i - 1 ] ;
  }
  for ( int i = 1 ;
  i <= N + 2 ;
  i ++ ) {
    if ( imos [ i ] > 1 ) {
      imos [ i ] = 0 ;
    }
  }
  for ( int i = 1 ;
  i <= N + 2 ;
  i ++ ) {
    imos [ i ] += imos [ i - 1 ] ;
  }
  ArrayList < Integer > res = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( imos [ t [ i ] ] == imos [ s [ i ] - 1 ] ) {
      res . add ( i + 1 ) ;
    }
  }
  System . out . println ( res . size ( ) ) ;
  for ( int r : res ) {
    System . out . println ( r ) ;
  }
  return res . toArray ( new Integer [ res . size ( ) ] [ ] ) ;
}
