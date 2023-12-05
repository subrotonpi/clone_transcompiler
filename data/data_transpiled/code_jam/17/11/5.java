public static List < String > spread ( List < String > row , String emptyIn , String emptyOut ) {
  for ( String v : row ) {
    if ( v . equals ( emptyIn ) ) {
      row . set ( 0 , v ) ;
      break ;
    }
  }
  else {
    return emptyOut ;
  }
  String prev = row . get ( 0 ) ;
  for ( int i = 1 ;
  i < row . size ( ) ;
  i ++ ) {
    if ( row . get ( i ) . equals ( emptyIn ) ) {
      row . set ( i , prev ) ;
    }
    else {
      prev = row . get ( i ) ;
    }
  }
  /* solve the grid */
  List < String > grid = Lists . transform ( row , new Function < String , String > ( ) {
    @ Override public String apply ( String row ) {
      return spread ( row , "?" , new String [ 0 ] ) ;
    }
  }
  ) ;
  grid = spread ( grid , new String [ 0 ] , null ) ;
  /* main */
  int t = Integer . parseInt ( input ( ) ) ;
  for ( int ti = 0 ;
  ti < t ;
  ti ++ ) {
    int r = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    List < String > grid = new ArrayList < String > ( r ) ;
    grid = solve ( grid ) ;
    System . out . println ( "Case #" + ( ti + 1 ) + ":" ) ;
    for ( String row : grid ) {
      System . out . println ( StringUtils . join ( row , "" ) ) ;
    }
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    /* main */
  }
  return grid ;
}
