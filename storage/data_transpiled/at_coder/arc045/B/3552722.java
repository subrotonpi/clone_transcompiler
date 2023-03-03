public static int [ ] getans ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] f = new int [ n + 2 ] ;
  int [ ] ss = new int [ m ] ;
  int [ ] tt = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    f [ s ] ++ ;
    f [ t + 1 ] -- ;
    ss [ i ] = s ;
    tt [ i ] = t ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) f [ i ] += f [ i - 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) f [ i ] = f [ i ] == 1 ? 1 : 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) f [ i ] += f [ i - 1 ] ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( f [ ss [ i ] - 1 ] - f [ tt [ i ] ] == 0 ) ans . add ( i + 1 ) ;
  }
  System . out . println ( ans . size ( ) ) ;
  for ( int i : ans ) {
    System . out . println ( i ) ;
  }
  return ans . toArray ( new Integer [ ans . size ( ) ] ) ;
}
