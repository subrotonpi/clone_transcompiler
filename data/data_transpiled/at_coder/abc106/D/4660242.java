public static int [ ] [ ] readDistance ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  List < List < Integer >> dist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) dist . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  List < List < Integer >> query = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) query . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int [ ] [ ] coord = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) coord [ dist . get ( i ) . get ( 0 ) ] [ dist . get ( i ) . get ( 1 ) ] ++ ;
  int [ ] [ ] ruiseki = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= n ;
  j ++ ) ruiseki [ i ] [ j ] = coord [ i ] [ j ] + ruiseki [ i - 1 ] [ j ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= n ;
  j ++ ) ruiseki [ i ] [ j ] = ruiseki [ i ] [ j ] + ruiseki [ i ] [ j - 1 ] ;
  for ( int i = 0 ;
  i < query . size ( ) ;
  i ++ ) {
    int ans = ruiseki [ j ] [ j ] - ruiseki [ i - 1 ] [ j ] - ruiseki [ j ] [ i - 1 ] + ruiseki [ i - 1 ] [ i - 1 ] ;
    System . out . println ( ans ) ;
  }
  return dist . get ( 0 ) ;
}
