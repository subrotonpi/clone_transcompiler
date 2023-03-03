@ org . junit . experimental . theories . DataPoint public static void calc ( int numLines , String [ ] line ) {
  int i ;
  boolean ok = true ;
  while ( ok ) {
    ok = false ;
    for ( i = 0 ;
    i < line . length ;
    i ++ ) {
      int f = line [ i ] . indexOf ( "#" ) ;
      if ( f >= 0 ) {
        if ( i == line . length - 1 || f == line [ i ] . length ( ) - 1 || line [ i ] . substring ( f , f + 2 ) . compareTo ( "##" ) != 0 || line [ i + 1 ] . substring ( f , f + 2 ) . compareTo ( "##" ) != 0 ) {
          System . out . println ( "Impossible" ) ;
          return ;
        }
        line [ i ] = line [ i ] . substring ( 0 , f ) + "/\\" + line [ i ] . substring ( f + 2 ) ;
        line [ i + 1 ] = line [ i ] . substring ( 0 , f ) + "\\/" + line [ i + 1 ] . substring ( f + 2 ) ;
        ok = true ;
        break ;
      }
    }
  }
  for ( String l : line ) {
    System . out . println ( l ) ;
  }
  /* Get the ints */
  int [ ] ints = new int [ numLines ] ;
  for ( i = 0 ;
  i < numLines ;
  i ++ ) {
    ints [ i ] = Integer . parseInt ( l ) ;
  }
  int numTestCases = ints [ 0 ] ;
  for ( int i = 0 ;
  i < numTestCases ;
  i ++ ) {
    int numLines = ints [ i ] ;
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    int result = calc ( numLines , Arrays . asList ( line ) ) ;
  }
}
