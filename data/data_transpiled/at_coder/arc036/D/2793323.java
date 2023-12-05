private static int n ( int q ) {
  int [ ] ws = new int [ q ] ;
  for ( int i = 0 ;
  i < ws . length ;
  i ++ ) ws [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Integer > union = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    union . put ( i , i ) ;
  }
  HashMap < Integer , Integer > odds = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    odds . put ( i , null ) ;
  }
  /* root */
  if ( union . get ( i ) == n ) {
    return i ;
  }
  union . put ( i , union . get ( i ) ) ;
  /* root */
  for ( int w = 1 ;
  i <= ws . length ;
  w ++ ) {
    int x = ws [ w ] ;
    int y = ws [ w ] ;
    int z = ws [ w ] ;
    int rx = x , ry = y , z = z ;
    if ( w == 2 ) {
      System . out . println ( rx == ry ? "YES" : "NO" ) ;
    }
    else if ( z % 2 == 0 ) {
      union . put ( rx , ry ) ;
      if ( odds . get ( rx ) != null && odds . get ( ry ) != null ) {
        union . put ( root ( odds . get ( rx ) ) , root ( odds . get ( ry ) ) ) ;
      }
      else {
        odds . put ( rx , odds . get ( ry ) == null ? odds . get ( rx ) : odds . get ( ry ) ) ;
      }
    }
    else {
      odds . put ( rx , odds . get ( rx ) == null ? ry : odds . get ( rx ) ) ;
      odds . put ( ry , odds . get ( ry ) == null ? rx : odds . get ( ry ) ) ;
      union . put ( rx , root ( odds . get ( ry ) ) ) ;
      union . put ( ry , root ( odds . get ( rx ) ) ) ;
    }
  }
  return union . size ( ) ;
}
