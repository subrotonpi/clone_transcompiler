public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] src = new int [ M ] [ N + 1 ] ;
  int [ ] imos = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    src [ i ] = new int [ s ] ;
    imos [ s - 1 ] ++ ;
    imos [ t ] -- ;
  }
  int cum = 0 ;
  int [ ] must = new int [ N + 1 ] ;
  must [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    cum += imos [ i ] ;
    must [ i ] = must [ i - 1 ] + ( cum == 1 ? 1 : 0 ) ;
  }
  int [ ] [ ] ans = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = src [ i ] ;
    int t = src [ i ] ;
    if ( must [ s - 1 ] == must [ t ] ) ans [ i ] = i + 1 ;
  }
  System . out . println ( ans . length ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}
