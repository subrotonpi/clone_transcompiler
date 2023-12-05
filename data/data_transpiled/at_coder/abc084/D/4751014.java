@ VisibleForTesting static int [ ] getQueries ( ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  Tuple [ ] queries = new Tuple [ Q ] ;
  for ( int i = 0 ;
  i < queries . length ;
  i ++ ) queries [ i ] = Tuple . parse ( input . nextLine ( ) ) ;
  int [ ] total = new int [ Q ] ;
  boolean [ ] prime = new boolean [ Q ] ;
  for ( int i = 2 ;
  i < 100001 ;
  i ++ ) {
    for ( int j = i * 2 ;
    j < 100001 ;
    j += i ) {
      prime [ j ] = false ;
    }
  }
  for ( int i = 1 ;
  i < 50000 ;
  i ++ ) {
    int n = 2 * i + 1 ;
    total [ i ] = total [ i - 1 ] + ( int ) ( prime [ n ] ? prime [ ( n + 1 ) / 2 ] : false ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = queries [ i ] . left , r = queries [ i ] . right ;
    if ( l == 1 ) {
      System . out . println ( total [ ( r - 1 ) / 2 ] ) ;
    }
    else {
      System . out . println ( total [ ( r - 1 ) / 2 ] - total [ ( l - 1 ) / 2 - 1 ] ) ;
    }
  }
  return total ;
}
