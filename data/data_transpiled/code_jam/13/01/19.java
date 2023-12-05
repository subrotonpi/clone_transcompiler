{
  pos = new Position [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    pos [ i ] [ 0 ] = i ;
    pos [ i ] [ 1 ] = j ;
  }
  int [ ] [ ] rows = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    rows [ i ] [ 0 ] = i ;
  }
  int [ ] [ ] cols = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    cols [ i ] [ 1 ] = j ;
  }
  int [ ] [ ] diags = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    diags [ i ] [ 0 ] = i ;
  }
  int [ ] [ ] diags = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    diags [ i ] [ 1 ] = i ;
  }
  int tnum = input . nextInt ( ) ;
  {
    String s ;
    do {
      s = readLine ( ) ;
      if ( s . length ( ) > 2 ) {
        return s ;
      }
    }
    while ( s . length ( ) > 2 ) ;
  }
  for ( int num = 0 ;
  num < tnum ;
  num ++ ) {
    String [ ] [ ] tbl = new String [ 4 ] [ 4 ] ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      tbl [ i ] [ 0 ] = tbl [ i ] [ 1 ] ;
      tbl [ i ] [ 1 ] = tbl [ i ] [ 2 ] ;
    }
    boolean xwon = false ;
    boolean ywon = false ;
    boolean finished = true ;
    for ( int t = 0 ;
    t < wins . length ;
    t ++ ) {
      Set < String > chars = new HashSet < String > ( ) ;
      for ( String s : wins [ t ] ) {
        chars . add ( tbl [ t ] [ 0 ] ) ;
      }
      if ( chars . contains ( "X" ) ) {
        xwon = true ;
      }
      if ( chars . contains ( "O" ) ) {
        ywon = true ;
      }
      if ( chars . contains ( "." ) ) {
        finished = false ;
      }
    }
    String answer = "Game has not completed" ;
    if ( xwon || ywon || finished ) {
      if ( xwon ) {
        answer = "