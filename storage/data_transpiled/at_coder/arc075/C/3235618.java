static int n = ( int i ) -> {
  int k = ( i + 1 ) / 2 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) - k ;
  int [ ] [ ] b = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] [ 0 ] = b [ i - 1 ] [ 0 ] + a [ i ] ;
  Arrays . sort ( b ) ;
  int num = 1 , c [ 0 ] = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( b [ i ] [ 0 ] != b [ i - 1 ] [ 0 ] ) num ++ ;
    c [ i ] [ 1 ] = num ;
  }
  c = new int [ n + 2 ] ;
  d = new int [ n + 1 ] ;
  /* add to the list */
  while ( c [ 0 ] != 0 ) {
    d [ 0 ] ++ ;
    c [ 0 ] = c [ 1 ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = c [ i ] ;
    ans += get ( j ) ;
    /* add to the list */
  }
  System . out . println ( ans ) ;
}
