@ Function public static LinkedHashMap < Integer , Integer > map ( ) {
  String s = list ( input ) ;
  int x = Integer . parseInt ( list ( input ) ) ;
  int y = Integer . parseInt ( list ( input ) ) ;
  int X [ ] = new int [ s . length ( ) ] ;
  int Y [ ] = new int [ s . length ( ) ] ;
  String judge = "x" ;
  int l = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'F' ) {
      l ++ ;
    }
    else {
      if ( judge . equals ( "x" ) ) {
        if ( l != 0 ) X [ i ] = l ;
        judge = "y" ;
      }
      else {
        if ( l != 0 ) Y [ i ] = l ;
        judge = "x" ;
      }
      l = 0 ;
    }
  }
  if ( judge . equals ( "x" ) ) {
    if ( l != 0 ) X [ i ] = l ;
  }
  else {
    if ( l != 0 ) Y [ i ] = l ;
  }
  String jj = "bad" ;
  if ( s . length ( ) >= 2 ) {
    if ( s . charAt ( 0 ) == 'T' ) {
      jj = "good" ;
    }
  }
  Map < Integer , Integer > dx = new HashMap < Integer , Integer > ( ) ;
  if ( X . size ( ) != 0 ) {
    if ( jj . equals ( "good" ) ) {
      dx . put ( X [ 0 ] , 1 ) ;
      dx . put ( - X [ 0 ] , 1 ) ;
    }
    else {
      dx . put ( X [ 0 ] , 1 ) ;
    }
    X . remove ( X [ 0 ] ) ;
  }
  else {
    dx . put ( 0 , 1 ) ;
  }
  for ( int i = 0 ;
  i < X . length ( ) ;
  i ++ ) {
    Map < Integer , Integer > D = new HashMap < Integer , Integer > ( ) ;
    for ( int j : dx . keySet ( ) ) {
      if ( dx . get ( j ) == 1 ) {
        D . put ( j + X [ i ] , 1 ) ;
        D . put ( j - X [ i ] , 1 ) ;
      }
    }
    dx = D ;
  }
  Map < Integer , Integer > dy = new HashMap < Integer , Integer > ( ) ;
  if ( Y . size ( ) != 0 ) {
    dy . put (