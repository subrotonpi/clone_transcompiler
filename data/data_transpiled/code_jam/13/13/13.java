public static void run ( ) {
  int [ ] a = new int [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) a [ i ] = Integer . parseInt ( readLine ( ) ) ;
  boolean [ ] v = new boolean [ 10000 ] ;
  for ( int i = 2 ;
  i < 6 ;
  i ++ ) for ( int j = 2 ;
  j < 6 ;
  j ++ ) for ( int k = 2 ;
  k < 6 ;
  k ++ ) {
    v [ 1 ] = true ;
    v [ i ] = true ;
    v [ j ] = true ;
    v [ k ] = true ;
    v [ i * j * k ] = true ;
    v [ i * j * k ] = true ;
    v [ i * j * k ] = true ;
    v [ j * k * k ] = true ;
    if ( v [ a [ 0 ] ] && v [ a [ 1 ] ] && v [ a [ 2 ] ] && v [ a [ 3 ] ] ) {
      System . out . println ( i + " " + j + " " + k ) ;
      return ;
    }
  }
  readLine ( ) ;
  System . out . println ( "Case #1:" ) ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  while ( t -- > 0 ) {
    run ( ) ;
  }
}
