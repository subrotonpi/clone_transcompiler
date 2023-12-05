public static int n = Integer . parseInt ( input ) {
  int [ ] p = new int [ n + 1 ] ;
  int [ ] x = new int [ n + 1 ] ;
  int i ;
  int l , r , d ;
  for ( i = 0 ;
  i < m ;
  i ++ ) {
    l = Integer . parseInt ( input . readLine ( ) ) ;
    r = Integer . parseInt ( input . readLine ( ) ) ;
    d = Integer . parseInt ( input . readLine ( ) ) ;
    pl = find ( p [ i ] ) ;
    pr = find ( r ) ;
    if ( pl == pr && x [ r ] - x [ l ] != d ) {
      System . out . println ( "No" ) ;
      break ;
    }
    else {
      p [ pr ] = pl ;
      x [ pr ] = x [ l ] + d - x [ r ] ;
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return p [ i ] ;
}
