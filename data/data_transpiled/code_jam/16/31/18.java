public static int tnum = Integer . parseInt ( readLine ( ) ) {
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] c = new int [ n ] ;
    for ( String s : readLine ( ) . split ( " " ) ) {
      c [ i ] = Integer . parseInt ( s ) ;
    }
    Map < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
    for ( int i = 0 ;
    i < c . length ;
    i ++ ) {
      c [ i ] = c [ i ] ;
    }
    System . out . println ( "Case #" + ( tcou + 1 ) + ":" ) ;
    do {
      for ( int p = 0 ;
      p < c . length ;
      p ++ ) {
        if ( map . get ( c [ p ] ) == 0 ) {
          map . remove ( c [ p ] ) ;
        }
      }
    }
    while ( c . length == 0 ) ;
    if ( max ( map . values ( ) ) > Integer . valueOf ( c . values ( ) ) ) {
      throw new IllegalStateException ( "What?" ) ;
    }
    if ( c . length == 2 ) {
      System . out . println ( ( ( Integer ) map . get ( c [ 0 ] ) ) . intValue ( ) + "" ) ;
      for ( int x = 0 ;
      x < c . length ;
      x ++ ) {
        c [ x ] -- ;
      }
      continue ;
    }
    int x = max ( map . values ( ) ) . intValue ( ) ;
    System . out . println ( x + "" ) ;
    c [ x ] -- ;
    continue ;
  }
  System . out . println ( ) ;
  return tcou ;
}
