static final Scanner scan ( String [ ] args ) throws FileNotFoundException {
  InputStream in ;
  OutputStream out ;
  int t ;
  in = new FileInputStream ( args [ 0 ] ) ;
  out = new OutputStream ( System . out ) ;
  if ( args . length == 1 ) {
    in = new FileInputStream ( args [ 1 ] ) ;
    out = new PrintStream ( args [ 2 ] ) ;
  }
  else {
    System . out . println ( "Case #" + t ++ + ": YES" ) ;
  }
  int caseId = 1 ;
  int nb = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < nb ;
  i ++ ) {
    String l = in . readLine ( ) . trim ( ) ;
    int res = Math . min ( l , 0 ) ;
    for ( int e : l2 ) {
      if ( e != exc ) {
        System . out . println ( e ) ;
      }
    }
  }
  /* print lawn */
  for ( String l : in ) {
    System . out . println ( l ) ;
  }
  System . out . println ( ) ;
  /* lawn */
  boolean valid = false ;
  int minHeight = Math . min ( l , 0 ) ;
  int maxHeight = Math . max ( l , 0 ) ;
  while ( minHeight != maxHeight ) {
    int [ ] [ ] newLawn = new int [ sizex ] [ ] ;
    for ( int i = 0 ;
    i < sizex ;
    i ++ ) {
      newLawn [ i ] = new int [ sizey ] ;
    }
    int nextHeight = minExcept ( in , minHeight ) ;
    for ( int x = 0 ;
    x < sizex ;
    x ++ ) {
      String l = in . readLine ( ) . trim ( ) ;
      if ( Arrays . equals ( l , minHeight ) ) {
        for ( int y = 0 ;
        y < sizey ;
        y ++ ) {
          newLawn [ y ] [ x ] = nextHeight ;
        }
      }
    }
    for ( int y = 0 ;
    y < sizey ;
    y ++ ) {
      String l = in . readLine ( ) . trim ( ) ;
      if ( Arrays . equals ( l , minHeight ) ) {
        for ( int x = 0 ;
        x < sizex ;
        x ++ ) {
          newLawn [ y ] [ x ] = nextHeight ;
        }
      }
    }
    lines = newLawn ;
    int newMinHeight = Math . min ( l , minHeight ) ;
    if ( newMinHeight == minHeight ) {
      