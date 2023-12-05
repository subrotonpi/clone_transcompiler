public static String solve ( HashMap < String , HashSet < String >> comb , HashMap < String , HashSet < String >> opp , String [ ] L ) {
  ArrayList < String > curL = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    String s = L [ i ] ;
    if ( curL . size ( ) > 0 ) {
      String new = curL . get ( curL . size ( ) - 1 ) + s ;
      if ( comb . containsKey ( new ) ) {
        curL . set ( comb . get ( new ) ) ;
        continue ;
      }
      String new = s + curL . get ( curL . size ( ) - 1 ) ;
      if ( comb . containsKey ( new ) ) {
        curL . set ( comb . get ( new ) ) ;
        continue ;
      }
    }
    if ( opp . containsKey ( s ) ) {
      HashSet < String > set = new HashSet < String > ( curL ) ;
      if ( set . containsAll ( opp . get ( s ) ) ) {
        curL . clear ( ) ;
        continue ;
      }
    }
    curL . add ( s ) ;
  }
  /* pp(L); */
  String [ ] line = new String [ L . length ] ;
  int r = input . nextInt ( ) ;
  for ( int i = 1 ;
  i <= r ;
  i ++ ) {
    line = input . next ( ) ;
    comb . clear ( ) ;
    opp . clear ( ) ;
    int c = 0 ;
    for ( int j = 0 ;
    j < Integer . parseInt ( line [ c ] ) ;
    j ++ ) {
      String triple = line [ j + c + 1 ] ;
      comb . put ( triple . substring ( 0 , 2 ) , triple . substring ( 2 ) ) ;
    }
    c = 1 + comb . size ( ) ;
    for ( int j = 0 ;
    j < Integer . parseInt ( line [ c ] ) ;
    j ++ ) {
      String pair = line [ j + c + 1 ] ;
      opp . put ( pair . substring ( 0 , 2 ) , opp . getOrDefault ( pair . substring ( 0 , 2 ) , HashSet . < String > newHashSet ( ) ) ) ;
      opp . put ( pair . substring ( 1 , 2 ) , opp . getOrDefault ( pair . substring ( 1 , 2 ) , HashSet . < String > newHashSet ( ) ) ) ;
    }
    L [ i ] = line [ L . length - 1 ] ;
    System . out . println ( "